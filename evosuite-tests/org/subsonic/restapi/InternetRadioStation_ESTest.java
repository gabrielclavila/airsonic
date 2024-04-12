/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 11 00:45:47 GMT 2024
 */

package org.subsonic.restapi;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.subsonic.restapi.InternetRadioStation;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InternetRadioStation_ESTest extends InternetRadioStation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      InternetRadioStation internetRadioStation0 = new InternetRadioStation();
      internetRadioStation0.streamUrl = "S0A";
      String string0 = internetRadioStation0.getStreamUrl();
      assertEquals("S0A", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InternetRadioStation internetRadioStation0 = new InternetRadioStation();
      internetRadioStation0.setStreamUrl("");
      String string0 = internetRadioStation0.getStreamUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InternetRadioStation internetRadioStation0 = new InternetRadioStation();
      internetRadioStation0.setName("S0A");
      String string0 = internetRadioStation0.getName();
      assertEquals("S0A", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InternetRadioStation internetRadioStation0 = new InternetRadioStation();
      internetRadioStation0.setName("");
      String string0 = internetRadioStation0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      InternetRadioStation internetRadioStation0 = new InternetRadioStation();
      internetRadioStation0.setId("");
      String string0 = internetRadioStation0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      InternetRadioStation internetRadioStation0 = new InternetRadioStation();
      internetRadioStation0.setHomePageUrl("P0hN|[<i");
      String string0 = internetRadioStation0.getHomePageUrl();
      assertEquals("P0hN|[<i", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InternetRadioStation internetRadioStation0 = new InternetRadioStation();
      String string0 = internetRadioStation0.getStreamUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InternetRadioStation internetRadioStation0 = new InternetRadioStation();
      internetRadioStation0.setId("P0hN|[<i");
      String string0 = internetRadioStation0.getId();
      assertEquals("P0hN|[<i", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InternetRadioStation internetRadioStation0 = new InternetRadioStation();
      String string0 = internetRadioStation0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InternetRadioStation internetRadioStation0 = new InternetRadioStation();
      internetRadioStation0.setHomePageUrl("");
      String string0 = internetRadioStation0.getHomePageUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InternetRadioStation internetRadioStation0 = new InternetRadioStation();
      String string0 = internetRadioStation0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InternetRadioStation internetRadioStation0 = new InternetRadioStation();
      String string0 = internetRadioStation0.getHomePageUrl();
      assertNull(string0);
  }
}