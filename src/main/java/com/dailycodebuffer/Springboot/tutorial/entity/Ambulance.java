package com.dailycodebuffer.Springboot.tutorial.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//Using this annotation, this ambulance class can now interact with my database
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ambulance {

//    for my entity, ambulanceId will be my primary key
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ambulanceID;
//    Adding the validation for name using hibernate validation, whenever I am getting the data in input from the client, I want dep name always otherwise invalid

//    @Length(max = 5, min = 1)
//    @Size
//    @Email
//    @Positive
//    @Negative
//    @PositiveOrZero
//    @NegativeOrZero
//    @Future
//    there are many more validations
    @NotBlank(message = "Please add Ambulance Name")
    private String driverName;
    private String latitude;
    private String longitude;
    private String availability;
    private String phoneNo;
}
