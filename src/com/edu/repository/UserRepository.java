package com.edu.repository;

import java.util.HashMap;
import java.util.Map;

import com.edu.vo.MyDate;
import com.edu.vo.User;

public class UserRepository {
	
	//String id, String password, String name, MyDate date
	// HashMap 선언 및 초기화
	
    HashMap<String, User> users;
    
    public void setHashMap(HashMap<String, User> user) {
    	this.users = user;
    }
    
    public HashMap<String, User> getHashMap() {
    	return users;
    }
	
	public void add() {
		// TODO Auto-generated method stub
		
	}

	public void find() {
		// TODO Auto-generated method stub
		
	}

	public void update() {
		// TODO Auto-generated method stub
		
	}

	public void delete() {
		// TODO Auto-generated method stub
		
	}

	// test
	User user1 = new User("1", "1234","user1", new MyDate(2000,10,10));
	//유저 조회 (id)
	public User findUser(String id) {
		return user1;
	}


}
