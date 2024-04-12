/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 11 00:30:21 GMT 2024
 */

package org.subsonic.restapi;

import org.junit.Test;
import static org.junit.Assert.*;
import javax.xml.datatype.XMLGregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.subsonic.restapi.ArtistID3;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArtistID3_ESTest extends ArtistID3_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArtistID3 artistID3_0 = new ArtistID3();
      artistID3_0.name = "org.subsonic.restapi.ArtistWithAlbumsID3";
      String string0 = artistID3_0.getName();
      assertEquals("org.subsonic.restapi.ArtistWithAlbumsID3", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArtistID3 artistID3_0 = new ArtistID3();
      artistID3_0.setName("");
      String string0 = artistID3_0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArtistID3 artistID3_0 = new ArtistID3();
      artistID3_0.setId("");
      String string0 = artistID3_0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArtistID3 artistID3_0 = new ArtistID3();
      artistID3_0.coverArt = "Zx3un49(>b";
      String string0 = artistID3_0.getCoverArt();
      assertEquals("Zx3un49(>b", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArtistID3 artistID3_0 = new ArtistID3();
      artistID3_0.setCoverArt("");
      String string0 = artistID3_0.getCoverArt();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArtistID3 artistID3_0 = new ArtistID3();
      artistID3_0.albumCount = 1013;
      int int0 = artistID3_0.getAlbumCount();
      assertEquals(1013, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArtistID3 artistID3_0 = new ArtistID3();
      artistID3_0.setAlbumCount((-11));
      int int0 = artistID3_0.getAlbumCount();
      assertEquals((-11), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArtistID3 artistID3_0 = new ArtistID3();
      int int0 = artistID3_0.getAlbumCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArtistID3 artistID3_0 = new ArtistID3();
      artistID3_0.setStarred((XMLGregorianCalendar) null);
      assertNull(artistID3_0.getCoverArt());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArtistID3 artistID3_0 = new ArtistID3();
      String string0 = artistID3_0.getCoverArt();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArtistID3 artistID3_0 = new ArtistID3();
      String string0 = artistID3_0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArtistID3 artistID3_0 = new ArtistID3();
      artistID3_0.setId("~90nG/ 7)Xx#1");
      String string0 = artistID3_0.getId();
      assertEquals("~90nG/ 7)Xx#1", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArtistID3 artistID3_0 = new ArtistID3();
      XMLGregorianCalendar xMLGregorianCalendar0 = artistID3_0.getStarred();
      assertNull(xMLGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ArtistID3 artistID3_0 = new ArtistID3();
      String string0 = artistID3_0.getId();
      assertNull(string0);
  }
}
