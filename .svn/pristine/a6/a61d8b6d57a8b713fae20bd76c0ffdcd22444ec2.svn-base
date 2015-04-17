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

import cn.fansunion.bookshopping.domain.User;

/**
 * 数据访问层。访问数据库中和用户表相关的信息。
 * 
 * @author 雷文 2011-11-28
 * @since 1.0
 */
public interface UserDao extends DaoSupport {

	void add(User user);

	User find(Integer userId);

	void update(User user);

	void delete(User user);

	List<User> findAll();

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

	/**
	 * @param name
	 * @return
	 */
	List<User> find(String name);
}
