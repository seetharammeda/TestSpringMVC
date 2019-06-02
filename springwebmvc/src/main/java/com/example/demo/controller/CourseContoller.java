package com.example.demo.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.example.demo.service.CourseService;

@Controller
public class CourseContoller {
	
	@Autowired
	CourseService cs;
	 
	
	@RequestMapping(method = RequestMethod.GET,value = "/getcourses")
	
	public String getAllCourse(ModelMap modelmap) {
	
		 List cl = cs.getallCurse(); 
		modelmap.put("allCrse", cl);		
		return "course";
		
		
		
	}

}
