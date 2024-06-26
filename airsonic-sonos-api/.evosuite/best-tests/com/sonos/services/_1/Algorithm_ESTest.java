/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 13:53:38 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sonos.services._1.Algorithm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Algorithm_ESTest extends Algorithm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Algorithm[] algorithmArray0 = Algorithm.values();
      assertEquals(1, algorithmArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Algorithm algorithm0 = Algorithm.valueOf("AES_CBC_PKCS_7");
      assertEquals("AES/CBC/PKCS#7", algorithm0.value());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Algorithm algorithm0 = Algorithm.fromValue("AES/CBC/PKCS#7");
      assertEquals("AES/CBC/PKCS#7", algorithm0.value());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        Algorithm.fromValue("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 
         //
         verifyException("com.sonos.services._1.Algorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Algorithm algorithm0 = Algorithm.AES_CBC_PKCS_7;
      String string0 = algorithm0.value();
      assertEquals("AES/CBC/PKCS#7", string0);
  }
}
