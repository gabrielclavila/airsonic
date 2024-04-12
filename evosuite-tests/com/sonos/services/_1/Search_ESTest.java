/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 01:02:31 GMT 2024
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
      search0.setIndex((-1484));
      assertEquals((-1484), search0.getIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Search search0 = new Search();
      search0.term = "0j~ voUX";
      String string0 = search0.getTerm();
      assertEquals("0j~ voUX", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Search search0 = new Search();
      search0.term = "";
      String string0 = search0.getTerm();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Search search0 = new Search();
      search0.index = 2904;
      int int0 = search0.getIndex();
      assertEquals(2904, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Search search0 = new Search();
      search0.index = 0;
      search0.index = (-1484);
      int int0 = search0.getIndex();
      assertEquals((-1484), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Search search0 = new Search();
      search0.setId("0j~ voUX");
      String string0 = search0.getId();
      assertEquals("0j~ voUX", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Search search0 = new Search();
      search0.id = "com.sonos.services._1.Search";
      search0.id = "com.sonos.services._1.Search";
      search0.id = "";
      String string0 = search0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Search search0 = new Search();
      search0.setCount(827);
      int int0 = search0.getCount();
      assertEquals(827, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Search search0 = new Search();
      search0.setCount((-1484));
      int int0 = search0.getCount();
      assertEquals((-1484), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Search search0 = new Search();
      int int0 = search0.getIndex();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Search search0 = new Search();
      String string0 = search0.getTerm();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Search search0 = new Search();
      search0.setTerm("1");
      assertEquals(0, search0.getCount());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Search search0 = new Search();
      String string0 = search0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Search search0 = new Search();
      int int0 = search0.getCount();
      assertEquals(0, int0);
  }
}
