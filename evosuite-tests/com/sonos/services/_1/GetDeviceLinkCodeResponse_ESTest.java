/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 01:41:40 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.DeviceLinkCodeResult;
import com.sonos.services._1.GetDeviceLinkCodeResponse;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GetDeviceLinkCodeResponse_ESTest extends GetDeviceLinkCodeResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GetDeviceLinkCodeResponse getDeviceLinkCodeResponse0 = new GetDeviceLinkCodeResponse();
      DeviceLinkCodeResult deviceLinkCodeResult0 = new DeviceLinkCodeResult();
      deviceLinkCodeResult0.showLinkCode = true;
      getDeviceLinkCodeResponse0.setGetDeviceLinkCodeResult(deviceLinkCodeResult0);
      DeviceLinkCodeResult deviceLinkCodeResult1 = getDeviceLinkCodeResponse0.getGetDeviceLinkCodeResult();
      assertNull(deviceLinkCodeResult1.getLinkCode());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GetDeviceLinkCodeResponse getDeviceLinkCodeResponse0 = new GetDeviceLinkCodeResponse();
      DeviceLinkCodeResult deviceLinkCodeResult0 = new DeviceLinkCodeResult();
      getDeviceLinkCodeResponse0.getDeviceLinkCodeResult = deviceLinkCodeResult0;
      DeviceLinkCodeResult deviceLinkCodeResult1 = getDeviceLinkCodeResponse0.getGetDeviceLinkCodeResult();
      assertSame(deviceLinkCodeResult1, deviceLinkCodeResult0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GetDeviceLinkCodeResponse getDeviceLinkCodeResponse0 = new GetDeviceLinkCodeResponse();
      DeviceLinkCodeResult deviceLinkCodeResult0 = getDeviceLinkCodeResponse0.getGetDeviceLinkCodeResult();
      assertNull(deviceLinkCodeResult0);
  }
}
