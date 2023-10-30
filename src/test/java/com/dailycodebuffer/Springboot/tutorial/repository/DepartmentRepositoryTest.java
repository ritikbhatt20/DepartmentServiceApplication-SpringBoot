//package com.dailycodebuffer.Springboot.tutorial.repository;
//
//import com.dailycodebuffer.Springboot.tutorial.entity.Department;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//
//import static org.junit.jupiter.api.Assertions.*;
////this annotation used particulary for repository layer unit testing
//@DataJpaTest
//class DepartmentRepositoryTest {
//
////    for repository unit testing, we will be testing findById in the JPA repository
//    @Autowired
//    private DepartmentRepository departmentRepository;
//    @Autowired
//    private TestEntityManager entityManager;
//
//    @BeforeEach
//    void setUp() {
////        we are saving this data in our database, when our testcase will be done our data will be deleted
//        Department department =
//                Department.builder()
//                        .departmentName("Mechanical")
//                        .departmentCode("ME - 011")
//                        .departmentAddress("Delhi").build();
//        entityManager.persist(department); //this particular data will persist before I call my actual testcase
//    }
//    @Test //testcase
//    @Disabled
//    public void whenFindById_thenReturnDepartment(){
//        Department department = departmentRepository.findById(1L).get();
//        assertEquals(department.getDepartmentName(), "Mechanical");
//    }
//}