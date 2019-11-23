package com.example.Demo2.mapper;

import java.util.List;
import java.util.ArrayList;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Param;
import com.example.Demo2.model.Permission.RechargeDetail;
import org.apache.ibatis.annotations.Update;

public interface RechargeMapper {
	@Select("select Balance from rechargedetail where UserId=#{UserId} order by id DESC limit 1")
	List<RechargeDetail> getBalance(@Param("UserId") int UserId);

	@Update("update rechargedetail set Balance=Balance+#{AddValue,jdbcType=DECIMAL} where UserID=#{UserID}")
	void updateBalance(@Param("UserID") int UserID, @Param("AddValue") double AddValue);

	@Select("select SValue from rechargedetail where UserId=#{UserId}")
	List<RechargeDetail> getSValue(@Param("UserId") int UserId);

	@Select("select AddValue from rechargedetail where AddValue>0 and userid=#{userid}")
	List<RechargeDetail> getAddRecord(@Param("userid") int userid);

}
