/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 15:48:42 GMT 2024
 */

package org.subsonic.restapi;

import org.junit.Test;
import static org.junit.Assert.*;
import javax.xml.datatype.XMLGregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.subsonic.restapi.License;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class License_ESTest extends License_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      License license0 = new License();
      license0.setEmail(")5Me");
      String string0 = license0.getEmail();
      assertEquals(")5Me", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      License license0 = new License();
      license0.email = "";
      String string0 = license0.getEmail();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      License license0 = new License();
      license0.setTrialExpires((XMLGregorianCalendar) null);
      assertFalse(license0.isValid());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      License license0 = new License();
      XMLGregorianCalendar xMLGregorianCalendar0 = license0.getTrialExpires();
      assertNull(xMLGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      License license0 = new License();
      boolean boolean0 = license0.isValid();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      License license0 = new License();
      license0.setLicenseExpires((XMLGregorianCalendar) null);
      assertNull(license0.getEmail());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      License license0 = new License();
      String string0 = license0.getEmail();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      License license0 = new License();
      XMLGregorianCalendar xMLGregorianCalendar0 = license0.getLicenseExpires();
      assertNull(xMLGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      License license0 = new License();
      license0.setValid(true);
      boolean boolean0 = license0.isValid();
      assertTrue(boolean0);
  }
}
