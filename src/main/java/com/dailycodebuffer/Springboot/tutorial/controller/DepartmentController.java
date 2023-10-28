package com.dailycodebuffer.Springboot.tutorial.controller;

import com.dailycodebuffer.Springboot.tutorial.entity.Department;
import com.dailycodebuffer.Springboot.tutorial.error.DepartmentNotFoundException;
import com.dailycodebuffer.Springboot.tutorial.service.DepartmentService;
import com.dailycodebuffer.Springboot.tutorial.service.DepartmentServiceImpl;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.PutExchange;

import java.util.List;

//This annotation, so we can create the REST Api over here
@RestController
public class DepartmentController {

//    To Autowire the object that you have in your spring container to this interface/ref that we have created
    @Autowired
    private DepartmentService departmentService;

//    Adding logger implementation to add diff loggers
    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/departments")
   public Department saveDepartment(@Valid @RequestBody Department department){
//      Post request that I will do from any of the rest client, I will be passing the request body as well, that will be entire json object
//        convert the entire json object into the dep. object
//        Now I will have to call the service layer to pass this data to do all the business logic
//        and after that I can call the repository layer to save the particular data in my database

        LOGGER.info("Inside saveDepartment of DepartmentController");
        return departmentService.saveDepartment(department);
   }

   @GetMapping("/departments")
//   we will not have to take any inputs over here since we will only have to return list of departments
   public List<Department> fetchDepartmentList(){
       LOGGER.info("Inside fetchDepartmentList of DepartmentController");
        return departmentService.fetchDepartmentList();
   }

//   We will further add a path variable that will be dynamic..
   @GetMapping("/departments/{id}")
   public Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {

//        we will be implementing here Custom Exception Handling and throw that exception and we will handle it
        return departmentService.fetchDepartmentById(departmentId);
   }

   @DeleteMapping("/departments/{id}")
   public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "Department deleted Successfully";
   }

   @PutMapping("/departments/{id}")
   public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department){
        return departmentService.updateDepartment(departmentId, department);
   }

//   creating some new endpoints, fetch data by name
    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
        return departmentService.fetchDepartmentByName(departmentName);
    }
}

