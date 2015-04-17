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

import org.hibernate.Session;

/**
 * 主要用来复用分页方法
 * 
 * @author 雷文 2011-11-12
 * @since 1.0
 */
public interface DaoSupport {

	public abstract Session getSession();

	public abstract List findByPage(String sql, Class clazz, int pageIndex,
			int pageSize);

	public abstract List findByPage(String sql, Class clazz, Object value,
			int pageIndex, int pageSize);

	public abstract List findByPage(String sql, Class clazz, Object[] values,
			int pageIndex, int pageSize);

}