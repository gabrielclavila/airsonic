/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 14:28:40 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.DeviceAuthTokenResult;
import com.sonos.services._1.UserInfo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DeviceAuthTokenResult_ESTest extends DeviceAuthTokenResult_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DeviceAuthTokenResult deviceAuthTokenResult0 = new DeviceAuthTokenResult();
      UserInfo userInfo0 = new UserInfo();
      deviceAuthTokenResult0.setUserInfo(userInfo0);
      UserInfo userInfo1 = deviceAuthTokenResult0.getUserInfo();
      assertSame(userInfo1, userInfo0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DeviceAuthTokenResult deviceAuthTokenResult0 = new DeviceAuthTokenResult();
      deviceAuthTokenResult0.privateKey = "oY::FdC#6*5";
      String string0 = deviceAuthTokenResult0.getPrivateKey();
      assertEquals("oY::FdC#6*5", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DeviceAuthTokenResult deviceAuthTokenResult0 = new DeviceAuthTokenResult();
      deviceAuthTokenResult0.setPrivateKey("");
      String string0 = deviceAuthTokenResult0.getPrivateKey();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DeviceAuthTokenResult deviceAuthTokenResult0 = new DeviceAuthTokenResult();
      deviceAuthTokenResult0.setAuthToken(",w4LZl6JuT");
      String string0 = deviceAuthTokenResult0.getAuthToken();
      assertEquals(",w4LZl6JuT", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DeviceAuthTokenResult deviceAuthTokenResult0 = new DeviceAuthTokenResult();
      deviceAuthTokenResult0.authToken = "";
      String string0 = deviceAuthTokenResult0.getAuthToken();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DeviceAuthTokenResult deviceAuthTokenResult0 = new DeviceAuthTokenResult();
      String string0 = deviceAuthTokenResult0.getPrivateKey();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DeviceAuthTokenResult deviceAuthTokenResult0 = new DeviceAuthTokenResult();
      String string0 = deviceAuthTokenResult0.getAuthToken();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DeviceAuthTokenResult deviceAuthTokenResult0 = new DeviceAuthTokenResult();
      UserInfo userInfo0 = deviceAuthTokenResult0.getUserInfo();
      assertNull(userInfo0);
  }
}