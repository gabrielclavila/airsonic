/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 01:41:04 GMT 2024
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
      deviceLinkCodeResult0.setRegUrl("_,u\"gPDY]d_x=X);");
      String string0 = deviceLinkCodeResult0.getRegUrl();
      assertEquals("_,u\"gPDY]d_x=X);", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DeviceLinkCodeResult deviceLinkCodeResult0 = new DeviceLinkCodeResult();
      deviceLinkCodeResult0.regUrl = "";
      String string0 = deviceLinkCodeResult0.getRegUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DeviceLinkCodeResult deviceLinkCodeResult0 = new DeviceLinkCodeResult();
      deviceLinkCodeResult0.setLinkDeviceId(".7Hh5*=|%-");
      String string0 = deviceLinkCodeResult0.getLinkDeviceId();
      assertEquals(".7Hh5*=|%-", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DeviceLinkCodeResult deviceLinkCodeResult0 = new DeviceLinkCodeResult();
      deviceLinkCodeResult0.linkDeviceId = "";
      String string0 = deviceLinkCodeResult0.getLinkDeviceId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DeviceLinkCodeResult deviceLinkCodeResult0 = new DeviceLinkCodeResult();
      deviceLinkCodeResult0.setLinkCode("");
      String string0 = deviceLinkCodeResult0.getLinkCode();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DeviceLinkCodeResult deviceLinkCodeResult0 = new DeviceLinkCodeResult();
      String string0 = deviceLinkCodeResult0.getRegUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DeviceLinkCodeResult deviceLinkCodeResult0 = new DeviceLinkCodeResult();
      String string0 = deviceLinkCodeResult0.getLinkCode();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DeviceLinkCodeResult deviceLinkCodeResult0 = new DeviceLinkCodeResult();
      deviceLinkCodeResult0.setLinkCode("Cnf");
      String string0 = deviceLinkCodeResult0.getLinkCode();
      assertEquals("Cnf", string0);
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