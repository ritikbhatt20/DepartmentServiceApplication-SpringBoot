package com.dailycodebuffer.Springboot.tutorial.controller;

import com.dailycodebuffer.Springboot.tutorial.entity.Ambulance;
import com.dailycodebuffer.Springboot.tutorial.error.AmbulanceNotFoundException;
import com.dailycodebuffer.Springboot.tutorial.service.AmbulanceService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//This annotation, so we can create the REST Api over here
@RestController
public class AmbulanceController {

//    To Autowire the object that you have in your spring container to this interface/ref that we have created
    @Autowired
    private AmbulanceService ambulanceService;

//    Adding logger implementation to add diff loggers
    private final Logger LOGGER = LoggerFactory.getLogger(AmbulanceController.class);

    @PostMapping("/ambulances")
   public Ambulance saveAmbulance(@Valid @RequestBody Ambulance ambulance){
//      Post request that I will do from any of the rest client, I will be passing the request body as well, that will be entire json object
//        convert the entire json object into the dep. object
//        Now I will have to call the service layer to pass this data to do all the business logic
//        and after that I can call the repository layer to save the particular data in my database

        LOGGER.info("Inside saveAmbulance of AmbulanceController");
        return ambulanceService.saveAmbulance(ambulance);
   }

   @GetMapping("/ambulances")
//   we will not have to take any inputs over here since we will only have to return list of ambulances
   public List<Ambulance> fetchAmbulanceList(){
       LOGGER.info("Inside fetchAmbulanceList of AmbulanceController");
        return ambulanceService.fetchAmbulanceList();
   }

//   We will further add a path variable that will be dynamic..
   @GetMapping("/ambulances/{id}")
   public Ambulance fetchAmbulanceById(@PathVariable("id") Long ambulanceId) throws AmbulanceNotFoundException {

//        we will be implementing here Custom Exception Handling and throw that exception and we will handle it
        return ambulanceService.fetchAmbulanceById(ambulanceId);
   }

   @DeleteMapping("/ambulances/{id}")
   public String deleteAmbulanceById(@PathVariable("id") Long ambulanceId){
        ambulanceService.deleteAmbulanceById(ambulanceId);
        return "Ambulance deleted Successfully";
   }

   @PutMapping("/ambulances/{id}")
   public Ambulance updateAmbulance(@PathVariable("id") Long ambulanceId, @RequestBody Ambulance ambulance){
        return ambulanceService.updateAmbulance(ambulanceId, ambulance);
   }

//   creating some new endpoints, fetch data by name
//    @GetMapping("/ambulances/name/{name}")
//    public Ambulance fetchAmbulanceByName(@PathVariable("name") String ambulanceName){
//        return ambulanceService.fetchAmbulanceByName(ambulanceName);
//    }
}

