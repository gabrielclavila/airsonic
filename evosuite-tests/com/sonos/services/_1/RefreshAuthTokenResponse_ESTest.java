/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 01:14:34 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.DeviceAuthTokenResult;
import com.sonos.services._1.RefreshAuthTokenResponse;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RefreshAuthTokenResponse_ESTest extends RefreshAuthTokenResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RefreshAuthTokenResponse refreshAuthTokenResponse0 = new RefreshAuthTokenResponse();
      DeviceAuthTokenResult deviceAuthTokenResult0 = new DeviceAuthTokenResult();
      refreshAuthTokenResponse0.setRefreshAuthTokenResult(deviceAuthTokenResult0);
      DeviceAuthTokenResult deviceAuthTokenResult1 = refreshAuthTokenResponse0.getRefreshAuthTokenResult();
      assertNull(deviceAuthTokenResult1.getPrivateKey());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RefreshAuthTokenResponse refreshAuthTokenResponse0 = new RefreshAuthTokenResponse();
      DeviceAuthTokenResult deviceAuthTokenResult0 = refreshAuthTokenResponse0.getRefreshAuthTokenResult();
      assertNull(deviceAuthTokenResult0);
  }
}
