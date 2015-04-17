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
package cn.fansunion.bookshopping.action;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.fansunion.bookshopping.domain.User;
import cn.fansunion.bookshopping.domain.UserRole;
import cn.fansunion.bookshopping.exceptions.ServiceException;
import cn.fansunion.bookshopping.service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 处理和用户有关的请求，如增加、更新、删除、查询 用户。
 * 
 * @author 雷文 2011-11-28
 * @since 1.0
 */
@Scope("prototype")
@Controller
public class UserAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	@Resource
	private UserService userService;

	private List<User> users;

	private List<UserRole> userRoles;

	private int pageIndex = 1;

	private int pageCounter = 1;

	private int left = 0;

	private int right = 1;

	private long userRoleId;

	private User user;

	// 增加用户
	public String add() {
		userService.add(user);
		return SUCCESS;
	}

	// 检验用户登录
	public String checkLogin() {
		String result = null;
		if (user == null) {
			return "loginFailed";
		}

		User u = userService.find(user.getName());
		if (u != null && u.getPassword().equals(user.getPassword())) {
			Map<String, Object> session = ActionContext.getContext()
					.getSession();
			session.put("user", u);
			result = SUCCESS;
			user = u;
		}
		return result;
	}

	//
	public String initUsersByPageIndex() throws ServiceException {
		// userRoles = userService.findAllUserCategories();
		users = userService.findByPage(pageIndex);
		return SUCCESS;
	}

	//
	public String initUsersByPageIndexAndRole() throws ServiceException {
		// userRoles = userService.findAllUserCategories();
		users = userService.findByPage(pageIndex, userRoleId);
		pageCounter = userService.getPageCounter();
		initPagination();
		return SUCCESS;
	}

	//
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
	 * @return the users
	 */
	public List<User> getUsers() {
		return users;
	}

	/**
	 * @param users
	 *            the users to set
	 */
	public void setUsers(List<User> users) {
		this.users = users;
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
	 * @return the userRoleId
	 */
	public long getUserRoleId() {
		return userRoleId;
	}

	/**
	 * @param userRoleId
	 *            the userRoleId to set
	 */
	public void setUserRoleId(long userRoleId) {
		this.userRoleId = userRoleId;
	}

	/**
	 * @return the userRoles
	 */
	public List<UserRole> getUserCategories() {
		return userRoles;
	}

	/**
	 * @param userRoles
	 *            the userRoles to set
	 */
	public void setUserCategories(List<UserRole> userRoles) {
		this.userRoles = userRoles;
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

}
