package com.lti.service;

import java.util.List;

import com.lti.dao.UserDao;
import com.lti.model.Users;



public class UserServiceImpl implements UserService {
	private UserDao dao;
	public UserServiceImpl(UserDao dao) {
		this.dao=dao;
		
	}
	
	public boolean checkLogin(String username, String password){
		int result = getDao().readLogin(username, password);
		if (result == 1)
			return true;
		else
		return false;
	}
	
	public boolean addUser(Users user){
		int result = getDao().createUser(user);
		if (result == 1){
			return true;
		}else
			return false;
		
	}
	public List<Users> findAllUsers(){
		List<Users> list = getDao().readAllUsers();
		return list;
	}
	public Users findUserByUsername (String username){
		return null;
	}
	public Users modifyUser(Users username){
		Users users = getDao().updateUsers(username);
		return users;
		
	}
	public boolean removeUser (String username){
		int result = getDao().deleteUsers(username);
		if (result == 1){
			return true;
		}else
			return false;
		
	}
	
	public List<Users> findUserByName(String name){
		return null;
	}

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}
	
}
