/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 01:46:46 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.AppLinkInfo;
import com.sonos.services._1.DeviceLinkCodeResult;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AppLinkInfo_ESTest extends AppLinkInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AppLinkInfo appLinkInfo0 = new AppLinkInfo();
      appLinkInfo0.failureUrlStringId = "com.sonos.services._1.DeviceLinkCodeResult";
      String string0 = appLinkInfo0.getFailureUrlStringId();
      assertEquals("com.sonos.services._1.DeviceLinkCodeResult", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AppLinkInfo appLinkInfo0 = new AppLinkInfo();
      appLinkInfo0.setFailureUrlStringId("");
      String string0 = appLinkInfo0.getFailureUrlStringId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AppLinkInfo appLinkInfo0 = new AppLinkInfo();
      appLinkInfo0.setFailureUrl("g +f$K_yla-n~h");
      String string0 = appLinkInfo0.getFailureUrl();
      assertEquals("g +f$K_yla-n~h", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AppLinkInfo appLinkInfo0 = new AppLinkInfo();
      appLinkInfo0.setFailureUrl("");
      String string0 = appLinkInfo0.getFailureUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AppLinkInfo appLinkInfo0 = new AppLinkInfo();
      appLinkInfo0.setFailureStringId("(aI");
      String string0 = appLinkInfo0.getFailureStringId();
      assertEquals("(aI", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AppLinkInfo appLinkInfo0 = new AppLinkInfo();
      appLinkInfo0.failureStringId = "com.sonos.services._1.AppLinkInfo";
      appLinkInfo0.failureStringId = "";
      String string0 = appLinkInfo0.getFailureStringId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AppLinkInfo appLinkInfo0 = new AppLinkInfo();
      DeviceLinkCodeResult deviceLinkCodeResult0 = new DeviceLinkCodeResult();
      deviceLinkCodeResult0.showLinkCode = true;
      appLinkInfo0.deviceLink = deviceLinkCodeResult0;
      DeviceLinkCodeResult deviceLinkCodeResult1 = appLinkInfo0.getDeviceLink();
      assertNull(deviceLinkCodeResult1.getLinkCode());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AppLinkInfo appLinkInfo0 = new AppLinkInfo();
      DeviceLinkCodeResult deviceLinkCodeResult0 = new DeviceLinkCodeResult();
      appLinkInfo0.setDeviceLink(deviceLinkCodeResult0);
      DeviceLinkCodeResult deviceLinkCodeResult1 = appLinkInfo0.getDeviceLink();
      assertFalse(deviceLinkCodeResult1.isShowLinkCode());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AppLinkInfo appLinkInfo0 = new AppLinkInfo();
      appLinkInfo0.setAppUrlStringId("OXO7");
      String string0 = appLinkInfo0.getAppUrlStringId();
      assertEquals("OXO7", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AppLinkInfo appLinkInfo0 = new AppLinkInfo();
      appLinkInfo0.appUrlStringId = "";
      String string0 = appLinkInfo0.getAppUrlStringId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AppLinkInfo appLinkInfo0 = new AppLinkInfo();
      appLinkInfo0.appUrl = "com.sonos.services._1.DeviceLinkCodeResult";
      String string0 = appLinkInfo0.getAppUrl();
      assertEquals("com.sonos.services._1.DeviceLinkCodeResult", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AppLinkInfo appLinkInfo0 = new AppLinkInfo();
      appLinkInfo0.setAppUrl("");
      String string0 = appLinkInfo0.getAppUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AppLinkInfo appLinkInfo0 = new AppLinkInfo();
      String string0 = appLinkInfo0.getAppUrlStringId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AppLinkInfo appLinkInfo0 = new AppLinkInfo();
      String string0 = appLinkInfo0.getFailureUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AppLinkInfo appLinkInfo0 = new AppLinkInfo();
      String string0 = appLinkInfo0.getAppUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AppLinkInfo appLinkInfo0 = new AppLinkInfo();
      DeviceLinkCodeResult deviceLinkCodeResult0 = appLinkInfo0.getDeviceLink();
      assertNull(deviceLinkCodeResult0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AppLinkInfo appLinkInfo0 = new AppLinkInfo();
      String string0 = appLinkInfo0.getFailureStringId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AppLinkInfo appLinkInfo0 = new AppLinkInfo();
      String string0 = appLinkInfo0.getFailureUrlStringId();
      assertNull(string0);
  }
}
