package cn.itcast.ssm.service.impl;

import cn.itcast.ssm.mapper.UserMapper;
import cn.itcast.ssm.pojo.User;
import cn.itcast.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class UserServiceImpl implements IUserService {




	@Autowired
	private UserMapper userMapper;

	@Override
	public User findUserById(Long id) {
		return userMapper.selectUserById(id);
	}

	@Override
	public void deleteUserById(Long id) {
		userMapper.deleteUserById(id);
	}
}
