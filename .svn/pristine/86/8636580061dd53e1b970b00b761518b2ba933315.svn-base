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
package cn.fansunion.bookshopping.service;

import java.util.List;

import cn.fansunion.bookshopping.domain.Book;
import cn.fansunion.bookshopping.domain.BookCategory;
import cn.fansunion.bookshopping.exceptions.ServiceException;

/**
 * 业务逻辑层。处理和书相关的业务。
 * @author 雷文  2011-11-12
 * @since 1.0
 */
public interface BookService {
	/**
	 * 根据书的ID查找
	 * 
	 * @param bookId
	 *            书的ID
	 * @return 查到到的书
	 */
	Book find(Integer bookId)throws ServiceException;

	/**
	 * 增加一本书
	 * 
	 * @param book
	 *            书
	 * @return 书对应的ID
	 */
	void add(Book book)throws ServiceException;

	/**
	 * 更新一本书的信息
	 * 
	 * @param book
	 *            书
	 */
	void update(Book book)throws ServiceException;

	/**
	 * 删除一本书
	 * 
	 * @param book
	 *            书
	 */
	void delete(Book book)throws ServiceException;

	/**
	 * 根据书的ID删除书
	 * 
	 * @param bookId
	 */
	void delete(Integer bookId)throws ServiceException;

	/**
	 * 查找所有的书
	 * 
	 * @return 所有的书列表
	 */
	List<Book> findAll()throws ServiceException;
	
	List<Book> findByPage(int pageIndex)throws ServiceException;
	
	List<Book> findByPage(int pageIndex,long bookCategoryId)throws ServiceException;
	
	List<BookCategory> findAllBookCategories() throws ServiceException;

	/**
	 * @return
	 */
	int getPageCounter();
	
}
