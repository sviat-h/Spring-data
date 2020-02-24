package com.cursor.hw19.web.dto;

import com.cursor.hw19.domain.model.Profile;
import lombok.Data;

@Data
public class AccountDto {

    private Integer id;
    private String firstName;
    private String lastName;
    private String city;
    private String gender;
    private String username;
    private int profileId;
    private Profile profile;
}
