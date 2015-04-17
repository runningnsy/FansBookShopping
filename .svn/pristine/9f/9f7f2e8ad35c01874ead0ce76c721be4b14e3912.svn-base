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
package cn.fansunion.bookshopping.dao;

import java.util.List;

import cn.fansunion.bookshopping.domain.Book;
import cn.fansunion.bookshopping.domain.BookCategory;

/**
 * 数据访问层。访问数据库中和书表相关的信息。
 * 
 * @author 雷文 2011-11-12
 * @since 1.0
 */
public interface BookDao extends DaoSupport {
	/**
	 * 根据书的ID查找
	 * 
	 * @param bookId
	 *            书的ID
	 * @return 查到到的书
	 */
	Book find(Integer bookId);

	/**
	 * 增加一本书
	 * 
	 * @param book
	 *            书
	 * @return 书对应的ID
	 */
	void add(Book book);

	/**
	 * 更新一本书的信息
	 * 
	 * @param book
	 *            书
	 */
	void update(Book book);

	/**
	 * 删除一本书
	 * 
	 * @param book
	 *            书
	 */
	void delete(Book book);

	/**
	 * 查找所有的书
	 * 
	 * @return 所有的书列表
	 */
	List<Book> findAll();

	/**
	 * @return
	 */
	List<BookCategory> findAllBookCategories();

	/**
	 * @param sqlCounter
	 * @param bookCategoryId
	 * @return
	 */
	int getPageCounter(String sqlCounter, long bookCategoryId);

	/**
	 * @param sqlCounter
	 * @return
	 */
	int getPageCounter(String sqlCounter);
}
