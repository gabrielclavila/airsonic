/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 14:33:49 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.CreateContainerResult;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CreateContainerResult_ESTest extends CreateContainerResult_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CreateContainerResult createContainerResult0 = new CreateContainerResult();
      createContainerResult0.setUpdateId("");
      String string0 = createContainerResult0.getUpdateId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CreateContainerResult createContainerResult0 = new CreateContainerResult();
      createContainerResult0.id = "E";
      String string0 = createContainerResult0.getId();
      assertEquals("E", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CreateContainerResult createContainerResult0 = new CreateContainerResult();
      createContainerResult0.id = null;
      createContainerResult0.id = "";
      String string0 = createContainerResult0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CreateContainerResult createContainerResult0 = new CreateContainerResult();
      String string0 = createContainerResult0.getUpdateId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CreateContainerResult createContainerResult0 = new CreateContainerResult();
      String string0 = createContainerResult0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CreateContainerResult createContainerResult0 = new CreateContainerResult();
      createContainerResult0.setId("(mt`");
      assertNull(createContainerResult0.getUpdateId());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CreateContainerResult createContainerResult0 = new CreateContainerResult();
      createContainerResult0.setUpdateId("C=^B'2}gyT");
      String string0 = createContainerResult0.getUpdateId();
      assertEquals("C=^B'2}gyT", string0);
  }
}