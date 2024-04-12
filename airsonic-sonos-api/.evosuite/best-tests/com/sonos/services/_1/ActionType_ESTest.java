/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 14:03:12 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sonos.services._1.ActionType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ActionType_ESTest extends ActionType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ActionType actionType0 = ActionType.fromValue("rateItem");
      assertEquals(ActionType.RATE_ITEM, actionType0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ActionType[] actionTypeArray0 = ActionType.values();
      assertEquals(3, actionTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ActionType actionType0 = ActionType.valueOf("RATE_ITEM");
      assertEquals(ActionType.RATE_ITEM, actionType0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ActionType actionType0 = ActionType.fromValue("simpleHttpRequest");
      assertEquals(ActionType.SIMPLE_HTTP_REQUEST, actionType0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        ActionType.fromValue("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 
         //
         verifyException("com.sonos.services._1.ActionType", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ActionType actionType0 = ActionType.SIMPLE_HTTP_REQUEST;
      String string0 = actionType0.value();
      assertEquals("simpleHttpRequest", string0);
  }
}
