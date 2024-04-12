/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 14:30:01 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.MediaList;
import com.sonos.services._1.SearchResponse;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SearchResponse_ESTest extends SearchResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SearchResponse searchResponse0 = new SearchResponse();
      MediaList mediaList0 = new MediaList();
      searchResponse0.searchResult = mediaList0;
      mediaList0.setTotal(2813);
      MediaList mediaList1 = searchResponse0.getSearchResult();
      assertEquals(2813, mediaList1.getTotal());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SearchResponse searchResponse0 = new SearchResponse();
      MediaList mediaList0 = new MediaList();
      searchResponse0.setSearchResult(mediaList0);
      mediaList0.total = 0;
      mediaList0.total = (-2808);
      MediaList mediaList1 = searchResponse0.getSearchResult();
      assertEquals((-2808), mediaList1.getTotal());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SearchResponse searchResponse0 = new SearchResponse();
      MediaList mediaList0 = new MediaList();
      searchResponse0.setSearchResult(mediaList0);
      mediaList0.setIndex(16);
      MediaList mediaList1 = searchResponse0.getSearchResult();
      assertSame(mediaList1, mediaList0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SearchResponse searchResponse0 = new SearchResponse();
      SearchResponse searchResponse1 = new SearchResponse();
      MediaList mediaList0 = new MediaList();
      searchResponse1.searchResult = mediaList0;
      searchResponse0.setSearchResult(mediaList0);
      searchResponse1.searchResult.index = 0;
      searchResponse1.searchResult.index = (-1668);
      MediaList mediaList1 = searchResponse0.getSearchResult();
      assertEquals((-1668), mediaList1.getIndex());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SearchResponse searchResponse0 = new SearchResponse();
      MediaList mediaList0 = new MediaList();
      searchResponse0.searchResult = mediaList0;
      mediaList0.setCount(2627);
      MediaList mediaList1 = searchResponse0.getSearchResult();
      assertEquals(0, mediaList1.getIndex());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SearchResponse searchResponse0 = new SearchResponse();
      MediaList mediaList0 = new MediaList();
      mediaList0.setCount((-328));
      searchResponse0.setSearchResult(mediaList0);
      MediaList mediaList1 = searchResponse0.getSearchResult();
      assertEquals((-328), mediaList1.getCount());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SearchResponse searchResponse0 = new SearchResponse();
      MediaList mediaList0 = searchResponse0.getSearchResult();
      assertNull(mediaList0);
  }
}
