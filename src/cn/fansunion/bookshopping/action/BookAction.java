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

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.fansunion.bookshopping.domain.Book;
import cn.fansunion.bookshopping.domain.BookCategory;
import cn.fansunion.bookshopping.exceptions.ServiceException;
import cn.fansunion.bookshopping.service.BookService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 处理和书有关的请求，如增加、更新、删除、查询 书籍。
 * 
 * @author 雷文 2011-11-12
 * @since 1.0
 */
@Scope("prototype")
@Controller
public class BookAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@Resource
	private BookService bookService;
	// 书的集合，容纳一页书
	private List<Book> books;
	// 书的分类集合
	private List<BookCategory> bookCategories;
	// 第几页
	private int pageIndex = 1;
	// 总的分页数
	private int pageCounter = 1;
	//
	private int left = 0;
	//
	private int right = 1;
	// 书的分类ID
	private long bookCategoryId;

	// 根据分页数初始化数据
	public String initBooksByPageIndex() throws ServiceException {
		bookCategories = bookService.findAllBookCategories();
		books = bookService.findByPage(pageIndex);
		return SUCCESS;
	}

	// 根据书的分类和分页数初始化数据
	public String initBooksByPageIndexAndCategory() throws ServiceException {
		 //初始化所有书籍分类
		bookCategories = bookService.findAllBookCategories();
		 //根据书的分类，分页信息查找书籍列表
		books = bookService.findByPage(pageIndex, bookCategoryId);
		//一共有多少条记录
		pageCounter = bookService.getPageCounter();
		//初始化分页信息
		initPagination();
		return SUCCESS;
	}

	// 首页初始化数据
	public String welcome() throws ServiceException {
		bookCategories = bookService.findAllBookCategories();
		books = bookService.findByPage(pageIndex);
		pageCounter = bookService.getPageCounter();
		initPagination();

		return SUCCESS;

	}

	// 根据当前页数pageIndex计算第1页和最后1页
	private void initPagination() {
		if (pageIndex - 3 >= 1) {
			left = pageIndex;
		} else {
			left = 1;
		}

		if (pageIndex + 3 <= pageCounter) {
			right = pageIndex + 3;
		} else {
			right = pageCounter;
		}
	}

	/**
	 * @return the books
	 */
	public List<Book> getBooks() {
		return books;
	}

	/**
	 * @param books
	 *            the books to set
	 */
	public void setBooks(List<Book> books) {
		this.books = books;
	}

	/**
	 * @return the pageIndex
	 */
	public int getPageIndex() {
		return pageIndex;
	}

	/**
	 * @param pageIndex
	 *            the pageIndex to set
	 */
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	/**
	 * @return the bookCategoryId
	 */
	public long getBookCategoryId() {
		return bookCategoryId;
	}

	/**
	 * @param bookCategoryId
	 *            the bookCategoryId to set
	 */
	public void setBookCategoryId(long bookCategoryId) {
		this.bookCategoryId = bookCategoryId;
	}

	/**
	 * @return the bookCategories
	 */
	public List<BookCategory> getBookCategories() {
		return bookCategories;
	}

	/**
	 * @param bookCategories
	 *            the bookCategories to set
	 */
	public void setBookCategories(List<BookCategory> bookCategories) {
		this.bookCategories = bookCategories;
	}

	/**
	 * @return the pageCounter
	 */
	public int getPageCounter() {
		return pageCounter;
	}

	/**
	 * @param pageCounter
	 *            the pageCounter to set
	 */
	public void setPageCounter(int pageCounter) {
		this.pageCounter = pageCounter;
	}

	/**
	 * @return the left
	 */
	public int getLeft() {
		return left;
	}

	/**
	 * @param left
	 *            the left to set
	 */
	public void setLeft(int left) {
		this.left = left;
	}

	/**
	 * @return the right
	 */
	public int getRight() {
		return right;
	}

	/**
	 * @param right
	 *            the right to set
	 */
	public void setRight(int right) {
		this.right = right;
	}

}
