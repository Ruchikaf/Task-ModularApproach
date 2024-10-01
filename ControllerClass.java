package com.controller;

import com.service.StudentService;

public class ControllerClass {

	public static void main(String[] args) throws Exception {
		StudentService ss=new StudentService();
		//ss.insertData();
		ss.fetchAllRecords();
		ss.updateData();
		ss.fetchAllRecords();
		ss.deleteData();
		ss.fetchAllRecords();

	}

}
