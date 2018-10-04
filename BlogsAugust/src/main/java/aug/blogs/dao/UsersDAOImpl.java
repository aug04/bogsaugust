package aug.blogs.dao;

import org.springframework.stereotype.Component;

@Component("usersDAOImpl")
public class UsersDAOImpl extends AbstractCrudDAO {

	public UsersDAOImpl() {
		super.namespace = "aug.blogs.dao.UsersService";
	}
	
}
