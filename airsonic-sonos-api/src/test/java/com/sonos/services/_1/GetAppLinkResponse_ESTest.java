/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 14:30:16 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.AppLinkResult;
import com.sonos.services._1.GetAppLinkResponse;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GetAppLinkResponse_ESTest extends GetAppLinkResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GetAppLinkResponse getAppLinkResponse0 = new GetAppLinkResponse();
      AppLinkResult appLinkResult0 = new AppLinkResult();
      getAppLinkResponse0.setGetAppLinkResult(appLinkResult0);
      AppLinkResult appLinkResult1 = getAppLinkResponse0.getGetAppLinkResult();
      assertSame(appLinkResult1, appLinkResult0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GetAppLinkResponse getAppLinkResponse0 = new GetAppLinkResponse();
      AppLinkResult appLinkResult0 = getAppLinkResponse0.getGetAppLinkResult();
      getAppLinkResponse0.setGetAppLinkResult(appLinkResult0);
  }
}