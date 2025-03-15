package com.company.employee.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter

public class AuthenticationResponse {
    private final String token;

    public AuthenticationResponse(String token) {
        this.token = token;
    }

}
