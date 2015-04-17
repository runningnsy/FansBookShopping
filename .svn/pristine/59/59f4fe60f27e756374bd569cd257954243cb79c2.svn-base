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
package cn.fansunion.bookshopping.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 订单
 * 
 * @author 雷文 2011-11-10
 * @since 1.0
 */
public class Order {
	/**
	 * 订单ID
	 */
	private Integer orderId;
	/**
	 * 下订单的人
	 */
	private User user;
	/**
	 * 收货人
	 */
	private String receiver;
	/**
	 * 下单日期
	 */
	private Date date;
	/**
	 * 订单状态
	 */
	private String status;
	/**
	 * 支付方式
	 */
	private String payStyle;
	/**
	 * 订单总价
	 */
	private Float totalMoney;
	/**
	 * 订单的数量
	 */
	private Integer count;
	/**
	 * 订单包含的订单项
	 */
	private Set<OrderItem> orderItems = new HashSet<OrderItem>();

	/**
	 * @return the orderId
	 */
	public Integer getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId
	 *            the orderId to set
	 */
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the receiver
	 */
	public String getReceiver() {
		return receiver;
	}

	/**
	 * @param receiver
	 *            the receiver to set
	 */
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the payStyle
	 */
	public String getPayStyle() {
		return payStyle;
	}

	/**
	 * @param payStyle
	 *            the payStyle to set
	 */
	public void setPayStyle(String payStyle) {
		this.payStyle = payStyle;
	}

	/**
	 * @return the totalMoney
	 */
	public Float getTotalMoney() {
		return totalMoney;
	}

	/**
	 * @param totalMoney
	 *            the totalMoney to set
	 */
	public void setTotalMoney(Float totalMoney) {
		this.totalMoney = totalMoney;
	}

	/**
	 * @return the count
	 */
	public Integer getCount() {
		return count;
	}

	/**
	 * @param count
	 *            the count to set
	 */
	public void setCount(Integer count) {
		this.count = count;
	}

	/**
	 * @return the orderItems
	 */
	public Set<OrderItem> getOrderItems() {
		return orderItems;
	}

	/**
	 * @param orderItems
	 *            the orderItems to set
	 */
	public void setOrderItems(Set<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (object != null && object.getClass() == Order.class) {		
			Order other = (Order) object;			
			// Long是复合类型，引用类型，不应该使用==进行比较
			if (getOrderId().equals(other.getOrderId())) {
				return true;
			} 
		}
		return false;

	}

	@Override
	public int hashCode() {
		return orderId.hashCode() + status.hashCode();

	}

	@Override
	public String toString() {
		return "orderId:" + orderId + ",status=" + status + ",payStyle="
				+ payStyle + ",date=" + date + ",totalMoney=" + totalMoney;

	}
}
