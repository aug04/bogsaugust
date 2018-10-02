package aug.blogs.model;

import java.io.Serializable;

public class Users implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private int id;
	private String userName;
	private String password;
	private String email;
	private String displayName;
	private boolean status;
	
	public Users() {
		
	}

	public Users(int id, String userName, String password, String email,
			String displayName, boolean status) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.displayName = displayName;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
