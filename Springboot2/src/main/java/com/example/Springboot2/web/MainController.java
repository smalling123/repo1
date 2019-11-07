package com.example.Springboot2.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.Springboot2.model.Result;
import com.example.Springboot2.mapper.UserMapper;
@RestController
public class MainController{

	@Autowired
	private UserMapper m_UserMapper;

	@RequestMapping(value = "/helloworld", method = RequestMethod.POST)
	public String helloworld() {
		String result = "HelloWorld!";
		return result;
	}

	@RequestMapping(value = "/UserInfo", method = RequestMethod.POST)
	public Result UserInfo() {
		Result result = new Result();
		try{
			result.setData(m_UserMapper.Select1());
		}catch(Exception error){
			result.setCode(error.hashCode());
			result.setMsg(error.getMessage());
			return result;
		}

		return result;
	}

}
