/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 11 00:11:50 GMT 2024
 */

package org.subsonic.restapi;

import org.junit.Test;
import static org.junit.Assert.*;
import javax.xml.datatype.XMLGregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.subsonic.restapi.PodcastEpisode;
import org.subsonic.restapi.PodcastStatus;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PodcastEpisode_ESTest extends PodcastEpisode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PodcastEpisode podcastEpisode0 = new PodcastEpisode();
      podcastEpisode0.setStreamId("VIDEO");
      String string0 = podcastEpisode0.getStreamId();
      assertEquals("VIDEO", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PodcastEpisode podcastEpisode0 = new PodcastEpisode();
      podcastEpisode0.setStreamId("");
      String string0 = podcastEpisode0.getStreamId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PodcastEpisode podcastEpisode0 = new PodcastEpisode();
      PodcastStatus podcastStatus0 = PodcastStatus.SKIPPED;
      podcastEpisode0.setStatus(podcastStatus0);
      PodcastStatus podcastStatus1 = podcastEpisode0.getStatus();
      assertSame(podcastStatus1, podcastStatus0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PodcastEpisode podcastEpisode0 = new PodcastEpisode();
      podcastEpisode0.setDescription("SKIPPED");
      String string0 = podcastEpisode0.getDescription();
      assertEquals("SKIPPED", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PodcastEpisode podcastEpisode0 = new PodcastEpisode();
      podcastEpisode0.description = "";
      String string0 = podcastEpisode0.getDescription();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PodcastEpisode podcastEpisode0 = new PodcastEpisode();
      podcastEpisode0.setChannelId("");
      String string0 = podcastEpisode0.getChannelId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PodcastEpisode podcastEpisode0 = new PodcastEpisode();
      podcastEpisode0.setChannelId("~F@Q@rq");
      String string0 = podcastEpisode0.getChannelId();
      assertEquals("~F@Q@rq", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PodcastEpisode podcastEpisode0 = new PodcastEpisode();
      String string0 = podcastEpisode0.getStreamId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PodcastEpisode podcastEpisode0 = new PodcastEpisode();
      String string0 = podcastEpisode0.getDescription();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PodcastEpisode podcastEpisode0 = new PodcastEpisode();
      podcastEpisode0.getStatus();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PodcastEpisode podcastEpisode0 = new PodcastEpisode();
      XMLGregorianCalendar xMLGregorianCalendar0 = podcastEpisode0.getPublishDate();
      assertNull(xMLGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PodcastEpisode podcastEpisode0 = new PodcastEpisode();
      podcastEpisode0.setPublishDate((XMLGregorianCalendar) null);
      assertNull(podcastEpisode0.getStreamId());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PodcastEpisode podcastEpisode0 = new PodcastEpisode();
      String string0 = podcastEpisode0.getChannelId();
      assertNull(string0);
  }
}
