package com.example.demo;

import com.example.demo.dao.StudentDAO;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Working with JPA Entity");

		// Insert a new row
//		Student newStudent = new Student("Ana", "Smith", "ana@email.com");
//		studentRepository.save(newStudent);
//		System.out.println("Saved student: "+ newStudent);

		// Update a student
//		Student student = studentRepository.findById(1).orElseThrow();
//		student.setFirstName("Bob");
//		student.setLastName("Peter");
//		student.setEmail("bob@email.com");
//		studentRepository.save(student);

		// Delete a student
//		studentRepository.deleteById(4);

		// Find all records
		List<Student> students = studentRepository.findAll();
		for(Student s: students){
			System.out.println(s);
		}
	}
}
