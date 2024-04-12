/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 15:48:08 GMT 2024
 */

package org.subsonic.restapi;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.subsonic.restapi.VideoConversion;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VideoConversion_ESTest extends VideoConversion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      VideoConversion videoConversion0 = new VideoConversion();
      videoConversion0.setId("Nr<nXTOe}+5}`!#$d");
      String string0 = videoConversion0.getId();
      assertEquals("Nr<nXTOe}+5}`!#$d", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      VideoConversion videoConversion0 = new VideoConversion();
      Integer integer0 = new Integer(378);
      videoConversion0.setBitRate(integer0);
      Integer integer1 = videoConversion0.getBitRate();
      assertEquals(378, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      VideoConversion videoConversion0 = new VideoConversion();
      Integer integer0 = new Integer((-3089));
      videoConversion0.audioTrackId = integer0;
      videoConversion0.bitRate = videoConversion0.audioTrackId;
      Integer integer1 = videoConversion0.getBitRate();
      assertEquals((-3089), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      VideoConversion videoConversion0 = new VideoConversion();
      Integer integer0 = new Integer((-1956));
      videoConversion0.setAudioTrackId(integer0);
      Integer integer1 = videoConversion0.getAudioTrackId();
      assertEquals((-1956), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VideoConversion videoConversion0 = new VideoConversion();
      Integer integer0 = new Integer(334);
      videoConversion0.setAudioTrackId(integer0);
      Integer integer1 = videoConversion0.getAudioTrackId();
      assertEquals(334, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      VideoConversion videoConversion0 = new VideoConversion();
      Integer integer0 = Integer.getInteger((String) null, 2974);
      videoConversion0.setAudioTrackId(integer0);
      Integer integer1 = videoConversion0.getAudioTrackId();
      assertEquals(2974, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      VideoConversion videoConversion0 = new VideoConversion();
      Integer integer0 = new Integer(0);
      videoConversion0.setBitRate(integer0);
      Integer integer1 = videoConversion0.getBitRate();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      VideoConversion videoConversion0 = new VideoConversion();
      String string0 = videoConversion0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      VideoConversion videoConversion0 = new VideoConversion();
      Integer integer0 = videoConversion0.getAudioTrackId();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      VideoConversion videoConversion0 = new VideoConversion();
      Integer integer0 = videoConversion0.getBitRate();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      VideoConversion videoConversion0 = new VideoConversion();
      videoConversion0.setId("");
      String string0 = videoConversion0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      VideoConversion videoConversion0 = new VideoConversion();
      Integer integer0 = new Integer(0);
      videoConversion0.setAudioTrackId(integer0);
      Integer integer1 = videoConversion0.getAudioTrackId();
      assertEquals(0, (int)integer1);
  }
}
