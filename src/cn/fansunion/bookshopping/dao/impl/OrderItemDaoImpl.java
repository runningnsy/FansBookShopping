/**
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
package cn.fansunion.bookshopping.dao.impl;

import org.springframework.stereotype.Repository;

import cn.fansunion.bookshopping.dao.OrderItemDao;
import cn.fansunion.bookshopping.domain.Order;
import cn.fansunion.bookshopping.domain.OrderItem;

/**
 * 数据访问层。访问数据库中与订单表相关的信息，实现了OrderItemDao接口。
 * @author 雷文 2011-11-27
 * @since 1.0
 */
@Repository
public class OrderItemDaoImpl extends DaoSupportImpl implements OrderItemDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.leiwen.bookshopping.dao.OrderDao#find(org.leiwen.bookshopping.domain
	 * .Order)
	 */
	@Override
	public Order find(Integer orderId) {
		return (Order) getSession().get(Order.class, orderId);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.leiwen.bookshopping.dao.OrderDao#add(org.leiwen.bookshopping.domain
	 * .Order)
	 */
	@Override
	public void add(OrderItem orderItem) {
		try {
			getSession().save(orderItem);
			System.out.println("add orderItem");
		} catch (Exception r) {
			r.printStackTrace();
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.leiwen.bookshopping.dao.OrderDao#delete(org.leiwen.bookshopping.domain
	 * .Order)
	 */
	@Override
	public void delete(Order order) {
		getSession().delete(order);
	}

	/* (non-Javadoc)
	 * @see org.leiwen.bookshopping.dao.OrderItemDao#delete(org.leiwen.bookshopping.domain.OrderItem)
	 */
	@Override
	public void delete(OrderItem orderItem) {
		getSession().delete(orderItem);
	}

}
