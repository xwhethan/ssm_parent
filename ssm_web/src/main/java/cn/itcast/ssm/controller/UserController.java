package cn.itcast.ssm.controller;


import cn.itcast.ssm.pojo.User;
import cn.itcast.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("user")
public class UserController {


	@Autowired
	private IUserService userService;


	@RequestMapping("showUser")
	public String toUser(@RequestParam("id")Long id, Model model){
		User user = userService.findUserById(id);

		model.addAttribute("user",user);

		return  "users";
	}

	@RequestMapping("deleteUser")
	@ResponseStatus(HttpStatus.OK)
	public void  deleteUser(@RequestParam("id")Long id){
	 userService.deleteUserById(id);


	}

}
