//package com.dailycodebuffer.Springboot.tutorial.service;
//
//import com.dailycodebuffer.Springboot.tutorial.entity.Department;
//import com.dailycodebuffer.Springboot.tutorial.repository.DepartmentRepository;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import static org.junit.jupiter.api.Assertions.*;
////springBootTest annotation to tell the spring boot that this is a particular test class
//@SpringBootTest
//class DepartmentServiceTest {
//
//    @Autowired
//    private DepartmentService departmentService;
//
//    @MockBean
//    private DepartmentRepository departmentRepository;
//
//    @BeforeEach
//    void setUp() {
////        We are mocking the repository class and giving this as a mock object
//        Department department = Department.builder().
//                                 departmentName("IT").
//                                 departmentAddress("Ahmedabad").
//                                 departmentCode("IT-06").
//                                 departmentID(1L).build();
//
////        passing the created obj to the repository layer
//        Mockito.when(departmentRepository.findByDepartmentName("IT")).thenReturn(department);
//    }
//    @Test
//    @DisplayName("Get Data based on Valid Department Name") //To make it in a readable format
//    @Disabled
//    public void whenValidDepartmentName_thenDepartmentShouldFound(){
//        String departmentName = "IT";
//        Department found = departmentService.fetchDepartmentByName(departmentName);
//        assertEquals(departmentName, found.getDepartmentName()); //if both are equal test case will pass
////      now this fetchDepartmentByName method will use the repository layer but we only need to test service layer so we need to mock it...
//    }
//}