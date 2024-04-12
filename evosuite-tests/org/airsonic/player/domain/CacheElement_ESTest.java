/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 21:06:31 GMT 2024
 */

package org.airsonic.player.domain;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.airsonic.player.domain.CacheElement;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CacheElement_ESTest extends CacheElement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CacheElement cacheElement0 = new CacheElement((-1), "kw{mF.C^AZ_X", (Object) null, (-1));
      cacheElement0.getValue();
      assertEquals((-1L), cacheElement0.getCreated());
      assertEquals((-1), cacheElement0.getType());
      assertEquals((-2977105101L), cacheElement0.getId());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CacheElement cacheElement0 = new CacheElement(0, "", "", 0);
      int int0 = cacheElement0.getType();
      assertEquals(0L, cacheElement0.getId());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CacheElement cacheElement0 = new CacheElement((-1239), "", "", (-1239));
      int int0 = cacheElement0.getType();
      assertEquals((-1239), int0);
      assertEquals((-1239L), cacheElement0.getCreated());
      assertEquals((-5321464479744L), cacheElement0.getId());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CacheElement cacheElement0 = new CacheElement(0, "", (Object) null, 0);
      cacheElement0.getKey();
      assertEquals(0L, cacheElement0.getId());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object object0 = new Object();
      CacheElement cacheElement0 = new CacheElement(0, "", object0, 0);
      long long0 = cacheElement0.getId();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CacheElement cacheElement0 = new CacheElement((-1081), "@@0%;P", "@@0%;P", (-1081));
      long long0 = cacheElement0.getId();
      assertEquals((-4640966808534L), long0);
      assertEquals((-1081), cacheElement0.getType());
      assertEquals((-1081L), cacheElement0.getCreated());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CacheElement cacheElement0 = new CacheElement(0, "", (Object) null, 0);
      cacheElement0.getCreated();
      assertEquals(0L, cacheElement0.getId());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CacheElement cacheElement0 = new CacheElement((-1239), "", "", (-1239));
      long long0 = cacheElement0.getCreated();
      assertEquals((-5321464479744L), cacheElement0.getId());
      assertEquals((-1239L), long0);
      assertEquals((-1239), cacheElement0.getType());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      long long0 = CacheElement.createId(0, "");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      long long0 = CacheElement.createId(620, "org.airsonic.player.domain.CacheElement");
      assertEquals(2662975784999L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        CacheElement.createId((-870), (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.airsonic.player.domain.CacheElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CacheElement cacheElement0 = null;
      try {
        cacheElement0 = new CacheElement(0, (String) null, (Object) null, 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.airsonic.player.domain.CacheElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      long long0 = CacheElement.createId((-1239), "");
      assertEquals((-5321464479744L), long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CacheElement cacheElement0 = new CacheElement(55, "Yy];dXb\"W_C/h5J7", "Yy];dXb\"W_C/h5J7", 55);
      cacheElement0.getValue();
      assertEquals(55, cacheElement0.getType());
      assertEquals(237507213536L, cacheElement0.getId());
      assertEquals(55L, cacheElement0.getCreated());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CacheElement cacheElement0 = new CacheElement(55, "Yy];dXb\"W_C/h5J7", "Yy];dXb\"W_C/h5J7", 55);
      int int0 = cacheElement0.getType();
      assertEquals(55, int0);
      assertEquals(55L, cacheElement0.getCreated());
      assertEquals(237507213536L, cacheElement0.getId());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CacheElement cacheElement0 = new CacheElement(55, "Yy];dXb\"W_C/h5J7", "Yy];dXb\"W_C/h5J7", 55);
      long long0 = cacheElement0.getId();
      assertEquals(55, cacheElement0.getType());
      assertEquals(55L, cacheElement0.getCreated());
      assertEquals(237507213536L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CacheElement cacheElement0 = new CacheElement(55, "Yy];dXb\"W_C/h5J7", "Yy];dXb\"W_C/h5J7", 55);
      long long0 = cacheElement0.getCreated();
      assertEquals(55, cacheElement0.getType());
      assertEquals(237507213536L, cacheElement0.getId());
      assertEquals(55L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CacheElement cacheElement0 = new CacheElement(55, "Yy];dXb\"W_C/h5J7", "Yy];dXb\"W_C/h5J7", 55);
      cacheElement0.getKey();
      assertEquals(237507213536L, cacheElement0.getId());
      assertEquals(55, cacheElement0.getType());
      assertEquals(55L, cacheElement0.getCreated());
  }
}
