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

import java.net.URL;

import org.apache.log4j.Logger;

/**
 * 读取log4j.properties,测试log4j是否配置成功了。
 * 
 * @author 雷文 2011-11-29
 * @since 1.0
 */
public class TestLog4j {
	public static void main(String[] args) {

		URL url = TestLog4j.class.getClassLoader().getResource(
				"log4j.properties");
		System.out.println(url);

		// PropertyConfigurator.configure(url);

		Logger logger = Logger.getLogger(TestLog4j.class);
		logger.debug(" debug ");
		logger.error(" error ");
	}
}