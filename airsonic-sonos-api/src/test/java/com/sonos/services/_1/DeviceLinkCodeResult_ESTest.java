/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 14:29:26 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.DeviceLinkCodeResult;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DeviceLinkCodeResult_ESTest extends DeviceLinkCodeResult_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DeviceLinkCodeResult deviceLinkCodeResult0 = new DeviceLinkCodeResult();
      deviceLinkCodeResult0.regUrl = "I[c-:S7Us0";
      String string0 = deviceLinkCodeResult0.getRegUrl();
      assertEquals("I[c-:S7Us0", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DeviceLinkCodeResult deviceLinkCodeResult0 = new DeviceLinkCodeResult();
      deviceLinkCodeResult0.setRegUrl("");
      String string0 = deviceLinkCodeResult0.getRegUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DeviceLinkCodeResult deviceLinkCodeResult0 = new DeviceLinkCodeResult();
      deviceLinkCodeResult0.linkDeviceId = "(";
      String string0 = deviceLinkCodeResult0.getLinkDeviceId();
      assertEquals("(", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DeviceLinkCodeResult deviceLinkCodeResult0 = new DeviceLinkCodeResult();
      deviceLinkCodeResult0.setLinkDeviceId("");
      String string0 = deviceLinkCodeResult0.getLinkDeviceId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DeviceLinkCodeResult deviceLinkCodeResult0 = new DeviceLinkCodeResult();
      deviceLinkCodeResult0.setLinkCode("x-xm(*WJC}zE6");
      String string0 = deviceLinkCodeResult0.getLinkCode();
      assertEquals("x-xm(*WJC}zE6", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DeviceLinkCodeResult deviceLinkCodeResult0 = new DeviceLinkCodeResult();
      deviceLinkCodeResult0.linkCode = "";
      String string0 = deviceLinkCodeResult0.getLinkCode();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DeviceLinkCodeResult deviceLinkCodeResult0 = new DeviceLinkCodeResult();
      String string0 = deviceLinkCodeResult0.getRegUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DeviceLinkCodeResult deviceLinkCodeResult0 = new DeviceLinkCodeResult();
      String string0 = deviceLinkCodeResult0.getLinkCode();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DeviceLinkCodeResult deviceLinkCodeResult0 = new DeviceLinkCodeResult();
      boolean boolean0 = deviceLinkCodeResult0.isShowLinkCode();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DeviceLinkCodeResult deviceLinkCodeResult0 = new DeviceLinkCodeResult();
      deviceLinkCodeResult0.setShowLinkCode(true);
      boolean boolean0 = deviceLinkCodeResult0.isShowLinkCode();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DeviceLinkCodeResult deviceLinkCodeResult0 = new DeviceLinkCodeResult();
      String string0 = deviceLinkCodeResult0.getLinkDeviceId();
      assertNull(string0);
  }
}