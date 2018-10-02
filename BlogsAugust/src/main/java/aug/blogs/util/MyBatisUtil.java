package aug.blogs.util;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {

	private static SqlSessionFactory factory;
	
	public MyBatisUtil() {
		
	}
	
	static {
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader("config/jdbc/mybatis-config.xml");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		factory = new SqlSessionFactoryBuilder().build(reader);
	}
	
	public static SqlSessionFactory getSqlSessionFactory() {
		return factory;
	}
}
