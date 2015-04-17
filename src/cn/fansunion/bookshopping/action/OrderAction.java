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
package cn.fansunion.bookshopping.action;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.fansunion.bookshopping.domain.Book;
import cn.fansunion.bookshopping.domain.Order;
import cn.fansunion.bookshopping.domain.OrderItem;
import cn.fansunion.bookshopping.domain.User;
import cn.fansunion.bookshopping.service.BookService;
import cn.fansunion.bookshopping.service.OrderService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 处理和订单有关的请求，如增加、更新、删除、查询 订单。
 * 
 * @author 雷文 2011-11-12
 * @since 1.0
 */
@Scope("prototype")
@Controller
public class OrderAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private Integer bookId;
	@Resource
	private BookService bookService;
	@Resource
	private OrderService orderService;

	private Integer orderId;

	private Order order;

	public String addOrderItem() {
		Map<String, Object> session = ActionContext.getContext().getSession();
		Object obj = session.get("order");
		Order order = null;

		OrderItem orderItem = new OrderItem();
		Book book = bookService.find(bookId);
		orderItem.setBook(book);

		if (obj == null) {
			order = new Order();
		} else {
			order = (Order) obj;
		}
		order.getOrderItems().add(orderItem);
		session.put("order", order);
		this.order = order;
		return SUCCESS;
	}

	public String pay() {
		Map<String, Object> session = ActionContext.getContext().getSession();
		Object obj = session.get("order");
		Object user = session.get("user");
		if (obj == null) {

		} else {
			Order order = (Order) obj;
			order.setUser((User) user);
			orderService.add(order);
			// this.order = order;
			this.orderId = order.getOrderId();
			session.remove(order);
		}
		return SUCCESS;
	}

	public String find() {
		order = orderService.find(orderId);
		return SUCCESS;
	}

	/**
	 * @return the bookId
	 */
	public Integer getBookId() {
		return bookId;
	}

	/**
	 * @param bookId
	 *            the bookId to set
	 */
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	/**
	 * @return the order
	 */
	public Order getOrder() {
		return order;
	}

	/**
	 * @param order
	 *            the order to set
	 */
	public void setOrder(Order order) {
		this.order = order;
	}

	/**
	 * @return the orderId
	 */
	public Integer getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId
	 *            the orderId to set
	 */
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

}
