package com.microservices.controller;

import com.microservices.constants.AccountsConstants;
import com.microservices.dto.CustomerDto;
import com.microservices.dto.ResponseDto;
import com.microservices.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

@RestController
@RequestMapping(path="/api",produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
public class AccountsController {

private IAccountsService iAccountsService;

     @PostMapping("/create")
    public ResponseEntity<ResponseDto> createAccount(@RequestBody CustomerDto customerDto){
    iAccountsService.createAccount(customerDto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto(AccountsConstants.STATUS_201,AccountsConstants.MESSAGE_201));
    }

    @GetMapping("/fetch")
    public ResponseEntity<CustomerDto> fetchAccountDetails(@RequestParam String mobileNumber){
        CustomerDto customerDto = iAccountsService.fetchAccount(mobileNumber);
        return ResponseEntity.status(HttpStatus.OK).body(customerDto);
    }
    @PutMapping("/update")
    public ResponseEntity<ResponseDto> updateAccountDetails(@RequestBody CustomerDto customerDto){
         boolean isUpdated=iAccountsService.updateAccount(customerDto);
         if(isUpdated){
             return ResponseEntity
                     .status(HttpStatus.OK)
                     .body(new ResponseDto(AccountsConstants.STATUS_200,AccountsConstants.MESSAGE_200));
         }else {
             return ResponseEntity
                     .status(HttpStatus.INTERNAL_SERVER_ERROR)
                     .body(new ResponseDto(AccountsConstants.STATUS_500,AccountsConstants.MESSAGE_500));
         }
    }
}
