/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 01:22:09 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.ItemType;
import com.sonos.services._1.RelatedPlay;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RelatedPlay_ESTest extends RelatedPlay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RelatedPlay relatedPlay0 = new RelatedPlay();
      Boolean boolean0 = Boolean.TRUE;
      relatedPlay0.setCanPlay(boolean0);
      Boolean boolean1 = relatedPlay0.isCanPlay();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RelatedPlay relatedPlay0 = new RelatedPlay();
      Boolean boolean0 = new Boolean(false);
      relatedPlay0.setCanPlay(boolean0);
      Boolean boolean1 = relatedPlay0.isCanPlay();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RelatedPlay relatedPlay0 = new RelatedPlay();
      relatedPlay0.title = "b(@-qr<6Z:?C/";
      String string0 = relatedPlay0.getTitle();
      assertEquals("b(@-qr<6Z:?C/", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RelatedPlay relatedPlay0 = new RelatedPlay();
      ItemType itemType0 = ItemType.ALBUM_LIST;
      relatedPlay0.itemType = itemType0;
      ItemType itemType1 = relatedPlay0.getItemType();
      assertEquals("albumList", itemType1.value());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RelatedPlay relatedPlay0 = new RelatedPlay();
      relatedPlay0.setId("");
      String string0 = relatedPlay0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RelatedPlay relatedPlay0 = new RelatedPlay();
      String string0 = relatedPlay0.getTitle();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RelatedPlay relatedPlay0 = new RelatedPlay();
      relatedPlay0.setId("Ra I`5");
      String string0 = relatedPlay0.getId();
      assertEquals("Ra I`5", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RelatedPlay relatedPlay0 = new RelatedPlay();
      ItemType itemType0 = ItemType.ALBUM_LIST;
      relatedPlay0.setItemType(itemType0);
      assertNull(relatedPlay0.getId());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RelatedPlay relatedPlay0 = new RelatedPlay();
      relatedPlay0.getItemType();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RelatedPlay relatedPlay0 = new RelatedPlay();
      Boolean boolean0 = relatedPlay0.isCanPlay();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RelatedPlay relatedPlay0 = new RelatedPlay();
      relatedPlay0.setTitle("");
      String string0 = relatedPlay0.getTitle();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RelatedPlay relatedPlay0 = new RelatedPlay();
      String string0 = relatedPlay0.getId();
      assertNull(string0);
  }
}
