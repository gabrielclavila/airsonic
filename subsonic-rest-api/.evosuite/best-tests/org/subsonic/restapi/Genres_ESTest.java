/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 15:45:37 GMT 2024
 */

package org.subsonic.restapi;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.subsonic.restapi.Genre;
import org.subsonic.restapi.Genres;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Genres_ESTest extends Genres_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Genres genres0 = new Genres();
      LinkedList<Genre> linkedList0 = new LinkedList<Genre>();
      Genre genre0 = new Genre();
      linkedList0.add(genre0);
      genres0.genre = (List<Genre>) linkedList0;
      List<Genre> list0 = genres0.getGenre();
      assertTrue(list0.contains(genre0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Genres genres0 = new Genres();
      genres0.getGenre();
      List<Genre> list0 = genres0.getGenre();
      assertEquals(0, list0.size());
  }
}
