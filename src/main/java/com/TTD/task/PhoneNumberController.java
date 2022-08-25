package com.TTD.task;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/check")
public class PhoneNumberController {
    @GetMapping("/{phone}")
    public String checkPhoneNumber(@PathVariable String phone){
        PhoneNumber phoneNumber = new PhoneNumber();
        if(phoneNumber.checkPhoneFormat(phone)){
            phoneNumber.setPhoneNumber(phone);
            return "correct Entry";
        }
        else{
            return "incorrect Entry";
        }
    }
}
