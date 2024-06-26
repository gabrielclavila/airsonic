/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 15:52:47 GMT 2024
 */

package org.subsonic.restapi;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.subsonic.restapi.MusicFolder;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MusicFolder_ESTest extends MusicFolder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MusicFolder musicFolder0 = new MusicFolder();
      musicFolder0.name = "C!t-";
      String string0 = musicFolder0.getName();
      assertEquals("C!t-", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MusicFolder musicFolder0 = new MusicFolder();
      musicFolder0.setName("");
      String string0 = musicFolder0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MusicFolder musicFolder0 = new MusicFolder();
      musicFolder0.setId(1442);
      int int0 = musicFolder0.getId();
      assertEquals(1442, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MusicFolder musicFolder0 = new MusicFolder();
      musicFolder0.setId((-1));
      int int0 = musicFolder0.getId();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MusicFolder musicFolder0 = new MusicFolder();
      int int0 = musicFolder0.getId();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MusicFolder musicFolder0 = new MusicFolder();
      String string0 = musicFolder0.getName();
      assertNull(string0);
  }
}
