package com.javatunes.personnel;

import static org.junit.Assert.*;

import gov.irs.TaxPayer;
import java.sql.Date;
import org.junit.Before;
import org.junit.Test;

public class SalariedEmployeeTest {

  private SalariedEmployee emp;
  private SalariedEmployee  emp2;
  private SalariedEmployee  emp3;
  private double taxes;

  @Before
  public void setUp() throws Exception {
    emp = new SalariedEmployee("nameTest", Date.valueOf("2015-03-31"), 1000.00);

  }

  @Test
  public void pay() {
    assertEquals(1000.00, emp.getSalary(), 0.00001);
  }

  @Test
  public void payTaxes() {
    assertEquals(1000.00 * TaxPayer.SALARIED_TAX_RATE, emp.payTaxes(), 0.00001);
  }
  @Test
  public void equals_same(){
    emp2 = new SalariedEmployee("nameTest", Date.valueOf("2015-03-31"), 1000.00);
    assertEquals(emp, emp2);
  }
  @Test
  public void equals_diff(){
    emp3 = new SalariedEmployee("nameTest2", Date.valueOf("2015-03-31"), 1000.00);
    assertNotEquals(emp, emp3);
  }
  @Test
  public void hashcode_same(){
    emp2 = new SalariedEmployee("nameTest", Date.valueOf("2015-03-31"), 1000.00);
    assertEquals(emp.hashCode(), emp2.hashCode());
  }

  @Test
  public void hashcode_diff(){
    emp2 = new SalariedEmployee("nameTest", Date.valueOf("2015-04-31"), 1000.00);
    assertNotEquals(emp.hashCode(), emp2.hashCode());
  }
}