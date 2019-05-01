package com.form.tag;

import java.util.LinkedHashMap;

public class Emp {
	
	private String fullName;
	private String email;
	private String fevDept;
	private LinkedHashMap<String, String> fevDeptOptions;
	private String[] programmingLng;
	
	public String[] getProgrammingLng() {
		return programmingLng;
	}

	public void setProgrammingLng(String[] programmingLng) {
		this.programmingLng = programmingLng;
	}

	public LinkedHashMap<String, String> getFevDeptOptions() {
		return fevDeptOptions;
	}

	public Emp() {
		fevDeptOptions  = new LinkedHashMap<String, String>();
		fevDeptOptions.put("SD", "Software Development");
		fevDeptOptions.put("WD", "Web Development");
		fevDeptOptions.put("GD", "Game Development");

	}
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFevDept() {
		return fevDept;
	}
	public void setFevDept(String fevDept) {
		this.fevDept = fevDept;
	}
	


}
