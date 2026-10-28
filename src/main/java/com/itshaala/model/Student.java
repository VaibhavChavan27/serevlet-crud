package com.itshaala.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Builder
public class Student {
    private int id;
    private String name;
    private String email;
    private String phone;
}
