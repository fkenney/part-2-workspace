package com.javatunes.personnel;

import static org.junit.Assert.*;

import gov.irs.TaxPayer;
import java.sql.Date;
import org.junit.Before;
import org.junit.Test;

public class HourlyEmployeeTest {

  private HourlyEmployee emp;
  private double taxes;
  private double pay;

  @Before
  public void setUp() throws Exception {
    emp = new HourlyEmployee("Martin",   Date.valueOf("2011-02-17"), 25.0, 20.0);
    taxes = emp.HOURLY_TAX_RATE * emp.getRate() * emp.getHours();
    pay = emp.getRate() * emp.getHours();

  }

  @Test
  public void pay() {
    assertEquals(25.0*20.0,emp.getRate()*emp.getHours(), 0.00001);
  }

  @Test
  public void payTaxes() {
    assertEquals(TaxPayer.HOURLY_TAX_RATE*25.0*20.0, emp.payTaxes(), 0.00001);
  }
}