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

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.fansunion.bookshopping.domain.Book;
import cn.fansunion.bookshopping.service.BookService;

/**
 * 读取applicationContext.xml,测试spring是否配置成功了。
 * 
 * @author 雷文 2011-11-29
 * @since 1.0
 */
public class SpringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] location = { "applicationContext.xml" };
		ApplicationContext context = new ClassPathXmlApplicationContext(
				location);
		// testFind(context);
		testOrder(context);
	}

	/**
	 * @param context
	 */
	private static void testOrder(ApplicationContext context) {
		// TODO Auto-generated method stub

	}

	/**
	 * @param context
	 */
	private static void testFind(ApplicationContext context) {
		BookService bookService = (BookService) context
				.getBean("bookServiceImpl");
		List<Book> books = bookService.findByPage(1);

		if (books != null) {
			int size = books.size();
			for (int index = 0; index < size; index++) {
				Book book = books.get(index);
				System.out.println(book);
			}
		}

		books = bookService.findByPage(2);
		if (books != null) {
			int size = books.size();
			for (int index = 0; index < size; index++) {
				Book book = books.get(index);
				System.out.println(book);
			}
		}
		//
		books = bookService.findByPage(1, 1);
		if (books != null) {
			int size = books.size();
			for (int index = 0; index < size; index++) {
				Book book = books.get(index);
				System.out.println(book);
			}
		}
	}

}
