package com.krushnas.springcore.bean;

import java.util.List;

import lombok.Data;

@Data
public class CompanyBean{

	int id;
	String companyName;
	List<EmployeeBean>employees;
}