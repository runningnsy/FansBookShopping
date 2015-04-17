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
package cn.fansunion.bookshopping.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import cn.fansunion.bookshopping.dao.DaoSupport;

/**
 * @author 雷文 2011-11-12
 * @since 1.0
 */
@Repository
public class DaoSupportImpl implements DaoSupport {

	@Resource
	private SessionFactory sessionFactory;

	@Override
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public List findByPage(String sql, Class clazz, int pageIndex, int pageSize) {

		Object[] values = new Object[] {};
		return findByPage(sql, clazz, values, pageIndex, pageSize);
	}

	@Override
	public List findByPage(String sql, Class clazz, Object value,
			int pageIndex, int pageSize) {
		Object[] values = new Object[] { value };
		return findByPage(sql, clazz, values, pageIndex, pageSize);
	}

	@Override
	public List findByPage(String sql, Class clazz, Object[] values,
			int pageIndex, int pageSize) {
		Query query = getSession().createSQLQuery(sql).addEntity(clazz);
		// System.out.println(values.length);
		for (int index = 0; index < values.length; index++) {
			query.setParameter(index, values[index]);
		}

		query.setFirstResult((pageIndex - 1) * pageSize);
		query.setMaxResults(pageSize);

		return query.list();
	}
}
