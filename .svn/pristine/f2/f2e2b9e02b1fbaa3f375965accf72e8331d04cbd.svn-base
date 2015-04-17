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
package cn.fansunion.bookshopping.service;

import java.util.List;

import cn.fansunion.bookshopping.domain.User;
import cn.fansunion.bookshopping.exceptions.ServiceException;

/**
 * 业务逻辑层。处理和用户相关的业务。
 * 
 * @author 雷文 2011-11-28
 * @since 1.0
 */
public interface UserService {
	/**
	 * 根据用户的ID查找
	 * 
	 * @param userId
	 *            用户的ID
	 * @return 查到到的用户
	 */
	User find(Integer userId) throws ServiceException;

	/**
	 * 增加一本用户
	 * 
	 * @param user
	 *            用户
	 * @return 用户对应的ID
	 */
	void add(User user) throws ServiceException;

	/**
	 * 更新一本用户的信息
	 * 
	 * @param user
	 *            用户
	 */
	void update(User user) throws ServiceException;

	/**
	 * 删除一本用户
	 * 
	 * @param user
	 *            用户
	 */
	void delete(User user) throws ServiceException;

	/**
	 * 根据用户的ID删除用户
	 * 
	 * @param userId
	 */
	void delete(Integer userId) throws ServiceException;

	/**
	 * 查找所有的用户
	 * 
	 * @return 所有的用户列表
	 */
	List<User> findAll() throws ServiceException;

	List<User> findByPage(int pageIndex) throws ServiceException;

	List<User> findByPage(int pageIndex, long userCategoryId)
			throws ServiceException;

	/**
	 * @return
	 */
	int getPageCounter();

	/**
	 * @param name
	 * @return
	 * @throws ServiceException
	 */
	User find(String name) throws ServiceException;

}
