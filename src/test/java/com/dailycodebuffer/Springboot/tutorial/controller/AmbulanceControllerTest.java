package com.dailycodebuffer.Springboot.tutorial.controller;

import com.dailycodebuffer.Springboot.tutorial.entity.Ambulance;
import com.dailycodebuffer.Springboot.tutorial.service.AmbulanceService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

//Controller layer is called when we hit any of the endpoints, so here also we have to hit our endpoints and check how endpoints are behaving
//for that we will be using webMockMVC
@WebMvcTest(AmbulanceController.class)
class AmbulanceControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AmbulanceService ambulanceService;

    private Ambulance department;

    @BeforeEach
    void setUp() {
//        creating the object, I will be using this particular object in my test cases
//        department = Ambulance.builder().departmentAddress("Ahmedabad").departmentCode("IT-06").departmentName("IT").departmentID(1L).build();
    }

    @Test
    void saveAmbulance() {
////        for input department, we wont be having the dep ID
//       Department inputDepartment = Department.builder().departmentAddress("Ahmedabad").departmentCode("IT-06").departmentName("IT").build();
////       need to mock it
//        Mockito.when(departmentService.saveDepartment(inputDepartment)).thenReturn(department);
//
//
////        we need to check the endpoint
//        mockMvc.perform(MockMvcRequestBuilders.post("")
//                .contentType(MediaType.APPLICATION_JSON);
//                .content({""
//{
//\t"departmentName":"IT",
//\t"departmentAddress":"Ahmedabad",
//\t"departmentCode":"IT-06"
//}""")).andExpect(MockMvcResultMatchers.status().isOk())
    }

    @Test
    void fetchAmbulanceById() {
    }
}