/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 14:29:37 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.GetUserInfoResponse;
import com.sonos.services._1.UserInfo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GetUserInfoResponse_ESTest extends GetUserInfoResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GetUserInfoResponse getUserInfoResponse0 = new GetUserInfoResponse();
      UserInfo userInfo0 = new UserInfo();
      getUserInfoResponse0.setGetUserInfoResult(userInfo0);
      UserInfo userInfo1 = getUserInfoResponse0.getGetUserInfoResult();
      assertNull(userInfo1.getAccountType());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GetUserInfoResponse getUserInfoResponse0 = new GetUserInfoResponse();
      UserInfo userInfo0 = getUserInfoResponse0.getGetUserInfoResult();
      assertNull(userInfo0);
  }
}
