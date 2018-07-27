package com.xgl.vo;

import java.util.List;

public class Friend {
	
	private String fname;
	private String sex;
	private Integer age;
	private List<String> aihao;
	
	public Friend() {
		// TODO Auto-generated constructor stub
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public List<String> getAihao() {
		return aihao;
	}
	public void setAihao(List<String> aihao) {
		this.aihao = aihao;
	}
	public Friend(String fname, String sex, Integer age, List<String> aihao) {
		super();
		this.fname = fname;
		this.sex = sex;
		this.age = age;
		this.aihao = aihao;
	}
	
	
	
	
	

}
