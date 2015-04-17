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

import cn.fansunion.bookshopping.domain.Order;
import cn.fansunion.bookshopping.exceptions.ServiceException;

/**
 * 业务逻辑层。处理和订单相关的业务。
 * @author 雷文 2011-11-27
 * @since 1.0
 */
public interface OrderService {

	Order find(Integer orderId) throws ServiceException;

	void add(Order order) throws ServiceException;

	List<Order> findByPage(int pageIndex) throws ServiceException;

	/**
	 * @param orderId
	 */
	void delete(Integer orderId);

}
