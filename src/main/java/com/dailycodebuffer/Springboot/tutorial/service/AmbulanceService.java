package com.dailycodebuffer.Springboot.tutorial.service;

import com.dailycodebuffer.Springboot.tutorial.entity.Ambulance;
import com.dailycodebuffer.Springboot.tutorial.error.AmbulanceNotFoundException;

import java.util.List;

public interface AmbulanceService {
   public Ambulance saveAmbulance(Ambulance ambulance);

   public List<Ambulance> fetchAmbulanceList();

   public Ambulance fetchAmbulanceById(Long ambulanceId) throws AmbulanceNotFoundException;

   public void deleteAmbulanceById(Long ambulanceId);

   public Ambulance updateAmbulance(Long ambulanceId, Ambulance ambulance);

//   public Ambulance fetchAmbulanceByName(String ambulanceName);

}
