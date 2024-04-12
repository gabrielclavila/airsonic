/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 14:30:13 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.BehaviorsData;
import com.sonos.services._1.DynamicData;
import com.sonos.services._1.MediaMetadata;
import com.sonos.services._1.StreamMetadata;
import com.sonos.services._1.TrackMetadata;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MediaMetadata_ESTest extends MediaMetadata_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MediaMetadata mediaMetadata0 = new MediaMetadata();
      BehaviorsData behaviorsData0 = new BehaviorsData();
      mediaMetadata0.setBehaviors(behaviorsData0);
      assertNull(mediaMetadata0.getLanguage());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MediaMetadata mediaMetadata0 = new MediaMetadata();
      DynamicData dynamicData0 = new DynamicData();
      mediaMetadata0.setDynamic(dynamicData0);
      assertNull(mediaMetadata0.getItemType());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MediaMetadata mediaMetadata0 = new MediaMetadata();
      StreamMetadata streamMetadata0 = new StreamMetadata();
      mediaMetadata0.streamMetadata = streamMetadata0;
      StreamMetadata streamMetadata1 = mediaMetadata0.getStreamMetadata();
      assertNull(streamMetadata1.getSecondsRemaining());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MediaMetadata mediaMetadata0 = new MediaMetadata();
      mediaMetadata0.setMimeType("show");
      String string0 = mediaMetadata0.getMimeType();
      assertEquals("show", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MediaMetadata mediaMetadata0 = new MediaMetadata();
      mediaMetadata0.mimeType = "";
      String string0 = mediaMetadata0.getMimeType();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MediaMetadata mediaMetadata0 = new MediaMetadata();
      DynamicData dynamicData0 = new DynamicData();
      mediaMetadata0.dynamic = dynamicData0;
      DynamicData dynamicData1 = mediaMetadata0.getDynamic();
      assertSame(dynamicData1, dynamicData0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MediaMetadata mediaMetadata0 = new MediaMetadata();
      BehaviorsData behaviorsData0 = new BehaviorsData();
      mediaMetadata0.behaviors = behaviorsData0;
      BehaviorsData behaviorsData1 = mediaMetadata0.getBehaviors();
      assertNull(behaviorsData1.isSupportsQuickSkip());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MediaMetadata mediaMetadata0 = new MediaMetadata();
      StreamMetadata streamMetadata0 = new StreamMetadata();
      mediaMetadata0.setStreamMetadata(streamMetadata0);
      assertNull(mediaMetadata0.isOnDemand());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MediaMetadata mediaMetadata0 = new MediaMetadata();
      StreamMetadata streamMetadata0 = mediaMetadata0.getStreamMetadata();
      assertNull(streamMetadata0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MediaMetadata mediaMetadata0 = new MediaMetadata();
      TrackMetadata trackMetadata0 = mediaMetadata0.getTrackMetadata();
      assertNull(trackMetadata0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MediaMetadata mediaMetadata0 = new MediaMetadata();
      DynamicData dynamicData0 = mediaMetadata0.getDynamic();
      assertNull(dynamicData0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MediaMetadata mediaMetadata0 = new MediaMetadata();
      BehaviorsData behaviorsData0 = mediaMetadata0.getBehaviors();
      assertNull(behaviorsData0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MediaMetadata mediaMetadata0 = new MediaMetadata();
      TrackMetadata trackMetadata0 = new TrackMetadata();
      mediaMetadata0.setTrackMetadata(trackMetadata0);
      TrackMetadata trackMetadata1 = mediaMetadata0.getTrackMetadata();
      assertNull(trackMetadata1.getBook());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MediaMetadata mediaMetadata0 = new MediaMetadata();
      String string0 = mediaMetadata0.getMimeType();
      assertNull(string0);
  }
}