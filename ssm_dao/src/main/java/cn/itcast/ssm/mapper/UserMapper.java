package cn.itcast.ssm.mapper;

import cn.itcast.ssm.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
	//根据id查询用户信息
	public User selectUserById(@Param("id") Long id);


	void deleteUserById(@Param("id") Long id);
}
