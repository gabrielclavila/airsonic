/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 01:08:21 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.MediaMetadata;
import com.sonos.services._1.RadioTrackList;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RadioTrackList_ESTest extends RadioTrackList_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RadioTrackList radioTrackList0 = new RadioTrackList();
      radioTrackList0.setName("!w+=OF");
      String string0 = radioTrackList0.getName();
      assertEquals("!w+=OF", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RadioTrackList radioTrackList0 = new RadioTrackList();
      radioTrackList0.name = "";
      String string0 = radioTrackList0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RadioTrackList radioTrackList0 = new RadioTrackList();
      LinkedList<MediaMetadata> linkedList0 = new LinkedList<MediaMetadata>();
      radioTrackList0.mediaMetadata = (List<MediaMetadata>) linkedList0;
      MediaMetadata mediaMetadata0 = new MediaMetadata();
      linkedList0.add(mediaMetadata0);
      List<MediaMetadata> list0 = radioTrackList0.getMediaMetadata();
      assertTrue(list0.contains(mediaMetadata0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RadioTrackList radioTrackList0 = new RadioTrackList();
      radioTrackList0.setId("8{");
      String string0 = radioTrackList0.getId();
      assertEquals("8{", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RadioTrackList radioTrackList0 = new RadioTrackList();
      radioTrackList0.setId("");
      String string0 = radioTrackList0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RadioTrackList radioTrackList0 = new RadioTrackList();
      radioTrackList0.setCount(3773);
      int int0 = radioTrackList0.getCount();
      assertEquals(3773, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RadioTrackList radioTrackList0 = new RadioTrackList();
      radioTrackList0.setCount((-1));
      int int0 = radioTrackList0.getCount();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RadioTrackList radioTrackList0 = new RadioTrackList();
      radioTrackList0.getMediaMetadata();
      List<MediaMetadata> list0 = radioTrackList0.getMediaMetadata();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RadioTrackList radioTrackList0 = new RadioTrackList();
      int int0 = radioTrackList0.getCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RadioTrackList radioTrackList0 = new RadioTrackList();
      String string0 = radioTrackList0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RadioTrackList radioTrackList0 = new RadioTrackList();
      String string0 = radioTrackList0.getId();
      assertNull(string0);
  }
}
