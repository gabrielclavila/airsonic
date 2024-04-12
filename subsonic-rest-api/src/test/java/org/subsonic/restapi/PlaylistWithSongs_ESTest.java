/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 15:29:59 GMT 2024
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
import org.subsonic.restapi.PlaylistWithSongs;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PlaylistWithSongs_ESTest extends PlaylistWithSongs_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PlaylistWithSongs playlistWithSongs0 = new PlaylistWithSongs();
      LinkedList<Child> linkedList0 = new LinkedList<Child>();
      playlistWithSongs0.entry = (List<Child>) linkedList0;
      Child child0 = new Child();
      linkedList0.add(child0);
      List<Child> list0 = playlistWithSongs0.getEntry();
      assertNotNull(list0);
      assertTrue(list0.contains(child0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PlaylistWithSongs playlistWithSongs0 = new PlaylistWithSongs();
      List<Child> list0 = playlistWithSongs0.getEntry();
      List<Child> list1 = playlistWithSongs0.getEntry();
      assertNotNull(list1);
      assertSame(list1, list0);
  }
}
