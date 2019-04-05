package com.capgemini.spring.config;
import com.capgemini.spring.component.*;
import org.springframework.context.annotation.*;
import java.util.*;
import java.io.*;

@Configuration
public class AppConfig{

	
	public Address getAddress(){
		Address address = new Address("Mumbai","Maharashtra");
		return address;
	}

	public List<String> getDirectors() {
		List<String> directors=new ArrayList<String>();
		directors.add("John Doe");
		directors.add("Ron");
		directors.add("Grant");
		return directors;
	}
	
	public Set<String> getBranches() {
		Set<String> branches=new HashSet<String>();
		branches.add("Pune");
		branches.add("Mumbai");
		branches.add("Chennai");
		return branches;
	}

	public Map<String,String> getBranchWiseHead() {
		Map<String,String> branchWiseHead= new HashMap<>();
		branchWiseHead.put("Pune","Mrunal");
		branchWiseHead.put("Mumbai","Aayush");
		branchWiseHead.put("Chennai","Prangshu");
		return branchWiseHead;
	}

	public Properties getIpAddresses() {
		FileReader reader=null;
		Properties ipAddresses=null;
		try{
		reader=new FileReader("src/ipAddress.properties");  
    		ipAddresses=new Properties();  
    		ipAddresses.load(reader);
		}catch(Exception e){
			e.printStackTrace();
		}
		return ipAddresses;
	}

	
	public Properties getDatabaseDetails() {
		FileReader reader=null;
		Properties databaseDetails=null;
		try{
		reader=new FileReader("src/database.properties"); 
      		databaseDetails=new Properties();  
    		databaseDetails.load(reader);
		}catch(Exception e){
			e.printStackTrace();
		} 
		return databaseDetails;
	}

	@Bean
	public Organization getOrganization(){
		Organization org = new Organization();
		org.setOrgId(101);
		org.setOrgName("Capgemini");
		org.setMarketPrice(34567);
		org.setAddress(getAddress());
		org.setDirectors(getDirectors());
		org.setBranches(getBranches());
		org.setBranchWiseHead(getBranchWiseHead());
		org.setIpAddress(getIpAddress());
		org.setDatabaseDetails(getDatabaseDetails());
		return org;
	}
}