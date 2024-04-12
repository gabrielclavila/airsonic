/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 15:54:04 GMT 2024
 */

package org.subsonic.restapi;

import org.junit.Test;
import static org.junit.Assert.*;
import javax.xml.datatype.XMLGregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.subsonic.restapi.Artist;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Artist_ESTest extends Artist_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Artist artist0 = new Artist();
      Integer integer0 = new Integer(0);
      artist0.setUserRating(integer0);
      Integer integer1 = artist0.getUserRating();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Artist artist0 = new Artist();
      Integer integer0 = new Integer(1);
      artist0.userRating = integer0;
      Integer integer1 = artist0.getUserRating();
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Artist artist0 = new Artist();
      Integer integer0 = new Integer((-622));
      artist0.setUserRating(integer0);
      Integer integer1 = artist0.getUserRating();
      assertEquals((-622), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Artist artist0 = new Artist();
      artist0.name = "-aAaw4[4b3i oHy))DE";
      String string0 = artist0.getName();
      assertEquals("-aAaw4[4b3i oHy))DE", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Artist artist0 = new Artist();
      artist0.setName("");
      String string0 = artist0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Artist artist0 = new Artist();
      artist0.setId("");
      String string0 = artist0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Artist artist0 = new Artist();
      Double double0 = Double.valueOf(0.0);
      artist0.setAverageRating(double0);
      Double double1 = artist0.getAverageRating();
      assertEquals(0.0, (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Artist artist0 = new Artist();
      Double double0 = new Double((-4514.76201198));
      artist0.averageRating = double0;
      Double double1 = artist0.getAverageRating();
      assertEquals((-4514.76201198), (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Artist artist0 = new Artist();
      Double double0 = new Double(1021.1207);
      artist0.setAverageRating(double0);
      Double double1 = artist0.getAverageRating();
      assertEquals(1021.1207, (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Artist artist0 = new Artist();
      XMLGregorianCalendar xMLGregorianCalendar0 = artist0.getStarred();
      assertNull(xMLGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Artist artist0 = new Artist();
      Double double0 = artist0.getAverageRating();
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Artist artist0 = new Artist();
      String string0 = artist0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Artist artist0 = new Artist();
      Integer integer0 = artist0.getUserRating();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Artist artist0 = new Artist();
      artist0.setStarred((XMLGregorianCalendar) null);
      assertNull(artist0.getAverageRating());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Artist artist0 = new Artist();
      artist0.setId("Wd@_nv");
      String string0 = artist0.getId();
      assertEquals("Wd@_nv", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Artist artist0 = new Artist();
      String string0 = artist0.getName();
      assertNull(string0);
  }
}
