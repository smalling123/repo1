package com.example.Demo2.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.Demo2.model.Result;
import com.example.Demo2.mapper.RechargeMapper;
@RestController
public class PermissionController{
	@Autowired
	private RechargeMapper m_RechargeMapper;
	@RequestMapping(value = "/Permission/getAddRecord", method = RequestMethod.POST)
	public Result getAddRecord(int userid) {
		Result result = new Result();
		try{
			result.setData(m_RechargeMapper.getAddRecord(userid));
		}catch(Exception error){
			result.setCode(error.hashCode());
			result.setMsg(error.getMessage());
			return result;
		}
		return result;
	}
	@RequestMapping(value = "/Permission/getBalance", method = RequestMethod.POST)
	public Result getBalance(int UserId) {
		Result result = new Result();
		try{
			result.setData(m_RechargeMapper.getBalance(UserId));
		}catch(Exception error){
			result.setCode(error.hashCode());
			result.setMsg(error.getMessage());
			return result;
		}
		return result;
	}
	@RequestMapping(value = "/Permission/getSValue", method = RequestMethod.POST)
	public Result getSValue(int UserId) {
		Result result = new Result();
		try{
			result.setData(m_RechargeMapper.getSValue(UserId));
		}catch(Exception error){
			result.setCode(error.hashCode());
			result.setMsg(error.getMessage());
			return result;
		}
		return result;
	}
	@RequestMapping(value = "/Permission/updateBalance", method = RequestMethod.POST)
	public Result updateBalance(int UserId, double AddValue) {
		Result result = new Result();
		try{
			m_RechargeMapper.updateBalance(UserId, AddValue);
		}catch(Exception error){
			result.setCode(error.hashCode());
			result.setMsg(error.getMessage());
			return result;
		}
		return result;
	}
	@RequestMapping(value="/Permission/pay", method = RequestMethod.GET)
	public String pay(){
		return "pay";
	}

}
