/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 01:51:51 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.RateItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RateItem_ESTest extends RateItem_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RateItem rateItem0 = new RateItem();
      rateItem0.setRating(1);
      int int0 = rateItem0.getRating();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RateItem rateItem0 = new RateItem();
      rateItem0.setRating((-1));
      int int0 = rateItem0.getRating();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RateItem rateItem0 = new RateItem();
      rateItem0.id = "drRkcGl_E";
      String string0 = rateItem0.getId();
      assertEquals("drRkcGl_E", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RateItem rateItem0 = new RateItem();
      rateItem0.setId("");
      String string0 = rateItem0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RateItem rateItem0 = new RateItem();
      String string0 = rateItem0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RateItem rateItem0 = new RateItem();
      int int0 = rateItem0.getRating();
      assertEquals(0, int0);
  }
}