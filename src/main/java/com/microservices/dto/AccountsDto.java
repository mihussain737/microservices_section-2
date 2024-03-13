package com.microservices.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountsDto {

    @NotEmpty(message = "Account Number can't be null or empty")
    @Pattern(regexp = "(^|[0-9]{10})", message = "Account number must be 10 digit ")
    private  Long accountNumber;

    @NotEmpty(message = "Account Type can't be null or empty")
    private String accountType;

    @NotEmpty(message = "Branch Address can't be null or empty")
    private String branchAddress;
}
