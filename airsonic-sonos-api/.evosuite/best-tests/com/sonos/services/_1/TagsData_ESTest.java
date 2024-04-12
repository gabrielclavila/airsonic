/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 14:34:38 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.TagsData;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TagsData_ESTest extends TagsData_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TagsData tagsData0 = new TagsData();
      Integer integer0 = new Integer(0);
      tagsData0.setPremium(integer0);
      Integer integer1 = tagsData0.getPremium();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TagsData tagsData0 = new TagsData();
      Integer integer0 = new Integer(2155);
      tagsData0.setPremium(integer0);
      Integer integer1 = tagsData0.getPremium();
      assertEquals(2155, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TagsData tagsData0 = new TagsData();
      Integer integer0 = new Integer((-75));
      tagsData0.setPremium(integer0);
      Integer integer1 = tagsData0.getPremium();
      assertEquals((-75), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TagsData tagsData0 = new TagsData();
      Integer integer0 = new Integer(1);
      tagsData0.setExplicit(integer0);
      Integer integer1 = tagsData0.getExplicit();
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TagsData tagsData0 = new TagsData();
      Integer integer0 = new Integer(0);
      tagsData0.setExplicit(integer0);
      Integer integer1 = tagsData0.getExplicit();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TagsData tagsData0 = new TagsData();
      Integer integer0 = new Integer((-650));
      tagsData0.setExplicit(integer0);
      Integer integer1 = tagsData0.getExplicit();
      assertEquals((-650), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TagsData tagsData0 = new TagsData();
      Integer integer0 = new Integer((-1));
      tagsData0.setExplicit(integer0);
      Integer integer1 = tagsData0.getExplicit();
      assertEquals((-1), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      TagsData tagsData0 = new TagsData();
      Integer integer0 = tagsData0.getPremium();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      TagsData tagsData0 = new TagsData();
      Integer integer0 = tagsData0.getExplicit();
      assertNull(integer0);
  }
}