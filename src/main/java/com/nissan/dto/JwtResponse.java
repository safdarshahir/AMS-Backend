package com.nissan.dto;

public class JwtResponse {
	
	private final String jwttoken;
	private String userName;
	private Integer userTypeNo;
	

	//parameterized constructor
	public JwtResponse(String jwttoken, String userName, Integer userTypeNo) {
		super();
		this.jwttoken = jwttoken;
		this.userName = userName;
		this.userTypeNo = userTypeNo;
	}

	
	//getters and setters
	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public Integer getUserTypeNo() {
		return userTypeNo;
	}


	public void setUserTypeNo(Integer userTypeNo) {
		this.userTypeNo = userTypeNo;
	}


	public String getJwttoken() {
		return jwttoken;
	}


	@Override
	public String toString() {
		return "JwtResponse [jwttoken=" + jwttoken + ", userName=" + userName + ", userTypeNo=" + userTypeNo + "]";
	}
	
	
	
		
}

