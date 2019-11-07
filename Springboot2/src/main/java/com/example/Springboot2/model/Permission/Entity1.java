package com.example.Springboot2.model.Permission;

import java.io.Serializable;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import com.example.Springboot2.service.DictionaryService;
import com.example.Springboot2.model.DictionaryItem;

@Component
public class Entity1 implements Serializable {
	@Autowired
	private DictionaryService dictionaryService;

	private static Entity1 m_Entity1;

	@PostConstruct 
	public void init(){
		m_Entity1=this;
		m_Entity1.dictionaryService=this.dictionaryService;
	}

	private int id = 0;
	public int getid(){
		return this.id;
	}
	public void setid(int value){
		this.id = value;
	}

	private String name = "";
	public String getname(){
		return this.name;
	}
	public void setname(String value){
		this.name = value;
	}

	private String note = "";
	public String getnote(){
		return this.note;
	}
	public void setnote(String value){
		this.note = value;
	}

	private java.util.Date createdTime = new java.util.Date();
	public java.util.Date getcreatedTime(){
		return this.createdTime;
	}
	public void setcreatedTime(java.util.Date value){
		this.createdTime = value;
	}

	private java.util.Date modifiedTime = new java.util.Date();
	public java.util.Date getmodifiedTime(){
		return this.modifiedTime;
	}
	public void setmodifiedTime(java.util.Date value){
		this.modifiedTime = value;
	}

	private String creatUser = "";
	public String getcreatUser(){
		return this.creatUser;
	}
	public void setcreatUser(String value){
		this.creatUser = value;
	}

	private String modifiedUser = "";
	public String getmodifiedUser(){
		return this.modifiedUser;
	}
	public void setmodifiedUser(String value){
		this.modifiedUser = value;
	}

}
