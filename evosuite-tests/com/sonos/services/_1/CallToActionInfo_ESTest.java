/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 01:13:43 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.CallToActionInfo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CallToActionInfo_ESTest extends CallToActionInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CallToActionInfo callToActionInfo0 = new CallToActionInfo();
      callToActionInfo0.setUrlStringId("");
      assertNull(callToActionInfo0.getUrl());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CallToActionInfo callToActionInfo0 = new CallToActionInfo();
      callToActionInfo0.urlStringId = "}|/t;dVU*0=";
      String string0 = callToActionInfo0.getUrlStringId();
      assertEquals("}|/t;dVU*0=", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CallToActionInfo callToActionInfo0 = new CallToActionInfo();
      callToActionInfo0.urlStringId = "";
      String string0 = callToActionInfo0.getUrlStringId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CallToActionInfo callToActionInfo0 = new CallToActionInfo();
      callToActionInfo0.url = "%v";
      String string0 = callToActionInfo0.getUrl();
      assertEquals("%v", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CallToActionInfo callToActionInfo0 = new CallToActionInfo();
      callToActionInfo0.setUrl("");
      String string0 = callToActionInfo0.getUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CallToActionInfo callToActionInfo0 = new CallToActionInfo();
      callToActionInfo0.setMessageStringId("!");
      String string0 = callToActionInfo0.getMessageStringId();
      assertEquals("!", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CallToActionInfo callToActionInfo0 = new CallToActionInfo();
      callToActionInfo0.messageStringId = "";
      String string0 = callToActionInfo0.getMessageStringId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CallToActionInfo callToActionInfo0 = new CallToActionInfo();
      String string0 = callToActionInfo0.getMessageStringId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CallToActionInfo callToActionInfo0 = new CallToActionInfo();
      String string0 = callToActionInfo0.getUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      CallToActionInfo callToActionInfo0 = new CallToActionInfo();
      String string0 = callToActionInfo0.getUrlStringId();
      assertNull(string0);
  }
}
