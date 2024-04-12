/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 14:35:32 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.CreateItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CreateItem_ESTest extends CreateItem_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CreateItem createItem0 = new CreateItem();
      createItem0.favorite = "K`OxSF+y=] m";
      String string0 = createItem0.getFavorite();
      assertEquals("K`OxSF+y=] m", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CreateItem createItem0 = new CreateItem();
      createItem0.setFavorite("");
      String string0 = createItem0.getFavorite();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CreateItem createItem0 = new CreateItem();
      String string0 = createItem0.getFavorite();
      assertNull(string0);
  }
}
