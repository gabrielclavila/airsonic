/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 20:48:29 GMT 2024
 */

package org.airsonic.player.upload;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import org.airsonic.player.upload.MonitoredOutputStream;
import org.airsonic.player.upload.UploadListener;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MonitoredOutputStream_ESTest extends MonitoredOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UploadListener uploadListener0 = mock(UploadListener.class, new ViolatedAssumptionAnswer());
      MonitoredOutputStream monitoredOutputStream0 = new MonitoredOutputStream((OutputStream) null, uploadListener0);
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        monitoredOutputStream0.write(byteArray0, 2154, 215);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.airsonic.player.upload.MonitoredOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      UploadListener uploadListener0 = mock(UploadListener.class, new ViolatedAssumptionAnswer());
      MonitoredOutputStream monitoredOutputStream0 = new MonitoredOutputStream(pipedOutputStream0, uploadListener0);
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        monitoredOutputStream0.write(byteArray0, (-238), (int) (byte)1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("+vHgA=2lOINu");
      UploadListener uploadListener0 = mock(UploadListener.class, new ViolatedAssumptionAnswer());
      MonitoredOutputStream monitoredOutputStream0 = new MonitoredOutputStream(mockPrintStream0, uploadListener0);
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        monitoredOutputStream0.write(byteArray0, (int) (byte) (-98), 921);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -98
         //
         verifyException("org.evosuite.runtime.vfs.VFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      UploadListener uploadListener0 = mock(UploadListener.class, new ViolatedAssumptionAnswer());
      MonitoredOutputStream monitoredOutputStream0 = new MonitoredOutputStream(pipedOutputStream0, uploadListener0);
      byte[] byteArray0 = new byte[1];
      try { 
        monitoredOutputStream0.write(byteArray0, (-37), (-37));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("$m|(#o", false);
      UploadListener uploadListener0 = mock(UploadListener.class, new ViolatedAssumptionAnswer());
      MonitoredOutputStream monitoredOutputStream0 = new MonitoredOutputStream(mockFileOutputStream0, uploadListener0);
      // Undeclared exception!
      try { 
        monitoredOutputStream0.write((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      UploadListener uploadListener0 = mock(UploadListener.class, new ViolatedAssumptionAnswer());
      MonitoredOutputStream monitoredOutputStream0 = new MonitoredOutputStream(pipedOutputStream0, uploadListener0);
      byte[] byteArray0 = new byte[6];
      try { 
        monitoredOutputStream0.write(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MonitoredOutputStream monitoredOutputStream0 = new MonitoredOutputStream(byteArrayOutputStream0, (UploadListener) null);
      // Undeclared exception!
      try { 
        monitoredOutputStream0.write(232);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.airsonic.player.upload.MonitoredOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      UploadListener uploadListener0 = mock(UploadListener.class, new ViolatedAssumptionAnswer());
      MonitoredOutputStream monitoredOutputStream0 = new MonitoredOutputStream(pipedOutputStream0, uploadListener0);
      try { 
        monitoredOutputStream0.write(0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UploadListener uploadListener0 = mock(UploadListener.class, new ViolatedAssumptionAnswer());
      MonitoredOutputStream monitoredOutputStream0 = new MonitoredOutputStream((OutputStream) null, uploadListener0);
      // Undeclared exception!
      try { 
        monitoredOutputStream0.flush();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.airsonic.player.upload.MonitoredOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UploadListener uploadListener0 = mock(UploadListener.class, new ViolatedAssumptionAnswer());
      MonitoredOutputStream monitoredOutputStream0 = new MonitoredOutputStream((OutputStream) null, uploadListener0);
      // Undeclared exception!
      try { 
        monitoredOutputStream0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.airsonic.player.upload.MonitoredOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("DK-Xit^Hs");
      UploadListener uploadListener0 = mock(UploadListener.class, new ViolatedAssumptionAnswer());
      MonitoredOutputStream monitoredOutputStream0 = new MonitoredOutputStream(mockPrintStream0, uploadListener0);
      byte[] byteArray0 = new byte[2];
      monitoredOutputStream0.write(byteArray0);
      assertEquals(2, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("DK-Xit^Hs");
      UploadListener uploadListener0 = mock(UploadListener.class, new ViolatedAssumptionAnswer());
      MonitoredOutputStream monitoredOutputStream0 = new MonitoredOutputStream(mockPrintStream0, uploadListener0);
      monitoredOutputStream0.close();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("DK-Xit^Hs");
      UploadListener uploadListener0 = mock(UploadListener.class, new ViolatedAssumptionAnswer());
      MonitoredOutputStream monitoredOutputStream0 = new MonitoredOutputStream(mockPrintStream0, uploadListener0);
      byte[] byteArray0 = new byte[2];
      monitoredOutputStream0.write(byteArray0, (int) (byte)1, (int) (byte)32);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("DK-Xit^Hs");
      UploadListener uploadListener0 = mock(UploadListener.class, new ViolatedAssumptionAnswer());
      MonitoredOutputStream monitoredOutputStream0 = new MonitoredOutputStream(mockPrintStream0, uploadListener0);
      monitoredOutputStream0.write(1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("$m|(#o", false);
      UploadListener uploadListener0 = mock(UploadListener.class, new ViolatedAssumptionAnswer());
      MonitoredOutputStream monitoredOutputStream0 = new MonitoredOutputStream(mockFileOutputStream0, uploadListener0);
      monitoredOutputStream0.flush();
  }
}
