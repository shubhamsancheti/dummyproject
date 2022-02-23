package org.demopro.web;

import org.demopro.common.model.Response;
import org.demopro.common.model.SuccessResponse;
//import org.demopro.common.model.User;
import org.demopro.service.UserDetailService;
import org.demopro.service.UserDetailServicev4;
import org.demopro.service.UserDetailsServicev2;
import org.demopro.service.UserDetailsservicev3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDataController {
	@Autowired
	UserDetailsservicev3 userdetailservice;
	@GetMapping("/UserDetails/{userid}")
	private Response getUserDetails(@PathVariable int userid)
	{
		
		return  userdetailservice.getUserDetails(userid);
	}
}
