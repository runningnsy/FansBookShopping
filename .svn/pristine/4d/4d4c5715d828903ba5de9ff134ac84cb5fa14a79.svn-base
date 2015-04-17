/**
 * 项目名称: FansBookShopping
 * 版本号：1.0
 * 名字：雷文
 * QQ：240-370-818
 * 邮箱: LeiWen@FansUnion.cn
 * 
 * 小雷网:http://FansUnion.cn
 * CSDN:http://blog.csdn.net/FansUnion
 * 版权所有: 2011-2013,leiwen
 */
package cn.fansunion.bookshopping;

import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.fansunion.bookshopping.domain.Book;
import cn.fansunion.bookshopping.domain.Order;
import cn.fansunion.bookshopping.domain.OrderItem;
import cn.fansunion.bookshopping.service.BookService;
import cn.fansunion.bookshopping.service.OrderService;

/**
 * 单元测试：测试OrderService中的方法
 * @author 雷文 2011-11-27
 * @since 1.0
 */
public class OrderServiceTest extends TestCase {
	private ApplicationContext context;

	@Override
	public void setUp() {
		String[] locations = { "applicationContext.xml" };
		context = new ClassPathXmlApplicationContext(locations);
	}

	@Override
	public void tearDown() {

	}

	@Test
	public void testAdd() {
		OrderService orderService = (OrderService) context
				.getBean("orderServiceImpl");

		Order order = new Order();
		order.setPayStyle("在线支付");
		order.setReceiver("雷文");
		order.setStatus("已发货");
		
		BookService bookService = (BookService) context
				.getBean("bookServiceImpl");
		Book book = bookService.find(1);
		OrderItem orderItem = new OrderItem();
		orderItem.setBook(book);
		
		Book book2 = bookService.find(2);
		OrderItem orderItem2 = new OrderItem();
		orderItem2.setBook(book2);
		
		Set<OrderItem> orderItems = new HashSet<OrderItem>();
		orderItems.add(orderItem);
		orderItems.add(orderItem2);
		
		order.setOrderItems(orderItems);
		orderService.add(order);

		
		Integer orderId = order.getOrderId();
		System.out.println(orderId);

		// 查找书籍
		Order order2 = orderService.find(orderId);
		System.out.println(order);
		System.out.println(order2);

		// 断言
		Assert.assertEquals(order, order2);

		// 删除书籍
		orderService.delete(orderId);
		Order order3 = orderService.find(orderId);

		// 断言
		Assert.assertNull(order3);
	}

	
}