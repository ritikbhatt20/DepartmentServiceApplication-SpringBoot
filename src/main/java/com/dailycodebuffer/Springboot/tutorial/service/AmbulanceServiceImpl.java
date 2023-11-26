package com.dailycodebuffer.Springboot.tutorial.service;

import com.dailycodebuffer.Springboot.tutorial.entity.Ambulance;
import com.dailycodebuffer.Springboot.tutorial.error.AmbulanceNotFoundException;
import com.dailycodebuffer.Springboot.tutorial.repository.AmbulanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class AmbulanceServiceImpl implements AmbulanceService {

    @Autowired
    private AmbulanceRepository ambulanceRepository;
    @Override
    public Ambulance saveAmbulance(Ambulance ambulance) {

        return ambulanceRepository.save(ambulance);
    }

    @Override
    public List<Ambulance> fetchAmbulanceList() {
//        this part method findall will return all the ambulances
        return ambulanceRepository.findAll();
    }

    @Override
    public Ambulance fetchAmbulanceById(Long ambulanceId) throws AmbulanceNotFoundException {
//        return ambulanceRepository.findById(ambulanceId).get();
//        implementing exception handling, if there is no ambulance present we will handle the exception, throw the error
        Optional<Ambulance> ambulance = ambulanceRepository.findById(ambulanceId);

        if(ambulance.isEmpty()){
            throw new AmbulanceNotFoundException("Ambulance not available");
        }
        return ambulance.get();
    }

    @Override
    public void deleteAmbulanceById(Long ambulanceId) {
        ambulanceRepository.deleteById(ambulanceId);
    }

    @Override
    public Ambulance updateAmbulance(Long ambulanceId, Ambulance ambulance) {
//     we will first get the ambulance that is already available in the database, get that particular object,
        Ambulance depDB = ambulanceRepository.findById(ambulanceId).get();
        
//     update the fields that we want to change
        if(Objects.nonNull(ambulance.getDriverName()) && !"".equalsIgnoreCase(ambulance.getDriverName())){
            depDB.setDriverName(ambulance.getDriverName());
        }
        if(Objects.nonNull(ambulance.getLatitude()) && !"".equalsIgnoreCase(ambulance.getLatitude())){
            depDB.setLatitude(ambulance.getLatitude());
        }
        if(Objects.nonNull(ambulance.getLongitude()) && !"".equalsIgnoreCase(ambulance.getLongitude())){
            depDB.setLongitude(ambulance.getLongitude());
        }
        if(Objects.nonNull(ambulance.getAvailability()) && !"".equalsIgnoreCase(ambulance.getAvailability())){
            depDB.setLongitude(ambulance.getAvailability());
        }
        if(Objects.nonNull(ambulance.getPhoneNo()) && !"".equalsIgnoreCase(ambulance.getPhoneNo())){
            depDB.setLongitude(ambulance.getPhoneNo());
        }
        return ambulanceRepository.save(depDB);
    }


//    @Override
//    public Ambulance fetchAmbulanceByName(String driverName) {
////        Now for fetching the data from our ambulance name, there is no particular method in the JPA repository
//        return ambulanceRepository.findByAmbulanceName(driverName);
////        return ambulanceRepository.findByAmbulanceNameIgnoreCase(ambulanceName);


}
