package com.dailycodebuffer.Springboot.tutorial.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

//Using this annotation, this department class can now interact with my database
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {

//    for my entity, departmentId will be my primary key
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentID;
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
    @NotBlank(message = "Please add Department Name")
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
