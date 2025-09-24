package com.example.demo;

import com.example.demo.dao.StudentDAO;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private StudentDAO studentDAO;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Working with JPA Entity");

		// Insert a new row
//		Student newStudent = new Student("Ana", "Smith", "ana@email.com");
//		studentDAO.save(newStudent);
//		System.out.println("Saved student: "+ newStudent);

		// Update a student
//		Student student = studentDAO.findById(3);
//		student.setFirstName("Bob");
//		student.setLastName("Peter");
//		student.setEmail("bob@email.com");
//		studentDAO.update(student);

		// Delete a student
		studentDAO.delete(2);

		// Find all records
		List<Student> students = studentDAO.findAll();
		for(Student s: students){
			System.out.println(s);
		}
	}
}
