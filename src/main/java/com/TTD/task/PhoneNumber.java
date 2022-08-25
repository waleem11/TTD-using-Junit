package com.TTD.task;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhoneNumber {
    private String phoneNumber;

    public boolean checkPhoneFormat(String phoneNumber){
        if(phoneNumber.isBlank()){
            return false;
        }
        if(phoneNumber.length() != 11){
            return false;
        }
        if(!phoneNumber.startsWith("03")){
            return false;
        }
        if(phoneNumber.matches(".*[a-zA-Z]+.*")){
            return false;
        }
        return true;
    }
}
