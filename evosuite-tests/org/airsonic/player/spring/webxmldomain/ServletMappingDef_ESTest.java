/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 21:19:07 GMT 2024
 */

package org.airsonic.player.spring.webxmldomain;

import org.junit.Test;
import static org.junit.Assert.*;
import org.airsonic.player.spring.webxmldomain.ServletMappingDef;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ServletMappingDef_ESTest extends ServletMappingDef_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ServletMappingDef servletMappingDef0 = new ServletMappingDef();
      servletMappingDef0.setUrlPattern("C}+2k(");
      String string0 = servletMappingDef0.getUrlPattern();
      assertEquals("C}+2k(", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ServletMappingDef servletMappingDef0 = new ServletMappingDef();
      servletMappingDef0.setUrlPattern("");
      String string0 = servletMappingDef0.getUrlPattern();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ServletMappingDef servletMappingDef0 = new ServletMappingDef();
      servletMappingDef0.setName("");
      String string0 = servletMappingDef0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ServletMappingDef servletMappingDef0 = new ServletMappingDef();
      servletMappingDef0.setName("J2e-WEuD* ~");
      String string0 = servletMappingDef0.getName();
      assertEquals("J2e-WEuD* ~", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ServletMappingDef servletMappingDef0 = new ServletMappingDef();
      String string0 = servletMappingDef0.getUrlPattern();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ServletMappingDef servletMappingDef0 = new ServletMappingDef();
      String string0 = servletMappingDef0.getName();
      assertNull(string0);
  }
}
