package com.user.registration.system.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {
    private Integer userId;
    @NotBlank(message = "Email is mandatory and it cannot be empty or null")
    private String email;
    @NotBlank(message = "mobileNumber is mandatory and it cannot be empty or null")
    private String mobileNumber;
    @NotNull(message = "Date Of Birth is mandatory and it cannot be null")
    private LocalDate dateOfBirth;
}
