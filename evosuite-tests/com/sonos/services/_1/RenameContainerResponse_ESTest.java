/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 01:47:04 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.RenameContainerResponse;
import com.sonos.services._1.RenameContainerResult;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RenameContainerResponse_ESTest extends RenameContainerResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RenameContainerResponse renameContainerResponse0 = new RenameContainerResponse();
      RenameContainerResult renameContainerResult0 = new RenameContainerResult();
      renameContainerResponse0.setRenameContainerResult(renameContainerResult0);
      RenameContainerResult renameContainerResult1 = renameContainerResponse0.getRenameContainerResult();
      assertSame(renameContainerResult1, renameContainerResult0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RenameContainerResponse renameContainerResponse0 = new RenameContainerResponse();
      RenameContainerResult renameContainerResult0 = renameContainerResponse0.getRenameContainerResult();
      assertNull(renameContainerResult0);
  }
}
