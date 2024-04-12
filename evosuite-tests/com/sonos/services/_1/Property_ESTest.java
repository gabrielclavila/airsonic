/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 01:39:10 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.Property;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Property_ESTest extends Property_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Property property0 = new Property();
      property0.setValue("");
      String string0 = property0.getValue();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Property property0 = new Property();
      property0.name = "";
      property0.name = "m{~]]%Ij";
      String string0 = property0.getName();
      assertEquals("m{~]]%Ij", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Property property0 = new Property();
      property0.name = "";
      String string0 = property0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Property property0 = new Property();
      String string0 = property0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Property property0 = new Property();
      property0.setValue("com.sonos.services._1.Property");
      String string0 = property0.getValue();
      assertEquals("com.sonos.services._1.Property", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Property property0 = new Property();
      String string0 = property0.getValue();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Property property0 = new Property();
      property0.setName("");
      assertNull(property0.getValue());
  }
}