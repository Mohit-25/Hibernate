package com.hyber;

import jakarta.persistence.Embeddable;


@Embeddable
public class Certificate {
	

	private String course;
	private String duration;
	
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDuration() {
		return duration;
	}
	public void SetDuration(String duration) {
		this.duration = duration;
	}
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Certificate(String course, String duration) {
		super();
		this.course = course;
		this.duration = duration;
	}
	
	
}
