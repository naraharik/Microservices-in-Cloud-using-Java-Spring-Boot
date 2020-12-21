package com.narahari.service1.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.narahari.service1.models.FacultyList;
import com.narahari.service1.models.Student;

@RestController
@RequestMapping("/students")
public class ServiceResource {
	
	@Autowired
	private RestTemplate restTemplate;
	List<Student> students = Arrays.asList(
			
			new Student("S1", "Adarsh", "CSN"),
			new Student("S2", "Anjana", "CSN"),
			new Student("S3", "Aravind", "CSN"),
			new Student("S4", "Elwin", "CSN")
			
			
	);
	
	@RequestMapping("/security")
	public FacultyList getSecurity() {
		
		FacultyList facultyList = restTemplate.getForObject("http://localhost:8082/hr/faculties",FacultyList.class);
		return facultyList;
		
	}
	
	@RequestMapping("/list")
	public List<Student> getStudents(){
		
		return students;		
		
	}
	@RequestMapping("/list/{Id}")
	public Student getStudentById(@PathVariable("Id") String Id) {
		
		Student s = students.stream()
				.filter(student -> Id.equals(student.getId()))
				.findAny()
				.orElse(null);
		return s;				
		
	}
}
