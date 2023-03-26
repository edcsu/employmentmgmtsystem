package com.skecorp.employmentmgmtsystem.dtos;

import com.skecorp.employmentmgmtsystem.entities.Gender;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeDto {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private Gender gender;
    private LocalDate BirthDate;
    private LocalDate StartDate;
}
