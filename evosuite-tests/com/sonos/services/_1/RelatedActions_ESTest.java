/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 01:23:30 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.GenericAction;
import com.sonos.services._1.RelatedActions;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RelatedActions_ESTest extends RelatedActions_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RelatedActions relatedActions0 = new RelatedActions();
      List<GenericAction> list0 = relatedActions0.getAction();
      relatedActions0.action = list0;
      LinkedList<GenericAction> linkedList0 = new LinkedList<GenericAction>();
      GenericAction genericAction0 = new GenericAction();
      linkedList0.add(genericAction0);
      relatedActions0.action = (List<GenericAction>) linkedList0;
      List<GenericAction> list1 = relatedActions0.getAction();
      assertTrue(list1.contains(genericAction0));
  }
}
