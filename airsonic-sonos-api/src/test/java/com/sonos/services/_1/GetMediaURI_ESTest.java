/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 14:27:37 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.GetMediaURI;
import com.sonos.services._1.MediaUriAction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GetMediaURI_ESTest extends GetMediaURI_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GetMediaURI getMediaURI0 = new GetMediaURI();
      MediaUriAction mediaUriAction0 = MediaUriAction.EXPLICIT_PLAY;
      getMediaURI0.setAction(mediaUriAction0);
      assertNull(getMediaURI0.getSecondsSinceExplicit());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GetMediaURI getMediaURI0 = new GetMediaURI();
      Integer integer0 = new Integer(0);
      getMediaURI0.secondsSinceExplicit = integer0;
      Integer integer1 = getMediaURI0.getSecondsSinceExplicit();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GetMediaURI getMediaURI0 = new GetMediaURI();
      Integer integer0 = new Integer(1592);
      getMediaURI0.setSecondsSinceExplicit(integer0);
      Integer integer1 = getMediaURI0.getSecondsSinceExplicit();
      assertEquals(1592, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GetMediaURI getMediaURI0 = new GetMediaURI();
      Integer integer0 = new Integer((-1));
      getMediaURI0.secondsSinceExplicit = integer0;
      Integer integer1 = getMediaURI0.getSecondsSinceExplicit();
      assertEquals((-1), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GetMediaURI getMediaURI0 = new GetMediaURI();
      getMediaURI0.setId("(d[,%,wx9Y");
      String string0 = getMediaURI0.getId();
      assertEquals("(d[,%,wx9Y", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GetMediaURI getMediaURI0 = new GetMediaURI();
      getMediaURI0.id = "";
      String string0 = getMediaURI0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GetMediaURI getMediaURI0 = new GetMediaURI();
      getMediaURI0.deviceSessionToken = "|<H=jH[";
      String string0 = getMediaURI0.getDeviceSessionToken();
      assertEquals("|<H=jH[", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GetMediaURI getMediaURI0 = new GetMediaURI();
      getMediaURI0.setDeviceSessionToken("");
      String string0 = getMediaURI0.getDeviceSessionToken();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GetMediaURI getMediaURI0 = new GetMediaURI();
      MediaUriAction mediaUriAction0 = MediaUriAction.EXPLICIT_SKIP_BACK;
      getMediaURI0.action = mediaUriAction0;
      MediaUriAction mediaUriAction1 = getMediaURI0.getAction();
      assertEquals(MediaUriAction.EXPLICIT_SKIP_BACK, mediaUriAction1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GetMediaURI getMediaURI0 = new GetMediaURI();
      String string0 = getMediaURI0.getDeviceSessionToken();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GetMediaURI getMediaURI0 = new GetMediaURI();
      Integer integer0 = getMediaURI0.getSecondsSinceExplicit();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GetMediaURI getMediaURI0 = new GetMediaURI();
      String string0 = getMediaURI0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GetMediaURI getMediaURI0 = new GetMediaURI();
      MediaUriAction mediaUriAction0 = getMediaURI0.getAction();
      getMediaURI0.setAction(mediaUriAction0);
      assertNull(getMediaURI0.getSecondsSinceExplicit());
  }
}