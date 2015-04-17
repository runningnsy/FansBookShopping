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

import cn.fansunion.bookshopping.domain.Order;
import cn.fansunion.bookshopping.domain.OrderItem;

/**
 *  数据访问层。访问数据库中和订单表相关的信息。
 * @author 雷文 2011-11-12
 * @since 1.0
 */
public interface OrderItemDao extends DaoSupport {
	/**
	 * 根据订单号查询订单
	 * 
	 * @param orderId
	 * @return
	 */
	Order find(Integer orderId);

	/**
	 * 增加一个订单项
	 * 
	 * @param order
	 */
	void add(OrderItem order);

	/**
	 * 删除一个订单
	 * 
	 * @param order
	 */
	void delete(Order order);

	/**
	 * 删除一个 订单项
	 * 
	 * @param orderItem
	 */
	void delete(OrderItem orderItem);

}
