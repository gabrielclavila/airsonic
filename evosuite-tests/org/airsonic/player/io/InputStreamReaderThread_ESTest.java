/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 20:20:25 GMT 2024
 */

package org.airsonic.player.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.airsonic.player.io.InputStreamReaderThread;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InputStreamReaderThread_ESTest extends InputStreamReaderThread_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Enumeration<ObjectInputStream> enumeration0 = (Enumeration<ObjectInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, true, true).when(enumeration0).hasMoreElements();
      doReturn((Object) null, (Object) null).when(enumeration0).nextElement();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      InputStreamReaderThread inputStreamReaderThread0 = new InputStreamReaderThread(sequenceInputStream0, "", false);
      // Undeclared exception!
      try { 
        inputStreamReaderThread0.run();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.SequenceInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InputStreamReaderThread inputStreamReaderThread0 = new InputStreamReaderThread((InputStream) null, "", false);
      // Undeclared exception!
      try { 
        inputStreamReaderThread0.run();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-1), (byte)118);
      InputStreamReaderThread inputStreamReaderThread0 = new InputStreamReaderThread(byteArrayInputStream0, "f6>wZe& lg1o3", true);
      // Undeclared exception!
      try { 
        inputStreamReaderThread0.run();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      InputStreamReaderThread inputStreamReaderThread0 = new InputStreamReaderThread(byteArrayInputStream0, "", false);
      inputStreamReaderThread0.run();
      //  // Unstable assertion: assertFalse(inputStreamReaderThread0.isDaemon());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(dataInputStream0);
      InputStreamReaderThread inputStreamReaderThread0 = new InputStreamReaderThread(bufferedInputStream0, "", true);
      inputStreamReaderThread0.run();
      inputStreamReaderThread0.run();
      assertFalse(inputStreamReaderThread0.isInterrupted());
  }
}