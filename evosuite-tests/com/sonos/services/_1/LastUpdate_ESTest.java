/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 01:09:32 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.LastUpdate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LastUpdate_ESTest extends LastUpdate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LastUpdate lastUpdate0 = new LastUpdate();
      Boolean boolean0 = Boolean.valueOf(true);
      lastUpdate0.setAutoRefreshEnabled(boolean0);
      Boolean boolean1 = lastUpdate0.isAutoRefreshEnabled();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LastUpdate lastUpdate0 = new LastUpdate();
      Boolean boolean0 = Boolean.valueOf(false);
      lastUpdate0.setAutoRefreshEnabled(boolean0);
      Boolean boolean1 = lastUpdate0.isAutoRefreshEnabled();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LastUpdate lastUpdate0 = new LastUpdate();
      Integer integer0 = new Integer(0);
      lastUpdate0.pollInterval = integer0;
      Integer integer1 = lastUpdate0.getPollInterval();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LastUpdate lastUpdate0 = new LastUpdate();
      Integer integer0 = new Integer(1);
      lastUpdate0.setPollInterval(integer0);
      Integer integer1 = lastUpdate0.getPollInterval();
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LastUpdate lastUpdate0 = new LastUpdate();
      Integer integer0 = new Integer((-832));
      lastUpdate0.setPollInterval(integer0);
      Integer integer1 = lastUpdate0.getPollInterval();
      assertEquals((-832), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LastUpdate lastUpdate0 = new LastUpdate();
      lastUpdate0.favorites = "iKTH!G*djHbF,KsO\u0002J";
      String string0 = lastUpdate0.getFavorites();
      assertEquals("iKTH!G*djHbF,KsO\u0002J", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LastUpdate lastUpdate0 = new LastUpdate();
      lastUpdate0.favorites = "h3Q]";
      lastUpdate0.favorites = "";
      String string0 = lastUpdate0.getFavorites();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LastUpdate lastUpdate0 = new LastUpdate();
      lastUpdate0.setCatalog("y~c:./bMaDg~`\"w2");
      String string0 = lastUpdate0.getCatalog();
      assertEquals("y~c:./bMaDg~`\"w2", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LastUpdate lastUpdate0 = new LastUpdate();
      lastUpdate0.catalog = "";
      String string0 = lastUpdate0.getCatalog();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LastUpdate lastUpdate0 = new LastUpdate();
      Boolean boolean0 = lastUpdate0.isAutoRefreshEnabled();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LastUpdate lastUpdate0 = new LastUpdate();
      lastUpdate0.setFavorites("");
      assertEquals("", lastUpdate0.getFavorites());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LastUpdate lastUpdate0 = new LastUpdate();
      String string0 = lastUpdate0.getCatalog();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LastUpdate lastUpdate0 = new LastUpdate();
      Integer integer0 = lastUpdate0.getPollInterval();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LastUpdate lastUpdate0 = new LastUpdate();
      String string0 = lastUpdate0.getFavorites();
      assertNull(string0);
  }
}
