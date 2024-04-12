/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 20:38:22 GMT 2024
 */

package org.airsonic.player.service.search;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Map;
import org.airsonic.player.service.search.IndexType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IndexType_ESTest extends IndexType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IndexType[] indexTypeArray0 = IndexType.values();
      assertEquals(5, indexTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IndexType indexType0 = IndexType.valueOf("SONG");
      assertEquals(IndexType.SONG, indexType0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IndexType indexType0 = IndexType.ARTIST_ID3;
      Map<String, Float> map0 = indexType0.getBoosts();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IndexType indexType0 = IndexType.ARTIST_ID3;
      String[] stringArray0 = indexType0.getFields();
      assertEquals(1, stringArray0.length);
  }
}
