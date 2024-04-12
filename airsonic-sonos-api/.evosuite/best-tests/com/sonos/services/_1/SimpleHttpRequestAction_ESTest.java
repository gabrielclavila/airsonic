/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 14:36:31 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.HttpHeaders;
import com.sonos.services._1.SimpleHttpRequestAction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleHttpRequestAction_ESTest extends SimpleHttpRequestAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleHttpRequestAction simpleHttpRequestAction0 = new SimpleHttpRequestAction();
      HttpHeaders httpHeaders0 = new HttpHeaders();
      simpleHttpRequestAction0.setHttpHeaders(httpHeaders0);
      assertNull(simpleHttpRequestAction0.isRefreshOnSuccess());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleHttpRequestAction simpleHttpRequestAction0 = new SimpleHttpRequestAction();
      Boolean boolean0 = new Boolean(false);
      simpleHttpRequestAction0.refreshOnSuccess = boolean0;
      Boolean boolean1 = simpleHttpRequestAction0.isRefreshOnSuccess();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleHttpRequestAction simpleHttpRequestAction0 = new SimpleHttpRequestAction();
      simpleHttpRequestAction0.setUrl("com.sonos.services._1.HttpHeader");
      String string0 = simpleHttpRequestAction0.getUrl();
      assertEquals("com.sonos.services._1.HttpHeader", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleHttpRequestAction simpleHttpRequestAction0 = new SimpleHttpRequestAction();
      simpleHttpRequestAction0.setUrl("");
      String string0 = simpleHttpRequestAction0.getUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleHttpRequestAction simpleHttpRequestAction0 = new SimpleHttpRequestAction();
      simpleHttpRequestAction0.setMethod("U{#@{#WWv: 6zCMNCKK");
      String string0 = simpleHttpRequestAction0.getMethod();
      assertEquals("U{#@{#WWv: 6zCMNCKK", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleHttpRequestAction simpleHttpRequestAction0 = new SimpleHttpRequestAction();
      HttpHeaders httpHeaders0 = new HttpHeaders();
      simpleHttpRequestAction0.httpHeaders = httpHeaders0;
      HttpHeaders httpHeaders1 = simpleHttpRequestAction0.getHttpHeaders();
      assertSame(httpHeaders1, httpHeaders0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleHttpRequestAction simpleHttpRequestAction0 = new SimpleHttpRequestAction();
      Boolean boolean0 = simpleHttpRequestAction0.isRefreshOnSuccess();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleHttpRequestAction simpleHttpRequestAction0 = new SimpleHttpRequestAction();
      String string0 = simpleHttpRequestAction0.getUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleHttpRequestAction simpleHttpRequestAction0 = new SimpleHttpRequestAction();
      HttpHeaders httpHeaders0 = simpleHttpRequestAction0.getHttpHeaders();
      assertNull(httpHeaders0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleHttpRequestAction simpleHttpRequestAction0 = new SimpleHttpRequestAction();
      String string0 = simpleHttpRequestAction0.getMethod();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleHttpRequestAction simpleHttpRequestAction0 = new SimpleHttpRequestAction();
      Boolean boolean0 = new Boolean(true);
      simpleHttpRequestAction0.setRefreshOnSuccess(boolean0);
      Boolean boolean1 = simpleHttpRequestAction0.isRefreshOnSuccess();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleHttpRequestAction simpleHttpRequestAction0 = new SimpleHttpRequestAction();
      simpleHttpRequestAction0.setMethod("");
      String string0 = simpleHttpRequestAction0.getMethod();
      assertEquals("", string0);
  }
}