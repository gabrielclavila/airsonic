/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 14:29:29 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.ReportAccountAction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReportAccountAction_ESTest extends ReportAccountAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ReportAccountAction reportAccountAction0 = new ReportAccountAction();
      reportAccountAction0.setType(";1");
      String string0 = reportAccountAction0.getType();
      assertEquals(";1", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ReportAccountAction reportAccountAction0 = new ReportAccountAction();
      reportAccountAction0.type = "";
      String string0 = reportAccountAction0.getType();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ReportAccountAction reportAccountAction0 = new ReportAccountAction();
      String string0 = reportAccountAction0.getType();
      assertNull(string0);
  }
}
