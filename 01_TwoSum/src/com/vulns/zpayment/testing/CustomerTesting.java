package com.vulns.zpayment.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.minhtriet.zpayment.categories.Customer;

public class CustomerTesting {
    private final Customer customer = new Customer();

    @Test
    public void testCheckAgeForCineStar17() {
        customer.setYob(2000);
        customer.setFullName("Nguyen Van A");
        assertEquals(true,customer.checkAgeForCineStar() == true);
    }

    
    @Test
    public void testCheckAgeForCineStar18() {
        customer.setYob(2008);
        customer.setFullName("Trần Văn Ếch");
        assertEquals(true,customer.checkAgeForCineStar() == true);
    }

      @Test
    public void testCheckAgeForCineStar57() {
        customer.setYob(1947);
        customer.setFullName("Nguyễn Văn Hường");
        assertEquals(true,customer.checkAgeForCineStar() == true);
    }

        @Test
    public void testCheckAgeForCineSta() {
        customer.setYob(2006);
        customer.setFullName("Nguyễn Hữu Tài");
        assertEquals(true,customer.checkAgeForCineStar() == true);
    }
}
