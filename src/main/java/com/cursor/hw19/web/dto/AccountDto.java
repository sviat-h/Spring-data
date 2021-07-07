package com.cursor.hw19.web.dto;

import com.cursor.hw19.domain.model.Profile;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountDto {

    private String firstName;
    private String lastName;
    private String city;
    private String gender;
    private String username;
    private Profile profile;
}
