package com.lti.dao;

import java.util.List;

import com.lti.model.Users;

public interface UserDao {
	public int readLogin(String username, String password);
	public int createUser(Users user);
	public Users readUserByUsername(String username);
	public List<Users> readAllUsers();
	public Users updateUsers(Users user) ;
	public int deleteUsers(String username) ;
	public List<Users> readUserByname(String name) ;

}
