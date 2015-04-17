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

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import cn.fansunion.bookshopping.dao.BookDao;
import cn.fansunion.bookshopping.domain.Book;
import cn.fansunion.bookshopping.domain.BookCategory;
import cn.fansunion.bookshopping.util.WebConstants;

/**
 * 数据访问层。访问数据库中与书表相关的信息，实现了BookDao接口。
 * 
 * @author 雷文 2011-11-12
 * @since 1.0
 */
@Repository
public class BookDaoImpl extends DaoSupportImpl implements BookDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.leiwen.bookshopping.dao.BookDao#find(java.lang.Integer)
	 */
	@Override
	public Book find(Integer bookId) {
		return (Book) getSession().get(Book.class, bookId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.leiwen.bookshopping.dao.BookDao#add(org.leiwen.bookshopping.domain
	 * .Book)
	 */
	@Override
	public void add(Book book) {
		getSession().save(book);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.leiwen.bookshopping.dao.BookDao#update(org.leiwen.bookshopping.domain
	 * .Book)
	 */
	@Override
	public void update(Book book) {
		getSession().update(book);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.leiwen.bookshopping.dao.BookDao#delete(org.leiwen.bookshopping.domain
	 * .Book)
	 */
	@Override
	public void delete(Book book) {
		getSession().delete(book);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.leiwen.bookshopping.dao.BookDao#findAll()
	 */
	@Override
	public List<Book> findAll() {
		Query query = getSession().createSQLQuery("select * from book")
				.addEntity(Book.class);
		return query.list();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.leiwen.bookshopping.dao.BookDao#findAllBookCategories()
	 */
	@Override
	public List<BookCategory> findAllBookCategories() {
		Query query = getSession().createSQLQuery("select * from bookCategory")
				.addEntity(BookCategory.class);
		return query.list();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.leiwen.bookshopping.dao.BookDao#getPageCounter(java.lang.String,
	 * long)
	 */
	@Override
	public int getPageCounter(String sqlCounter, long bookCategoryId) {
		int pageCounter = 0;

		// 疑问：这个地方为什么不能增加.addEntity(Book.class),耗费了fans同学1个小时的时间呀
		// 经验的价值呀
		Query query = getSession().createSQLQuery(sqlCounter);
		query.setParameter(0, bookCategoryId);
		List list = query.list();
		if (list != null) {
			pageCounter = Integer.parseInt(list.get(0).toString());

			if (pageCounter % WebConstants.BOOK_PAGE_SIZE == 0) {
				pageCounter = pageCounter / WebConstants.BOOK_PAGE_SIZE;
			} else {
				pageCounter = pageCounter / WebConstants.BOOK_PAGE_SIZE + 1;
			}
		}

		return pageCounter;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.leiwen.bookshopping.dao.BookDao#getPageCounter(java.lang.String)
	 */
	@Override
	public int getPageCounter(String sqlCounter) {
		int pageCounter = 0;

		// 疑问：这个地方为什么不能增加.addEntity(Book.class),耗费了fans同学1个小时的时间呀
		// 经验的价值呀
		Query query = getSession().createSQLQuery(sqlCounter);
		List list = query.list();
		if (list != null) {
			pageCounter = Integer.parseInt(list.get(0).toString());

			if (pageCounter % WebConstants.BOOK_PAGE_SIZE == 0) {
				pageCounter = pageCounter / WebConstants.BOOK_PAGE_SIZE;
			} else {
				pageCounter = pageCounter / WebConstants.BOOK_PAGE_SIZE + 1;
			}
		}

		return pageCounter;
	}

}
