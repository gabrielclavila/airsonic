/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 10 23:58:12 GMT 2024
 */

package org.subsonic.restapi;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.subsonic.restapi.AlbumWithSongsID3;
import org.subsonic.restapi.Child;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AlbumWithSongsID3_ESTest extends AlbumWithSongsID3_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AlbumWithSongsID3 albumWithSongsID3_0 = new AlbumWithSongsID3();
      LinkedList<Child> linkedList0 = new LinkedList<Child>();
      Child child0 = new Child();
      linkedList0.add(child0);
      albumWithSongsID3_0.song = (List<Child>) linkedList0;
      List<Child> list0 = albumWithSongsID3_0.getSong();
      assertTrue(list0.contains(child0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AlbumWithSongsID3 albumWithSongsID3_0 = new AlbumWithSongsID3();
      List<Child> list0 = albumWithSongsID3_0.getSong();
      List<Child> list1 = albumWithSongsID3_0.getSong();
      assertSame(list1, list0);
  }
}
