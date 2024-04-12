/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 14:33:30 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.Search;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Search_ESTest extends Search_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Search search0 = new Search();
      search0.setTerm("com.sonos.services._1.Search");
      String string0 = search0.getTerm();
      assertEquals("com.sonos.services._1.Search", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Search search0 = new Search();
      search0.setIndex(1);
      int int0 = search0.getIndex();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Search search0 = new Search();
      search0.index = (-650);
      int int0 = search0.getIndex();
      assertEquals((-650), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Search search0 = new Search();
      search0.id = "aBTXRM3H1Y%W+*e";
      String string0 = search0.getId();
      assertEquals("aBTXRM3H1Y%W+*e", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Search search0 = new Search();
      search0.setId("");
      String string0 = search0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Search search0 = new Search();
      search0.setCount((-1));
      int int0 = search0.getCount();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Search search0 = new Search();
      int int0 = search0.getIndex();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Search search0 = new Search();
      String string0 = search0.getTerm();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Search search0 = new Search();
      search0.setTerm("");
      String string0 = search0.getTerm();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Search search0 = new Search();
      String string0 = search0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Search search0 = new Search();
      search0.setCount(1722);
      int int0 = search0.getCount();
      assertEquals(1722, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Search search0 = new Search();
      int int0 = search0.getCount();
      assertEquals(0, int0);
  }
}