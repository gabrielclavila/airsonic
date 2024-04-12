/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 01:06:36 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.GetContentKey;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GetContentKey_ESTest extends GetContentKey_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GetContentKey getContentKey0 = new GetContentKey();
      getContentKey0.setId("0");
      assertNull(getContentKey0.getUri());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GetContentKey getContentKey0 = new GetContentKey();
      getContentKey0.setUri(" 0ti(v;*");
      String string0 = getContentKey0.getUri();
      assertEquals(" 0ti(v;*", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GetContentKey getContentKey0 = new GetContentKey();
      getContentKey0.uri = "";
      String string0 = getContentKey0.getUri();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GetContentKey getContentKey0 = new GetContentKey();
      getContentKey0.id = ",z,`GbG2}/d";
      String string0 = getContentKey0.getId();
      assertEquals(",z,`GbG2}/d", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GetContentKey getContentKey0 = new GetContentKey();
      getContentKey0.id = "";
      String string0 = getContentKey0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      GetContentKey getContentKey0 = new GetContentKey();
      getContentKey0.setDeviceSessionToken(",z,`GbG2}/d");
      String string0 = getContentKey0.getDeviceSessionToken();
      assertEquals(",z,`GbG2}/d", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      GetContentKey getContentKey0 = new GetContentKey();
      String string0 = getContentKey0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      GetContentKey getContentKey0 = new GetContentKey();
      String string0 = getContentKey0.getUri();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      GetContentKey getContentKey0 = new GetContentKey();
      String string0 = getContentKey0.getDeviceSessionToken();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      GetContentKey getContentKey0 = new GetContentKey();
      getContentKey0.setDeviceSessionToken("");
      String string0 = getContentKey0.getDeviceSessionToken();
      assertEquals("", string0);
  }
}