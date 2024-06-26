/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 14:31:54 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.RelatedText;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RelatedText_ESTest extends RelatedText_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RelatedText relatedText0 = new RelatedText();
      relatedText0.setType("com.sonos.services._1.RelatedText");
      String string0 = relatedText0.getType();
      assertEquals("com.sonos.services._1.RelatedText", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RelatedText relatedText0 = new RelatedText();
      relatedText0.setId("com.sonos.services._1.RelatedText");
      String string0 = relatedText0.getId();
      assertEquals("com.sonos.services._1.RelatedText", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RelatedText relatedText0 = new RelatedText();
      relatedText0.id = "";
      String string0 = relatedText0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RelatedText relatedText0 = new RelatedText();
      relatedText0.setType("");
      String string0 = relatedText0.getType();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RelatedText relatedText0 = new RelatedText();
      String string0 = relatedText0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RelatedText relatedText0 = new RelatedText();
      String string0 = relatedText0.getType();
      assertNull(string0);
  }
}
