/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 01:22:21 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.ActionType;
import com.sonos.services._1.GenericAction;
import com.sonos.services._1.OpenUrlAction;
import com.sonos.services._1.RateItemAction;
import com.sonos.services._1.SimpleHttpRequestAction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GenericAction_ESTest extends GenericAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GenericAction genericAction0 = new GenericAction();
      OpenUrlAction openUrlAction0 = new OpenUrlAction();
      genericAction0.setOpenUrlAction(openUrlAction0);
      assertNull(genericAction0.getActionType());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GenericAction genericAction0 = new GenericAction();
      Boolean boolean0 = Boolean.valueOf(true);
      genericAction0.setShowInBrowse(boolean0);
      Boolean boolean1 = genericAction0.isShowInBrowse();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GenericAction genericAction0 = new GenericAction();
      Boolean boolean0 = Boolean.FALSE;
      genericAction0.setShowInBrowse(boolean0);
      Boolean boolean1 = genericAction0.isShowInBrowse();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GenericAction genericAction0 = new GenericAction();
      genericAction0.title = "";
      String string0 = genericAction0.getTitle();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GenericAction genericAction0 = new GenericAction();
      genericAction0.setSuccessMessageStringId(" nD8R#VC{");
      String string0 = genericAction0.getSuccessMessageStringId();
      assertEquals(" nD8R#VC{", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GenericAction genericAction0 = new GenericAction();
      genericAction0.successMessageStringId = "";
      String string0 = genericAction0.getSuccessMessageStringId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GenericAction genericAction0 = new GenericAction();
      SimpleHttpRequestAction simpleHttpRequestAction0 = new SimpleHttpRequestAction();
      genericAction0.simpleHttpRequestAction = simpleHttpRequestAction0;
      SimpleHttpRequestAction simpleHttpRequestAction1 = genericAction0.getSimpleHttpRequestAction();
      assertSame(simpleHttpRequestAction1, simpleHttpRequestAction0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GenericAction genericAction0 = new GenericAction();
      RateItemAction rateItemAction0 = new RateItemAction();
      genericAction0.rateItemAction = rateItemAction0;
      RateItemAction rateItemAction1 = genericAction0.getRateItemAction();
      assertSame(rateItemAction1, rateItemAction0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GenericAction genericAction0 = new GenericAction();
      OpenUrlAction openUrlAction0 = new OpenUrlAction();
      genericAction0.openUrlAction = openUrlAction0;
      OpenUrlAction openUrlAction1 = genericAction0.getOpenUrlAction();
      assertNull(openUrlAction1.getUrl());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GenericAction genericAction0 = new GenericAction();
      genericAction0.setId("P6nK");
      String string0 = genericAction0.getId();
      assertEquals("P6nK", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GenericAction genericAction0 = new GenericAction();
      genericAction0.setId("");
      String string0 = genericAction0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GenericAction genericAction0 = new GenericAction();
      genericAction0.setFailureMessageStringId("");
      String string0 = genericAction0.getFailureMessageStringId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GenericAction genericAction0 = new GenericAction();
      String string0 = genericAction0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GenericAction genericAction0 = new GenericAction();
      genericAction0.setTitle("openUrl");
      String string0 = genericAction0.getTitle();
      assertEquals("openUrl", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GenericAction genericAction0 = new GenericAction();
      String string0 = genericAction0.getSuccessMessageStringId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GenericAction genericAction0 = new GenericAction();
      SimpleHttpRequestAction simpleHttpRequestAction0 = genericAction0.getSimpleHttpRequestAction();
      assertNull(simpleHttpRequestAction0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GenericAction genericAction0 = new GenericAction();
      OpenUrlAction openUrlAction0 = genericAction0.getOpenUrlAction();
      assertNull(openUrlAction0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GenericAction genericAction0 = new GenericAction();
      SimpleHttpRequestAction simpleHttpRequestAction0 = new SimpleHttpRequestAction();
      genericAction0.setSimpleHttpRequestAction(simpleHttpRequestAction0);
      assertNull(genericAction0.getTitle());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GenericAction genericAction0 = new GenericAction();
      String string0 = genericAction0.getFailureMessageStringId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GenericAction genericAction0 = new GenericAction();
      genericAction0.getActionType();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GenericAction genericAction0 = new GenericAction();
      ActionType actionType0 = ActionType.SIMPLE_HTTP_REQUEST;
      genericAction0.setActionType(actionType0);
      ActionType actionType1 = genericAction0.getActionType();
      assertSame(actionType1, actionType0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GenericAction genericAction0 = new GenericAction();
      RateItemAction rateItemAction0 = genericAction0.getRateItemAction();
      assertNull(rateItemAction0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GenericAction genericAction0 = new GenericAction();
      RateItemAction rateItemAction0 = new RateItemAction();
      genericAction0.setRateItemAction(rateItemAction0);
      assertNull(genericAction0.getFailureMessageStringId());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GenericAction genericAction0 = new GenericAction();
      Boolean boolean0 = genericAction0.isShowInBrowse();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GenericAction genericAction0 = new GenericAction();
      String string0 = genericAction0.getTitle();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GenericAction genericAction0 = new GenericAction();
      genericAction0.setFailureMessageStringId("com.sonos.services._1.HttpHeader");
      String string0 = genericAction0.getFailureMessageStringId();
      assertEquals("com.sonos.services._1.HttpHeader", string0);
  }
}