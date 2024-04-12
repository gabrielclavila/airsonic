/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 21:20:11 GMT 2024
 */

package org.airsonic.player.spring.webxmldomain;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.airsonic.player.spring.webxmldomain.ServletDef;
import org.airsonic.player.spring.webxmldomain.ServletMappingDef;
import org.airsonic.player.spring.webxmldomain.WebApp;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WebApp_ESTest extends WebApp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WebApp webApp0 = new WebApp();
      LinkedList<ServletMappingDef> linkedList0 = new LinkedList<ServletMappingDef>();
      ServletMappingDef servletMappingDef0 = new ServletMappingDef();
      linkedList0.add(servletMappingDef0);
      webApp0.setServletMappingDefs(linkedList0);
      List<ServletMappingDef> list0 = webApp0.getServletMappingDefs();
      assertTrue(list0.contains(servletMappingDef0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WebApp webApp0 = new WebApp();
      LinkedList<ServletDef> linkedList0 = new LinkedList<ServletDef>();
      webApp0.setServletDefs(linkedList0);
      List<ServletDef> list0 = webApp0.getServletDefs();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      WebApp webApp0 = new WebApp();
      LinkedList<ServletDef> linkedList0 = new LinkedList<ServletDef>();
      ServletDef servletDef0 = new ServletDef();
      linkedList0.add(servletDef0);
      webApp0.setServletDefs(linkedList0);
      List<ServletDef> list0 = webApp0.getServletDefs();
      assertTrue(list0.contains(servletDef0));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      WebApp webApp0 = new WebApp();
      LinkedList<ServletMappingDef> linkedList0 = new LinkedList<ServletMappingDef>();
      webApp0.setServletMappingDefs(linkedList0);
      List<ServletMappingDef> list0 = webApp0.getServletMappingDefs();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      WebApp webApp0 = new WebApp();
      List<ServletMappingDef> list0 = webApp0.getServletMappingDefs();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      WebApp webApp0 = new WebApp();
      List<ServletDef> list0 = webApp0.getServletDefs();
      assertNull(list0);
  }
}