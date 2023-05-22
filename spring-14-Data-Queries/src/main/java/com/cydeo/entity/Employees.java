package com.cydeo.entity;

import com.cydeo.enums.Gender;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class Employees extends BaseEntity {

    private String firstName;
    private String lastName;
    private String email;
    @Column(columnDefinition = "DATE")
    private LocalDate hireDate;

    @ManyToOne
    @JoinColumn(name = "department")
    private Department department;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private Integer salary;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;
}
