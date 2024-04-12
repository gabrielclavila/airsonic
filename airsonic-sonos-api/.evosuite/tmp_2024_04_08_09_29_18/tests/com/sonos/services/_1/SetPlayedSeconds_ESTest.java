/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 14:30:35 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.SetPlayedSeconds;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SetPlayedSeconds_ESTest extends SetPlayedSeconds_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SetPlayedSeconds setPlayedSeconds0 = new SetPlayedSeconds();
      setPlayedSeconds0.setSeconds(1530);
      int int0 = setPlayedSeconds0.getSeconds();
      assertEquals(1530, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SetPlayedSeconds setPlayedSeconds0 = new SetPlayedSeconds();
      setPlayedSeconds0.setSeconds((-1));
      int int0 = setPlayedSeconds0.getSeconds();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SetPlayedSeconds setPlayedSeconds0 = new SetPlayedSeconds();
      setPlayedSeconds0.setPrivateData("");
      String string0 = setPlayedSeconds0.getPrivateData();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SetPlayedSeconds setPlayedSeconds0 = new SetPlayedSeconds();
      Integer integer0 = new Integer(1189);
      setPlayedSeconds0.setOffsetMillis(integer0);
      Integer integer1 = setPlayedSeconds0.getOffsetMillis();
      assertEquals(1189, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SetPlayedSeconds setPlayedSeconds0 = new SetPlayedSeconds();
      Integer integer0 = new Integer(0);
      setPlayedSeconds0.offsetMillis = integer0;
      Integer integer1 = setPlayedSeconds0.getOffsetMillis();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SetPlayedSeconds setPlayedSeconds0 = new SetPlayedSeconds();
      Integer integer0 = new Integer((-1420));
      setPlayedSeconds0.setOffsetMillis(integer0);
      Integer integer1 = setPlayedSeconds0.getOffsetMillis();
      assertEquals((-1420), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SetPlayedSeconds setPlayedSeconds0 = new SetPlayedSeconds();
      setPlayedSeconds0.setId("Eyx[Fu4/%l6}1J3hy");
      String string0 = setPlayedSeconds0.getId();
      assertEquals("Eyx[Fu4/%l6}1J3hy", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SetPlayedSeconds setPlayedSeconds0 = new SetPlayedSeconds();
      setPlayedSeconds0.id = "";
      String string0 = setPlayedSeconds0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SetPlayedSeconds setPlayedSeconds0 = new SetPlayedSeconds();
      setPlayedSeconds0.setContextId("\"T.U4}UXxlv");
      String string0 = setPlayedSeconds0.getContextId();
      assertEquals("\"T.U4}UXxlv", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SetPlayedSeconds setPlayedSeconds0 = new SetPlayedSeconds();
      setPlayedSeconds0.setContextId("");
      String string0 = setPlayedSeconds0.getContextId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SetPlayedSeconds setPlayedSeconds0 = new SetPlayedSeconds();
      Integer integer0 = setPlayedSeconds0.getOffsetMillis();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SetPlayedSeconds setPlayedSeconds0 = new SetPlayedSeconds();
      int int0 = setPlayedSeconds0.getSeconds();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SetPlayedSeconds setPlayedSeconds0 = new SetPlayedSeconds();
      setPlayedSeconds0.setPrivateData("N.JM ;~.r.");
      String string0 = setPlayedSeconds0.getPrivateData();
      assertEquals("N.JM ;~.r.", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SetPlayedSeconds setPlayedSeconds0 = new SetPlayedSeconds();
      String string0 = setPlayedSeconds0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SetPlayedSeconds setPlayedSeconds0 = new SetPlayedSeconds();
      String string0 = setPlayedSeconds0.getContextId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SetPlayedSeconds setPlayedSeconds0 = new SetPlayedSeconds();
      String string0 = setPlayedSeconds0.getPrivateData();
      assertNull(string0);
  }
}
