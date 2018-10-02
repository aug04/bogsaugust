package aug.blogs.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import aug.blogs.model.Users;
import aug.blogs.util.MyBatisUtil;

@Component
public class UserServiceImpl {
	
	public UserServiceImpl() {
		
	}

	public Users get(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			UsersService userService = session.getMapper(UsersService.class);
			return userService.get(id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		return null;
	}
}
