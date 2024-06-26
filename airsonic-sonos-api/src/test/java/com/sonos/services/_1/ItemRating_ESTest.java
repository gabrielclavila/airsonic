/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 14:35:40 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.ItemRating;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ItemRating_ESTest extends ItemRating_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ItemRating itemRating0 = new ItemRating();
      Boolean boolean0 = Boolean.TRUE;
      itemRating0.setShouldSkip(boolean0);
      Boolean boolean1 = itemRating0.isShouldSkip();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ItemRating itemRating0 = new ItemRating();
      Boolean boolean0 = Boolean.valueOf(false);
      itemRating0.setShouldSkip(boolean0);
      Boolean boolean1 = itemRating0.isShouldSkip();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ItemRating itemRating0 = new ItemRating();
      itemRating0.messageStringId = "9t";
      String string0 = itemRating0.getMessageStringId();
      assertEquals("9t", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ItemRating itemRating0 = new ItemRating();
      itemRating0.messageStringId = "";
      String string0 = itemRating0.getMessageStringId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ItemRating itemRating0 = new ItemRating();
      Boolean boolean0 = itemRating0.isShouldSkip();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ItemRating itemRating0 = new ItemRating();
      itemRating0.setMessageStringId("|%<agU;ls1LquHK");
      assertNull(itemRating0.isShouldSkip());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ItemRating itemRating0 = new ItemRating();
      String string0 = itemRating0.getMessageStringId();
      assertNull(string0);
  }
}
