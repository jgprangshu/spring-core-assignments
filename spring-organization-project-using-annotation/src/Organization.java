package com.capgemini.spring.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

@Service
@PropertySource("database.properties")
public class Organization {
	@Value("001")
	private int orgId;
	
	@Value("capgemini")
	private String orgName;

	@Value("10000")
	private double marketPrice;

	//@Autowired
	private Address address;

	@Value("#{'${server.name}'.split(',')}")
	private List<String> directors;
	
	@Value("{'${setBranches}'}")
	private Set<String> branches;

	@Value("#{${valuesMap}}")
	private Map<String, String> branchWiseHead;
	
	@Value("${ipAddr}")
	private Properties ipAddress;

	@Value("${dbName},${name},${password}")
	private Properties databaseDetails; 
	

	

	@Override
	public String toString() {
		 return "Organization [orgId=" + orgId + ", orgName=" + orgName + ", marketPrice=" + marketPrice + ", directors="
				+ directors + ", branches=" + branches + ", branchWiseHead=" + branchWiseHead + ", ipAddress="
				+ ipAddress + ", databaseDetails=" + databaseDetails + "]";
	}

	

	
	
	
}