package com.example.demo.dao;

import com.example.demo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAO {
    private EntityManager entityManager;

    public StudentDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Transactional
    public void save(Student student){
        entityManager.persist(student);
    }

    public List<Student> findAll(){
        return entityManager.createQuery("FROM Student", Student.class).getResultList();
    }

    public Student findById(int id){
        return entityManager.find(Student.class, id);
    }

    @Transactional
    public void update(Student student){
        entityManager.merge(student);
    }

    @Transactional
    public void delete(int id){
        Student student = entityManager.find(Student.class, id);
        entityManager.remove(student);
    }
}
