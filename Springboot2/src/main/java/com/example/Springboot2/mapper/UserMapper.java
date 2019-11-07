package com.example.Springboot2.mapper;

import java.util.List;
import java.util.ArrayList;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Param;
import com.example.Springboot2.model.Permission.Entity1;

public interface UserMapper {
	@Select("select * from sys_roles")
	List<Entity1> Select1();

}
