package com.example.demo.bean;

import javax.xml.bind.annotation.XmlRootElement;


public class CourseBean {
	
	String courseName;
	String topic;
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	

}
