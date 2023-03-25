package com.skecorp.employmentmgmtsystem.mappers;

import com.skecorp.employmentmgmtsystem.dtos.EmployeeDto;
import com.skecorp.employmentmgmtsystem.entities.Employee;

public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail(),
                employee.getGender(),
                employee.getBirthDate(),
                employee.getStartDate()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail(),
                employeeDto.getGender(),
                employeeDto.getBirthDate(),
                employeeDto.getStartDate()
        );
    }
}
