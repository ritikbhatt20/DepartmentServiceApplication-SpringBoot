package com.dailycodebuffer.Springboot.tutorial.repository;

import com.dailycodebuffer.Springboot.tutorial.entity.Ambulance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//We will not create the class implementing the interface, rather we will extend the JPA repository bcz it gives us a lot of diff methods that we can use directly for interacting the entities with our database
@Repository
public interface AmbulanceRepository extends JpaRepository<Ambulance, Long> {
//    creating the method to fetch data by ambulance name
//     public Ambulance findByAmbulanceName(String driverName);

//     public Ambulance findByAmbulanceNameIgnoreCase(String ambulanceName);

//     Either directly use the method names in Query creation, if not possible go will the JPQL
//     then also if you face some diff, you can always go ahead with the SQL queries natively also
//     @Query(value = "", nativeQuery = true)
}


