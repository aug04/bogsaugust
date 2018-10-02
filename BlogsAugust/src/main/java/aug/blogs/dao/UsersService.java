package aug.blogs.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import aug.blogs.model.Users;
import aug.blogs.util.MyBatisUtil;

@Service
public class UsersService {
	
	public UsersService() {
		
	}

	public Users get(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			UsersMapper userService = session.getMapper(UsersMapper.class);
			return userService.get(id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		return null;
	}
}
