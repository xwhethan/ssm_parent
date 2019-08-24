package cn.itcast.ssm.service;

import cn.itcast.ssm.pojo.User;

public interface IUserService {

	//根据id查询用户信息
	public User findUserById(Long id);

	void deleteUserById(Long id);
}
