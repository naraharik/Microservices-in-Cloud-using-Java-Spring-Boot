package com.narahari.service2.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.narahari.service2.models.Faculty;
import com.narahari.service2.models.FacultyList;

@RestController
@RequestMapping("/hr")
public class FacultyResources {
	
	List<Faculty> faculties = Arrays.asList(
			
			new Faculty ("F1","Jinesh MK", "Cloud Security"),
			new Faculty ("F2","Sriram Sankaran", "Mobile Security")
			
	);
	@RequestMapping("/faculties")
	public FacultyList getFaculties(){
		
		FacultyList facultyList = new FacultyList();
		facultyList.setFaculties(faculties);		
		return facultyList;
		
	}
	@RequestMapping("/faculties/{Id}")
	public Faculty getFacultyById (@PathVariable("Id") String Id) {
		
		Faculty f = faculties.stream()
				.filter(faculty -> Id.equals(faculty.getId()))
				.findAny()
				.orElse(null);
		return f;
	}

}
