package com.cursor.hw19.web.dto;

import lombok.Data;

@Data
public class ProfileDto {

    private Integer id;
    private String username;
    private String jobTitle;
    private String department;
    private String company;
    private String skill;
}
