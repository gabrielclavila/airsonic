/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 01:17:51 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.GetSessionId;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GetSessionId_ESTest extends GetSessionId_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GetSessionId getSessionId0 = new GetSessionId();
      getSessionId0.setUsername("cI8Lc0E(kJmy-x+dW`");
      String string0 = getSessionId0.getUsername();
      assertEquals("cI8Lc0E(kJmy-x+dW`", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GetSessionId getSessionId0 = new GetSessionId();
      getSessionId0.setPassword("");
      String string0 = getSessionId0.getPassword();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GetSessionId getSessionId0 = new GetSessionId();
      getSessionId0.setUsername("");
      String string0 = getSessionId0.getUsername();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GetSessionId getSessionId0 = new GetSessionId();
      String string0 = getSessionId0.getUsername();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GetSessionId getSessionId0 = new GetSessionId();
      String string0 = getSessionId0.getPassword();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      GetSessionId getSessionId0 = new GetSessionId();
      getSessionId0.setPassword("JTcx068wH\"j\"zygK");
      String string0 = getSessionId0.getPassword();
      assertEquals("JTcx068wH\"j\"zygK", string0);
  }
}
