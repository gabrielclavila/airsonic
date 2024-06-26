/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 14:30:47 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.RateItem;
import com.sonos.services._1.RateItemAction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RateItemAction_ESTest extends RateItemAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RateItemAction rateItemAction0 = new RateItemAction();
      RateItem rateItem0 = new RateItem();
      rateItemAction0.setRateItem(rateItem0);
      assertEquals(0, rateItem0.getRating());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RateItemAction rateItemAction0 = new RateItemAction();
      Boolean boolean0 = Boolean.valueOf(true);
      rateItemAction0.shouldSkip = boolean0;
      Boolean boolean1 = rateItemAction0.isShouldSkip();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RateItemAction rateItemAction0 = new RateItemAction();
      RateItem rateItem0 = new RateItem();
      rateItemAction0.rateItem = rateItem0;
      RateItem rateItem1 = rateItemAction0.getRateItem();
      assertSame(rateItem1, rateItem0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RateItemAction rateItemAction0 = new RateItemAction();
      RateItem rateItem0 = new RateItem();
      rateItemAction0.rateItem = rateItem0;
      rateItemAction0.rateItem.setRating(672);
      RateItem rateItem1 = rateItemAction0.getRateItem();
      assertSame(rateItem1, rateItem0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RateItemAction rateItemAction0 = new RateItemAction();
      RateItem rateItem0 = new RateItem();
      rateItem0.setRating((-2825));
      rateItemAction0.rateItem = rateItem0;
      RateItem rateItem1 = rateItemAction0.getRateItem();
      assertNull(rateItem1.getId());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RateItemAction rateItemAction0 = new RateItemAction();
      RateItem rateItem0 = rateItemAction0.getRateItem();
      assertNull(rateItem0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RateItemAction rateItemAction0 = new RateItemAction();
      Boolean boolean0 = Boolean.FALSE;
      rateItemAction0.setShouldSkip(boolean0);
      Boolean boolean1 = rateItemAction0.isShouldSkip();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      RateItemAction rateItemAction0 = new RateItemAction();
      Boolean boolean0 = rateItemAction0.isShouldSkip();
      assertNull(boolean0);
  }
}
