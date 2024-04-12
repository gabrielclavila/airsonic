/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 14:24:02 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.AbstractMedia;
import com.sonos.services._1.MediaList;
import com.sonos.services._1.MediaMetadata;
import com.sonos.services._1.PositionInformation;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MediaList_ESTest extends MediaList_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MediaList mediaList0 = new MediaList();
      mediaList0.setTotal(985);
      int int0 = mediaList0.getTotal();
      assertEquals(985, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MediaList mediaList0 = new MediaList();
      mediaList0.setTotal((-590));
      int int0 = mediaList0.getTotal();
      assertEquals((-590), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MediaList mediaList0 = new MediaList();
      PositionInformation positionInformation0 = new PositionInformation();
      mediaList0.setPositionInformation(positionInformation0);
      PositionInformation positionInformation1 = mediaList0.positionInformation;
      positionInformation1.offsetMillis = 275;
      PositionInformation positionInformation2 = mediaList0.getPositionInformation();
      assertEquals(0, positionInformation2.getIndex());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MediaList mediaList0 = new MediaList();
      PositionInformation positionInformation0 = new PositionInformation();
      positionInformation0.setOffsetMillis((-603));
      mediaList0.setPositionInformation(positionInformation0);
      PositionInformation positionInformation1 = mediaList0.getPositionInformation();
      assertEquals(0, positionInformation1.getIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MediaList mediaList0 = new MediaList();
      PositionInformation positionInformation0 = new PositionInformation();
      mediaList0.setPositionInformation(positionInformation0);
      PositionInformation positionInformation1 = mediaList0.getPositionInformation();
      assertEquals(0, positionInformation1.getOffsetMillis());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MediaList mediaList0 = new MediaList();
      PositionInformation positionInformation0 = new PositionInformation();
      positionInformation0.setIndex(275);
      mediaList0.setPositionInformation(positionInformation0);
      PositionInformation positionInformation1 = mediaList0.getPositionInformation();
      assertSame(positionInformation1, positionInformation0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MediaList mediaList0 = new MediaList();
      PositionInformation positionInformation0 = new PositionInformation();
      positionInformation0.index = (-1662);
      mediaList0.setPositionInformation(positionInformation0);
      PositionInformation positionInformation1 = mediaList0.getPositionInformation();
      assertNull(positionInformation1.getId());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MediaList mediaList0 = new MediaList();
      LinkedList<AbstractMedia> linkedList0 = new LinkedList<AbstractMedia>();
      mediaList0.mediaCollectionOrMediaMetadata = (List<AbstractMedia>) linkedList0;
      MediaMetadata mediaMetadata0 = new MediaMetadata();
      linkedList0.add((AbstractMedia) mediaMetadata0);
      List<AbstractMedia> list0 = mediaList0.getMediaCollectionOrMediaMetadata();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MediaList mediaList0 = new MediaList();
      mediaList0.setIndex(1209);
      int int0 = mediaList0.getIndex();
      assertEquals(1209, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MediaList mediaList0 = new MediaList();
      mediaList0.index = 0;
      mediaList0.index = (-189);
      int int0 = mediaList0.getIndex();
      assertEquals((-189), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MediaList mediaList0 = new MediaList();
      mediaList0.count = 1786;
      int int0 = mediaList0.getCount();
      assertEquals(1786, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MediaList mediaList0 = new MediaList();
      mediaList0.setCount((-655));
      int int0 = mediaList0.getCount();
      assertEquals((-655), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MediaList mediaList0 = new MediaList();
      mediaList0.getMediaCollectionOrMediaMetadata();
      List<AbstractMedia> list0 = mediaList0.getMediaCollectionOrMediaMetadata();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MediaList mediaList0 = new MediaList();
      PositionInformation positionInformation0 = mediaList0.getPositionInformation();
      assertNull(positionInformation0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MediaList mediaList0 = new MediaList();
      int int0 = mediaList0.getIndex();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MediaList mediaList0 = new MediaList();
      int int0 = mediaList0.getTotal();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MediaList mediaList0 = new MediaList();
      int int0 = mediaList0.getCount();
      assertEquals(0, int0);
  }
}