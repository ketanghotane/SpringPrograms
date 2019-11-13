package com.lti.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.lti.model.Users;
public class UserDaoImpl implements UserDao {
private JdbcTemplate template;
	
	
	private static final String INSERT_EMP_RECORD="Insert into users(username,password, firstname, lastname,mobilenumber) values(?,?,?,?,?)";
	private static final String DELETE_EMP_RECORD="Delete from users where username=?";
	private static final String UPDATE_EMP_RECORD="Update users set username=?,password=?,firstname=?, lastname=?, mobilenumber=?";
	private static final String SELECT_EMP_RECORD="select * from users";
	private static final String CHECK_LOGIN="Select * from users where Username=? And Password=?";

	
	

	public UserDaoImpl() {
	}
	public UserDaoImpl(JdbcTemplate template) {
		this.template=template;
		// TODO Auto-generated constructor stub
	}
	
	public int readLogin(String username, String password)
	{
		List<Users> list = template.query(CHECK_LOGIN, new Object[]{username,password}, new UserRowMapper());
		return list != null?list.size():0;
	}
	public int createUser(Users user ){
		int result=getTemplate().update(INSERT_EMP_RECORD,user.getUsername(),user.getPassword(),user.getFirstname(),user.getLastname(),user.getMobilenumber());
		return result;
	}
	
	public Users readUserByUsername(String username){
		return null;
	}
	
	public List<Users> readAllUsers(){
		List<Users> list=getTemplate().query(SELECT_EMP_RECORD,new UserRowMapper()); 
		return list;
		
	}
	
	public Users updateUsers(Users user) {
		int result=getTemplate().update(UPDATE_EMP_RECORD,user.getUsername(),user.getPassword(),user.getFirstname(),user.getLastname(),user.getMobilenumber());
		if(result==1)
			return user;
		else
		return null;
	}
	
	public int deleteUsers(String username) {
		int result=getTemplate().update(DELETE_EMP_RECORD,username);
		return result;
	}
	public void beginTransaction(){
	}
	
	public void commitTransaction() {
	}

	
	public void rollBackTransaction() {
	}

	public List<Users> readUserByname(String name) {
		return null;
	}

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
}
