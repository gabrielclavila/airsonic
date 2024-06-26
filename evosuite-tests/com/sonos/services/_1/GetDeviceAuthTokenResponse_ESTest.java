/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 01:23:56 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.DeviceAuthTokenResult;
import com.sonos.services._1.GetDeviceAuthTokenResponse;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GetDeviceAuthTokenResponse_ESTest extends GetDeviceAuthTokenResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GetDeviceAuthTokenResponse getDeviceAuthTokenResponse0 = new GetDeviceAuthTokenResponse();
      DeviceAuthTokenResult deviceAuthTokenResult0 = new DeviceAuthTokenResult();
      getDeviceAuthTokenResponse0.getDeviceAuthTokenResult = deviceAuthTokenResult0;
      DeviceAuthTokenResult deviceAuthTokenResult1 = getDeviceAuthTokenResponse0.getGetDeviceAuthTokenResult();
      assertSame(deviceAuthTokenResult1, deviceAuthTokenResult0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GetDeviceAuthTokenResponse getDeviceAuthTokenResponse0 = new GetDeviceAuthTokenResponse();
      DeviceAuthTokenResult deviceAuthTokenResult0 = getDeviceAuthTokenResponse0.getGetDeviceAuthTokenResult();
      assertNull(deviceAuthTokenResult0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GetDeviceAuthTokenResponse getDeviceAuthTokenResponse0 = new GetDeviceAuthTokenResponse();
      DeviceAuthTokenResult deviceAuthTokenResult0 = new DeviceAuthTokenResult();
      getDeviceAuthTokenResponse0.setGetDeviceAuthTokenResult(deviceAuthTokenResult0);
      assertNull(deviceAuthTokenResult0.getPrivateKey());
  }
}
