﻿/**
 * 项目名称: FansBookShopping
 * 版本号：1.0
 * 名字：雷文
 * QQ：240-370-818
 * 邮箱: LeiWen@FansUnion.cn
 * 
 * 小雷网: http://FansUnion.cn
 * CSDN:http://blog.csdn.net/FansUnion
 * 版权所有: 2011-2013,leiwen
 */
package cn.fansunion.bookshopping.service.impl;

import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.fansunion.bookshopping.dao.OrderItemDao;
import cn.fansunion.bookshopping.domain.Order;
import cn.fansunion.bookshopping.domain.OrderItem;
import cn.fansunion.bookshopping.exceptions.ServiceException;
import cn.fansunion.bookshopping.service.OrderService;
import cn.fansunion.bookshopping.util.WebConstants;

/**
 * 业务逻辑层。处理和订单相关的业务，实现了OrderService接口。
 * @author 雷文 2011-11-27
 * @since 1.0
 */
@Service
@Transactional(readOnly=true,propagation = Propagation.NOT_SUPPORTED)
public class OrderServiceImpl implements OrderService {

	private static final Logger LOG = Logger.getLogger(BookServiceImpl.class);

	@Resource
	private OrderItemDao orderDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.leiwen.bookshopping.service.OrderService#find(java.lang.Long)
	 */
	@Override
	public Order find(Integer orderId) throws ServiceException {
		return orderDao.find(orderId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.leiwen.bookshopping.service.OrderService#add(org.leiwen.bookshopping
	 * .domain.Order)
	 */
	@Override
	@Transactional(readOnly=false,propagation = Propagation.REQUIRED)
	public void add(Order order) throws ServiceException {
		try {
			LOG.info("Try to add a order.");
			Set<OrderItem> orderItems = order.getOrderItems();

			orderDao.getSession().save(order);

			for (OrderItem orderItem : orderItems) {
				orderItem.setOrder(order);
				orderDao.add(orderItem);
			}
			LOG.info("Add a order successfully.");
		} catch (RuntimeException re) {
			LOG.info("Add a order failed.");
			re.printStackTrace();
			throw new ServiceException("Add order failed.", re);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.leiwen.bookshopping.service.OrderService#findByPage(int)
	 */
	@Override
	public List<Order> findByPage(int pageIndex) throws ServiceException {
		List<Order> orders = null;
		try {
			LOG.info("Try to findByPage.");

			String sql = "select * from order2";
			Class<?> clazz = Order.class;
			int pageSize = WebConstants.ORDER_PAGE_SIZE;
			orders = orderDao.findByPage(sql, clazz, pageIndex, pageSize);

			LOG.info("findByPage order successfully.");
		} catch (RuntimeException re) {
			LOG.info("findByPage order failed." + pageIndex, re);
			throw new ServiceException("findByPage order failed.");
		}

		return orders;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.leiwen.bookshopping.service.OrderService#delete(long)
	 */
	@Override
	@Transactional(readOnly=false,propagation = Propagation.REQUIRED)
	public void delete(Integer orderId) {
		Order order = orderDao.find(orderId);
		Set<OrderItem> orderItems = order.getOrderItems();
		
		for (OrderItem orderItem : orderItems) {
			orderDao.delete(orderItem);
		}
	
		
		//delete(orderItems);
		//delete(order);

	}

	@Transactional(propagation = Propagation.REQUIRED)
	private void delete(Set<OrderItem> orderItems) {
		for (OrderItem orderItem : orderItems) {
			orderDao.delete(orderItem);
		}
	}

	private void delete(Order order) {
		orderDao.delete(order);
	}
}
