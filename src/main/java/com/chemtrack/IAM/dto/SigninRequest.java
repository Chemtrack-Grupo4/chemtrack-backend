package com.chemtrack.IAM.dto;

import lombok.Data;

@Data
public class SigninRequest {
    private String username;
    private String password;
}