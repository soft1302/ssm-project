package com.tjpu.pojo;

/**
 * 
 * SYSUser javaBean
 * 
 * @author guohu
 * @date 2016.12.6
 *
 */
public class SYSUser {
	private int id;
	private String username;
	private String password;

	public SYSUser() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "SYSUser [id=" + id + ", " + (username != null ? "username=" + username + ", " : "")
				+ (password != null ? "password=" + password : "") + "]";
	}

}
