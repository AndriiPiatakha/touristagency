package dao;

import java.util.List;

import models.UserData;


public interface UserDao {
	
	UserData getUserById(int id);
	List<UserData> getAllUsers();
	boolean saveUser(UserData user);
	UserData getUserByEmail(String email);

}
