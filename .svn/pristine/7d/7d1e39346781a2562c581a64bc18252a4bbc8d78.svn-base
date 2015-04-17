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
package cn.fansunion.bookshopping;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 读取hibernate.cfg.xml,测试hibernate是否配置成功了。
 * 
 * @author 雷文 2011-11-12
 * @since 1.0
 */
public class HibernateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Query query = session.createSQLQuery("select count(*) from book");
		query.list();
		System.out.println(session.isConnected());

	}

}
