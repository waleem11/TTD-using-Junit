package com.TTD.task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneNumberTest {

    @Test
    public void validatePhoneNumberTest() {
        PhoneNumber phoneNumber = new PhoneNumber();
        String tmp =  "923124249251";
        String tmp1 =  "9233233jhfhkk";
        String tmp2 =  "99233777777";
        String tmp3 =  "9232334444444444";
        String tmp4 =  "923233";
        assertTrue(phoneNumber.checkPhoneFormat(tmp));
        assertFalse((phoneNumber.checkPhoneFormat(tmp1)));
        assertFalse((phoneNumber.checkPhoneFormat(tmp2)));
        assertFalse((phoneNumber.checkPhoneFormat(tmp3)));
        assertFalse((phoneNumber.checkPhoneFormat(tmp4)));
    }
}