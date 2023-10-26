package com.dailycodebuffer.Springboot.tutorial.repository;

import com.dailycodebuffer.Springboot.tutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//We will not create the class implementing the interface, rather we will extend the JPA repository bcz it gives us a lot of diff methods that we can use directly for interacting the entities with our database
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
