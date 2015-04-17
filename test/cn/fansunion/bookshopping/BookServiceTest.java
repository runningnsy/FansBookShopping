﻿/**
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

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.fansunion.bookshopping.domain.Book;
import cn.fansunion.bookshopping.domain.BookCategory;
import cn.fansunion.bookshopping.service.BookService;

/**
 * 单元测试：测试BookService中的方法
 * 
 * @author 雷文 2011-11-16
 * @since 1.0
 */
public class BookServiceTest extends TestCase {
	private ApplicationContext context;

	@Override
	public void setUp() {
		String[] locations = { "applicationContext.xml" };
		context = new ClassPathXmlApplicationContext(locations);

		System.out.println("getBeanDefinitionCount:"
				+ context.getBeanDefinitionCount());
	}

	@Override
	public void tearDown() {

	}

	@Test
	public void testAdd() {

		BookService bookService = (BookService) context
				.getBean("bookServiceImpl");

		Book book = new Book();
		book.setAuthor("fans");
		book.setName("java");
		book.setPress("中信出版社");
		BookCategory bookCategory = new BookCategory();
		bookCategory.setBookCategoryId(1);
		book.setBookCategory(bookCategory);

		// 增加书籍
		bookService.add(book);

		Integer bookId = book.getBookId();
		System.out.println(bookId);

		// 查找书籍
		Book book2 = bookService.find(bookId);
		System.out.println(book);
		System.out.println(book2);

		// 断言
		Assert.assertEquals(book, book2);

		// 删除书籍
		bookService.delete(book);
		Book book3 = bookService.find(bookId);

		// 断言
		Assert.assertNull(book3);
	}

	@Test
	public void testUpdate() {

		BookService bookService = (BookService) context
				.getBean("bookServiceImpl");

		Book book = new Book();
		book.setAuthor("fans");
		book.setName("java");
		book.setPress("中信出版社");
		BookCategory bookCategory = new BookCategory();
		bookCategory.setBookCategoryId(2);
		book.setBookCategory(bookCategory);

		// 增加书籍
		bookService.add(book);

		Integer bookId = book.getBookId();
		System.out.println(bookId);

		String author = "hello world!";
		book.setAuthor(author);
		bookService.update(book);

		// 查找书籍
		Book book2 = bookService.find(bookId);
		// 断言
		Assert.assertEquals(book2.getAuthor(), author);
		// 删除书籍，数据回滚
		bookService.delete(book2);

	}
}