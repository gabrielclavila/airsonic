/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 01:09:50 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.RemoveFromContainerResponse;
import com.sonos.services._1.RemoveFromContainerResult;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RemoveFromContainerResponse_ESTest extends RemoveFromContainerResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RemoveFromContainerResponse removeFromContainerResponse0 = new RemoveFromContainerResponse();
      RemoveFromContainerResult removeFromContainerResult0 = removeFromContainerResponse0.getRemoveFromContainerResult();
      assertNull(removeFromContainerResult0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RemoveFromContainerResponse removeFromContainerResponse0 = new RemoveFromContainerResponse();
      RemoveFromContainerResult removeFromContainerResult0 = new RemoveFromContainerResult();
      removeFromContainerResponse0.setRemoveFromContainerResult(removeFromContainerResult0);
      RemoveFromContainerResult removeFromContainerResult1 = removeFromContainerResponse0.getRemoveFromContainerResult();
      assertSame(removeFromContainerResult1, removeFromContainerResult0);
  }
}
