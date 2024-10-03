package com.te.ems.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Builder
public class Employee {
    @Id
  private String id;
    @Column(unique = true)
  private String employeeId;
  private String firstname;
  private String lastname;
  private LocalDate dateOfBirth;
  private LocalDate dateOfJoining;
  private double salary;

  @Enumerated
  private Gender gender;

  @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "employee")
  private List<Address>addresses;

  @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
  private BankAccount bankAccount;

  @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
  private List<Technology>technologies;
}
