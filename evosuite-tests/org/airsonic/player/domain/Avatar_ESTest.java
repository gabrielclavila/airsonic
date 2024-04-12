/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 20:56:20 GMT 2024
 */

package org.airsonic.player.domain;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;
import org.airsonic.player.domain.Avatar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Avatar_ESTest extends Avatar_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Avatar avatar0 = new Avatar(0, (String) null, (Date) null, (String) null, 4704, 0, byteArray0);
      int int0 = avatar0.getWidth();
      assertEquals(0, avatar0.getHeight());
      assertEquals(0, avatar0.getId());
      assertEquals(4704, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Avatar avatar0 = new Avatar((-3424), "}SmM[V]?", (Date) null, "}SmM[V]?", (-3424), 2726, (byte[]) null);
      int int0 = avatar0.getWidth();
      assertEquals((-3424), avatar0.getId());
      assertEquals((-3424), int0);
      assertEquals(2726, avatar0.getHeight());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Avatar avatar0 = new Avatar(0, (String) null, (Date) null, (String) null, 4704, 0, byteArray0);
      avatar0.getName();
      assertEquals(4704, avatar0.getWidth());
      assertEquals(0, avatar0.getId());
      assertEquals(0, avatar0.getHeight());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Avatar avatar0 = new Avatar(0, "", (Date) null, "org.airsonic.player.domain.Avatar", 0, (-156), byteArray0);
      String string0 = avatar0.getName();
      assertEquals("org.airsonic.player.domain.Avatar", avatar0.getMimeType());
      assertEquals(0, avatar0.getId());
      assertEquals(0, avatar0.getWidth());
      assertEquals("", string0);
      assertEquals((-156), avatar0.getHeight());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Avatar avatar0 = new Avatar(0, (String) null, (Date) null, (String) null, 4704, 0, byteArray0);
      avatar0.getMimeType();
      assertEquals(0, avatar0.getHeight());
      assertEquals(4704, avatar0.getWidth());
      assertEquals(0, avatar0.getId());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0);
      byte[] byteArray0 = new byte[2];
      Avatar avatar0 = new Avatar(0, "", mockDate0, "", 0, 0, byteArray0);
      avatar0.getMimeType();
      assertEquals(0, avatar0.getHeight());
      assertEquals(0, avatar0.getWidth());
      assertEquals(0, avatar0.getId());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0, 0, 0);
      byte[] byteArray0 = new byte[0];
      Avatar avatar0 = new Avatar(414, "y\u0005S", mockDate0, "y\u0005S", 0, (-2997), byteArray0);
      int int0 = avatar0.getId();
      assertEquals(0, avatar0.getWidth());
      assertEquals(414, int0);
      assertEquals((-2997), avatar0.getHeight());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1), (-1), 792, (-1), 1536, 792);
      byte[] byteArray0 = new byte[8];
      Avatar avatar0 = new Avatar((-1), "K=;j_[G(6K$g", mockDate0, "c6e8n^@J\"", 0, 0, byteArray0);
      int int0 = avatar0.getId();
      assertEquals((-1), int0);
      assertEquals(0, avatar0.getWidth());
      assertEquals(0, avatar0.getHeight());
      assertEquals("K=;j_[G(6K$g", avatar0.getName());
      assertEquals("c6e8n^@J\"", avatar0.getMimeType());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1), (-1), 792, (-1), 1536, 792);
      byte[] byteArray0 = new byte[8];
      Avatar avatar0 = new Avatar((-1), "K=;j_[G(6K$g", mockDate0, "c6e8n^@J\"", 0, 0, byteArray0);
      int int0 = avatar0.getHeight();
      assertEquals("c6e8n^@J\"", avatar0.getMimeType());
      assertEquals(0, int0);
      assertEquals(0, avatar0.getWidth());
      assertEquals("K=;j_[G(6K$g", avatar0.getName());
      assertEquals((-1), avatar0.getId());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      byte[] byteArray0 = new byte[1];
      Avatar avatar0 = new Avatar(231, "", mockDate0, "", 0, 1885, byteArray0);
      int int0 = avatar0.getHeight();
      assertEquals(231, avatar0.getId());
      assertEquals(1885, int0);
      assertEquals(0, avatar0.getWidth());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Avatar avatar0 = new Avatar(0, "Yd%:IU(#", mockDate0, "Yd%:IU(#", 0, 1730, (byte[]) null);
      avatar0.getData();
      assertEquals(1730, avatar0.getHeight());
      assertEquals(0, avatar0.getId());
      assertEquals(0, avatar0.getWidth());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-3093), (-3093), (-3093), 0, (-3093), 0);
      byte[] byteArray0 = new byte[0];
      Avatar avatar0 = new Avatar((-3093), "", mockDate0, "KgF{V!5qk,", (-2758), (-2758), byteArray0);
      avatar0.getData();
      assertEquals("", avatar0.getName());
      assertEquals((-3093), avatar0.getId());
      assertEquals((-2758), avatar0.getWidth());
      assertEquals("KgF{V!5qk,", avatar0.getMimeType());
      assertEquals((-2758), avatar0.getHeight());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1), (-1), 792, (-1), 1536, 792);
      byte[] byteArray0 = new byte[8];
      Avatar avatar0 = new Avatar((-1), "K=;j_[G(6K$g", mockDate0, "c6e8n^@J\"", 0, 0, byteArray0);
      avatar0.getCreatedDate();
      assertEquals("c6e8n^@J\"", avatar0.getMimeType());
      assertEquals(0, avatar0.getWidth());
      assertEquals((-1), avatar0.getId());
      assertEquals("K=;j_[G(6K$g", avatar0.getName());
      assertEquals(0, avatar0.getHeight());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Avatar avatar0 = new Avatar(0, "", (Date) null, "org.airsonic.player.domain.Avatar", 0, (-156), byteArray0);
      int int0 = avatar0.getWidth();
      assertEquals("", avatar0.getName());
      assertEquals(0, avatar0.getId());
      assertEquals("org.airsonic.player.domain.Avatar", avatar0.getMimeType());
      assertEquals((-156), avatar0.getHeight());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Avatar avatar0 = new Avatar(0, "", (Date) null, "org.airsonic.player.domain.Avatar", 0, (-156), byteArray0);
      avatar0.getCreatedDate();
      assertEquals((-156), avatar0.getHeight());
      assertEquals("org.airsonic.player.domain.Avatar", avatar0.getMimeType());
      assertEquals(0, avatar0.getId());
      assertEquals("", avatar0.getName());
      assertEquals(0, avatar0.getWidth());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Avatar avatar0 = new Avatar(0, "", (Date) null, "org.airsonic.player.domain.Avatar", 0, (-156), byteArray0);
      int int0 = avatar0.getId();
      assertEquals(0, avatar0.getWidth());
      assertEquals((-156), avatar0.getHeight());
      assertEquals(0, int0);
      assertEquals("", avatar0.getName());
      assertEquals("org.airsonic.player.domain.Avatar", avatar0.getMimeType());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Avatar avatar0 = new Avatar(0, "", (Date) null, "org.airsonic.player.domain.Avatar", 0, (-156), byteArray0);
      avatar0.getData();
      assertEquals("", avatar0.getName());
      assertEquals("org.airsonic.player.domain.Avatar", avatar0.getMimeType());
      assertEquals((-156), avatar0.getHeight());
      assertEquals(0, avatar0.getId());
      assertEquals(0, avatar0.getWidth());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Avatar avatar0 = new Avatar(0, "", (Date) null, "org.airsonic.player.domain.Avatar", 0, (-156), byteArray0);
      int int0 = avatar0.getHeight();
      assertEquals(0, avatar0.getId());
      assertEquals(0, avatar0.getWidth());
      assertEquals("org.airsonic.player.domain.Avatar", avatar0.getMimeType());
      assertEquals((-156), int0);
      assertEquals("", avatar0.getName());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Avatar avatar0 = new Avatar(0, "", (Date) null, "org.airsonic.player.domain.Avatar", 0, (-156), byteArray0);
      String string0 = avatar0.getMimeType();
      assertEquals("org.airsonic.player.domain.Avatar", string0);
      assertEquals("", avatar0.getName());
      assertEquals(0, avatar0.getWidth());
      assertEquals(0, avatar0.getId());
      assertEquals((-156), avatar0.getHeight());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1), (-1), 792, (-1), 1536, 792);
      byte[] byteArray0 = new byte[8];
      Avatar avatar0 = new Avatar((-1), "K=;j_[G(6K$g", mockDate0, "c6e8n^@J\"", 0, 0, byteArray0);
      String string0 = avatar0.getName();
      assertEquals((-1), avatar0.getId());
      assertEquals(0, avatar0.getHeight());
      assertEquals(0, avatar0.getWidth());
      assertEquals("K=;j_[G(6K$g", string0);
      assertEquals("c6e8n^@J\"", avatar0.getMimeType());
  }
}
