package com.example.dbexample.personClass;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {
    private Long id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String address;
}
