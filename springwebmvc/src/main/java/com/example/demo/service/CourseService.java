package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.bean.CourseBean;

@Service
public class CourseService {
	
	
	  @Autowired private RestTemplate restTemplate;
	 
	
	//ArrayList<Object> al = new ArrayList<Object>();	
	
	
	public List getallCurse(){
		
		/*
		 * CourseBean cs1 = new CourseBean();
		 * 
		 * cs1.setCourseName("MCA"); cs1.setTopic("JAVA");
		 * 
		 * CourseBean cs2 = new CourseBean();
		 * 
		 * cs2.setCourseName("BCA"); cs2.setTopic("C++");
		 * 
		 * al.add(cs1); al.add(cs2);
		 * 
		 * return al;
		 */
				
		  System.out.println("333333333333333");
		
	      HttpHeaders headers = new HttpHeaders();		   
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity <String> entity = new HttpEntity<String>(headers);
	      
	      System.out.println("I123333");
	      
	      return restTemplate.exchange("http://localhost:9002/getPrdcts", HttpMethod.GET, entity, ArrayList.class).getBody();
	     

   }
	
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
}