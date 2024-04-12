/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 11 00:37:58 GMT 2024
 */

package org.subsonic.restapi;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.subsonic.restapi.Child;
import org.subsonic.restapi.SimilarSongs;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimilarSongs_ESTest extends SimilarSongs_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimilarSongs similarSongs0 = new SimilarSongs();
      LinkedList<Child> linkedList0 = new LinkedList<Child>();
      Child child0 = new Child();
      linkedList0.add(child0);
      similarSongs0.song = (List<Child>) linkedList0;
      List<Child> list0 = similarSongs0.getSong();
      assertTrue(list0.contains(child0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimilarSongs similarSongs0 = new SimilarSongs();
      List<Child> list0 = similarSongs0.getSong();
      List<Child> list1 = similarSongs0.getSong();
      assertSame(list1, list0);
  }
}
