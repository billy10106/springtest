package com.billysun.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billysun.JpaRepository.UserJpaRepository;
import com.billysun.dao.UserDao;
import com.billysun.entity.User;
import com.billysun.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserJpaRepository userJpaRepository;

	@Override
	public List<UserDao> getUserDao() {
		// TODO Auto-generated method stub

		List<UserDao> userDaos = new ArrayList<UserDao>();
		Iterable<User> users = userJpaRepository.findAll();
		for (User user : users) {
			UserDao userDao = new UserDao();
			userDao.setFirstName(user.getFirstName());
			userDao.setLastName(user.getLastName());
			userDaos.add(userDao);
		}
		return userDaos;
	}

}
