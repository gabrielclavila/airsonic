/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 20:31:03 GMT 2024
 */

package org.airsonic.player.ajax;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.airsonic.player.ajax.TagService;
import org.airsonic.player.service.MediaFileService;
import org.airsonic.player.service.metadata.MetaDataParserFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TagService_ESTest extends TagService_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TagService tagService0 = new TagService();
      // Undeclared exception!
      try { 
        tagService0.setTags(4749, "7Fi[kuv", "r|)v,", "r|)v,", "hxJ", "hxJ", "r|)v,");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang/StringUtils
         //
         verifyException("org.airsonic.player.ajax.TagService", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TagService tagService0 = new TagService();
      MediaFileService mediaFileService0 = new MediaFileService();
      tagService0.setMediaFileService(mediaFileService0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TagService tagService0 = new TagService();
      tagService0.setMetaDataParserFactory((MetaDataParserFactory) null);
  }
}