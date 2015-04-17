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

import java.util.HashSet;
import java.util.Set;

/**
 * 用户
 * 
 * @author 雷文 2011-11-10
 * @since 1.0
 */
public class User {
	/**
	 * 用户ID
	 */
	private Integer userId;
	/**
	 * 角色
	 */
	private UserRole userRole;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 邮件
	 */
	private String email;
	/**
	 * 性别
	 */
	private Boolean sex;
	/**
	 * 收货人地址
	 */
	private String address;
	/**
	 * 手机号码
	 */
	private Long mobile;

	private Set<Order> orders = new HashSet<Order>();

	private Set<BookComment> bookComments = new HashSet<BookComment>();

	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * @return the userRole
	 */
	public UserRole getUserRole() {
		return userRole;
	}

	/**
	 * @param userRole
	 *            the userRole to set
	 */
	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the sex
	 */
	public Boolean isSex() {
		return sex;
	}

	/**
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the mobile
	 */
	public Long getMobile() {
		return mobile;
	}

	/**
	 * @param mobile
	 *            the mobile to set
	 */
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the orders
	 */
	public Set<Order> getOrders() {
		return orders;
	}

	/**
	 * @param orders
	 *            the orders to set
	 */
	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

	/**
	 * @return the bookComments
	 */
	public Set<BookComment> getBookComments() {
		return bookComments;
	}

	/**
	 * @param bookComments
	 *            the bookComments to set
	 */
	public void setBookComments(Set<BookComment> bookComments) {
		this.bookComments = bookComments;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (object != null && object.getClass() == User.class) {
			User other = (User) object;
			if (getUserId().equals(other.getUserId())) {
				return true;
			}
		}
		return false;

	}

	@Override
	public int hashCode() {
		return userId.hashCode() + name.hashCode();

	}

	@Override
	public String toString() {
		return "bookId:" + userId + ",name:" + name + ",address:" + address
				+ ",email:" + email;

	}

}
