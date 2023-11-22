package com.user.registration.system.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "email",unique = true, nullable = false)
    private String email;
    @Column(name = "mobile_number",unique = true)
    private String mobileNumber;
    @Column(name = "dob")
    private LocalDate dateOfBirth;
}
