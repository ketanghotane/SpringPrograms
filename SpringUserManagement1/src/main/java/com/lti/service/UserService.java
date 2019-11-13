package com.lti.service;

import java.util.List;

import com.lti.model.Users;

public interface UserService {
	public boolean checkLogin(String username, String password);
	public boolean addUser(Users user);
	public List<Users> findAllUsers();
	public Users findUserByUsername (String username);
	public Users modifyUser(Users username);
	public boolean removeUser (String username);
	public List<Users> findUserByName(String name);

}
