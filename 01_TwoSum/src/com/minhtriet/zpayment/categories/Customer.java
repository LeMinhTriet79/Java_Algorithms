package com.minhtriet.zpayment.categories;

import org.junit.Test;
import java.sql.Date;
import java.time.LocalDate;

import com.minhtriet.zpayment.common.Const;

public class Customer {
    private String fullName;
    private int yob;

    public Customer(String fullName, int yob) {
        this.fullName = fullName;
        this.yob = yob;
    }

    public Customer() {
        
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public int getAge() {
        return LocalDate.now().getYear() - this.yob + 1; 
    }


    
    public boolean checkAgeForCineStar() {
        if(Const.MIN_AGE <= this.getAge() && this.getAge() <= Const.MAX_AGE) {
            return true;
        } else {
            return false;
        }
    }
   
     
}
