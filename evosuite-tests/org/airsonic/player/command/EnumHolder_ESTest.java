/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 21:15:14 GMT 2024
 */

package org.airsonic.player.command;

import org.junit.Test;
import static org.junit.Assert.*;
import org.airsonic.player.command.EnumHolder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EnumHolder_ESTest extends EnumHolder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EnumHolder enumHolder0 = new EnumHolder((String) null, (String) null);
      String string0 = enumHolder0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EnumHolder enumHolder0 = new EnumHolder("", "");
      String string0 = enumHolder0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EnumHolder enumHolder0 = new EnumHolder((String) null, (String) null);
      String string0 = enumHolder0.getDescription();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EnumHolder enumHolder0 = new EnumHolder("", "");
      String string0 = enumHolder0.getDescription();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EnumHolder enumHolder0 = new EnumHolder(" 1dq", ";Y-ROY)N)");
      String string0 = enumHolder0.getName();
      assertEquals(";Y-ROY)N)", enumHolder0.getDescription());
      assertEquals(" 1dq", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      EnumHolder enumHolder0 = new EnumHolder(" 1dq", ";Y-ROY)N)");
      String string0 = enumHolder0.getDescription();
      assertEquals(";Y-ROY)N)", string0);
      assertEquals(" 1dq", enumHolder0.getName());
  }
}
