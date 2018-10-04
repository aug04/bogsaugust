package aug.blogs.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aug.blogs.model.Users;

@Service
public class UsersService {
	
	@Autowired
	private UsersDAOImpl _userDAOImpl;
	
	public UsersService() {
		
	}

	public Users get(int id) throws Exception {

		return (Users) _userDAOImpl.object("get", id);
	}

	@SuppressWarnings("unchecked")
	public List<Users> getAllUsers() throws Exception {

		return (List<Users>) _userDAOImpl.list("getAllUsers");
	}
	
	public int insertUsers(Users user) throws Exception {
		
		return (int) _userDAOImpl.insert("insertUsers", user);
	}
}
