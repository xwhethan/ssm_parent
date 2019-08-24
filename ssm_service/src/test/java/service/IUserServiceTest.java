package service;

import cn.itcast.ssm.pojo.User;
import cn.itcast.ssm.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:spring/applicationContext*.xml")
public class IUserServiceTest {

	@Autowired
	private IUserService userService;

	@Test
	public void findUserById() {
		User userById = userService.findUserById(2L);
		System.out.println("userById = " + userById);
	}
}