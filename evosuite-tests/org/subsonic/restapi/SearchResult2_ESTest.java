/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 11 00:02:33 GMT 2024
 */

package org.subsonic.restapi;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.subsonic.restapi.Artist;
import org.subsonic.restapi.Child;
import org.subsonic.restapi.SearchResult2;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SearchResult2_ESTest extends SearchResult2_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SearchResult2 searchResult2_0 = new SearchResult2();
      LinkedList<Child> linkedList0 = new LinkedList<Child>();
      searchResult2_0.song = (List<Child>) linkedList0;
      Child child0 = new Child();
      linkedList0.add(child0);
      List<Child> list0 = searchResult2_0.getSong();
      assertTrue(list0.contains(child0));
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SearchResult2 searchResult2_0 = new SearchResult2();
      LinkedList<Artist> linkedList0 = new LinkedList<Artist>();
      searchResult2_0.artist = (List<Artist>) linkedList0;
      Artist artist0 = new Artist();
      linkedList0.add(artist0);
      List<Artist> list0 = searchResult2_0.getArtist();
      assertNotNull(list0);
      assertTrue(list0.contains(artist0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SearchResult2 searchResult2_0 = new SearchResult2();
      LinkedList<Child> linkedList0 = new LinkedList<Child>();
      Child child0 = new Child();
      linkedList0.add(child0);
      searchResult2_0.album = (List<Child>) linkedList0;
      List<Child> list0 = searchResult2_0.getAlbum();
      assertNotNull(list0);
      assertTrue(list0.contains(child0));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SearchResult2 searchResult2_0 = new SearchResult2();
      List<Child> list0 = searchResult2_0.getSong();
      List<Child> list1 = searchResult2_0.getSong();
      assertSame(list1, list0);
      assertNotNull(list1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SearchResult2 searchResult2_0 = new SearchResult2();
      List<Child> list0 = searchResult2_0.getAlbum();
      List<Child> list1 = searchResult2_0.getAlbum();
      assertNotNull(list1);
      assertSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SearchResult2 searchResult2_0 = new SearchResult2();
      List<Artist> list0 = searchResult2_0.getArtist();
      List<Artist> list1 = searchResult2_0.getArtist();
      assertNotNull(list1);
      assertSame(list1, list0);
  }
}