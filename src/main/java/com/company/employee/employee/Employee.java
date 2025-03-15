package com.company.employee.employee;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "employee-data")
public class Employee {
    @Id
    private String id;
    private String name;
    private String surname;
    private String email;
    private String image;
    private String biography;
    private String position;
    private String cellPhone;
    private LocalDateTime dateOfBirth;

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", image='" + image + '\'' +
                ", biography='" + biography + '\'' +
                ", position='" + position + '\'' +
                ", cellPhone='" + cellPhone + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
