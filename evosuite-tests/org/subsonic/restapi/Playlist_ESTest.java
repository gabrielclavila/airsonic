/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 11 00:04:50 GMT 2024
 */

package org.subsonic.restapi;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.subsonic.restapi.Playlist;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Playlist_ESTest extends Playlist_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Playlist playlist0 = new Playlist();
      Boolean boolean0 = Boolean.TRUE;
      playlist0.setPublic(boolean0);
      Boolean boolean1 = playlist0.isPublic();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Playlist playlist0 = new Playlist();
      Boolean boolean0 = Boolean.FALSE;
      playlist0._public = boolean0;
      Boolean boolean1 = playlist0.isPublic();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Playlist playlist0 = new Playlist();
      playlist0.setSongCount(3323);
      int int0 = playlist0.getSongCount();
      assertEquals(3323, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Playlist playlist0 = new Playlist();
      playlist0.songCount = (-1);
      int int0 = playlist0.getSongCount();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Playlist playlist0 = new Playlist();
      playlist0.owner = "_m#ONkLnT+Chm}P1.^=";
      String string0 = playlist0.getOwner();
      assertEquals("_m#ONkLnT+Chm}P1.^=", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Playlist playlist0 = new Playlist();
      playlist0.setOwner("");
      String string0 = playlist0.getOwner();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Playlist playlist0 = new Playlist();
      playlist0.name = "org.subsonic.restapi.Playlist";
      String string0 = playlist0.getName();
      assertEquals("org.subsonic.restapi.Playlist", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Playlist playlist0 = new Playlist();
      playlist0.name = "";
      String string0 = playlist0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Playlist playlist0 = new Playlist();
      playlist0.setId("TyC~");
      String string0 = playlist0.getId();
      assertEquals("TyC~", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Playlist playlist0 = new Playlist();
      playlist0.id = "";
      String string0 = playlist0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Playlist playlist0 = new Playlist();
      playlist0.setDuration(1);
      int int0 = playlist0.getDuration();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Playlist playlist0 = new Playlist();
      playlist0.setDuration((-1));
      int int0 = playlist0.getDuration();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Playlist playlist0 = new Playlist();
      playlist0.setCoverArt("O3E'myj/^pq");
      String string0 = playlist0.getCoverArt();
      assertEquals("O3E'myj/^pq", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Playlist playlist0 = new Playlist();
      playlist0.setCoverArt("");
      String string0 = playlist0.getCoverArt();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Playlist playlist0 = new Playlist();
      playlist0.setComment("");
      String string0 = playlist0.getComment();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Playlist playlist0 = new Playlist();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      playlist0.allowedUser = (List<String>) linkedList0;
      linkedList0.add("{/H'Tcs9h:D}Xj0+Cn");
      List<String> list0 = playlist0.getAllowedUser();
      assertTrue(list0.contains("{/H'Tcs9h:D}Xj0+Cn"));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Playlist playlist0 = new Playlist();
      playlist0.getAllowedUser();
      List<String> list0 = playlist0.getAllowedUser();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Playlist playlist0 = new Playlist();
      String string0 = playlist0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Playlist playlist0 = new Playlist();
      playlist0.setName("ZpdOAWSo");
      assertNull(playlist0.isPublic());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Playlist playlist0 = new Playlist();
      playlist0.setChanged((XMLGregorianCalendar) null);
      assertNull(playlist0.isPublic());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Playlist playlist0 = new Playlist();
      XMLGregorianCalendar xMLGregorianCalendar0 = playlist0.getCreated();
      assertNull(xMLGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Playlist playlist0 = new Playlist();
      int int0 = playlist0.getDuration();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Playlist playlist0 = new Playlist();
      playlist0.setCreated((XMLGregorianCalendar) null);
      assertNull(playlist0.getComment());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Playlist playlist0 = new Playlist();
      Boolean boolean0 = playlist0.isPublic();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Playlist playlist0 = new Playlist();
      String string0 = playlist0.getComment();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Playlist playlist0 = new Playlist();
      String string0 = playlist0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Playlist playlist0 = new Playlist();
      String string0 = playlist0.getCoverArt();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Playlist playlist0 = new Playlist();
      int int0 = playlist0.getSongCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Playlist playlist0 = new Playlist();
      XMLGregorianCalendar xMLGregorianCalendar0 = playlist0.getChanged();
      assertNull(xMLGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Playlist playlist0 = new Playlist();
      playlist0.setComment("ZpdOAWSo");
      String string0 = playlist0.getComment();
      assertEquals("ZpdOAWSo", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Playlist playlist0 = new Playlist();
      String string0 = playlist0.getOwner();
      assertNull(string0);
  }
}