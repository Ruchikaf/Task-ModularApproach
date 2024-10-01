package com.service;

import com.dao.ServiceDoa;

public class StudentService {
    public void insertData() throws Exception {
    	ServiceDoa sd=new ServiceDoa();
    	sd.insertData();
    	System.out.println("Data inserted...");
    }
    public void updateData() throws Exception {
    	ServiceDoa sd=new ServiceDoa();
    	sd.updateData();
    	System.out.println("Data updated...");
    }
    public void deleteData() throws Exception{
    	ServiceDoa sd=new ServiceDoa();
    	sd.deleteData();
    	System.out.println("Data deleted ");
    }
    public void fetchAllRecords() throws Exception {
    	ServiceDoa sd=new ServiceDoa();
    	System.out.println("Fetching data ...");
    	sd.fetchAllRecords();
    	
    }
}
