package com.dailycodebuffer.Springboot.tutorial.repository;

import com.dailycodebuffer.Springboot.tutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

//We will not create the class implementing the interface, rather we will extend the JPA repository bcz it gives us a lot of diff methods that we can use directly for interacting the entities with our database
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
//    creating the method to fetch data by department name
     public Department findByDepartmentName(String departmentName);

     public Department findByDepartmentNameIgnoreCase(String departmentName);

//     Either directly use the method names in Query creation, if not possible go will the JPQL
//     then also if you face some diff, you can always go ahead with the SQL queries natively also
//     @Query(value = "", nativeQuery = true)
}


