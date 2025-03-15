package com.company.employee.user;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users")
public class MyUser {
    @Id
    private String id;
    private String name;

    @Indexed(unique = true)
    private String email;
    private String password;
    private String role; //Eg: ADMIN, EMPLOYEE


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


