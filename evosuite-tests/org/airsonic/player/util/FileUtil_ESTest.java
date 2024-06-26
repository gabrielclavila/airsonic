/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 20:32:28 GMT 2024
 */

package org.airsonic.player.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Locale;
import org.airsonic.player.util.FileUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileUtil_ESTest extends FileUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockFile mockFile0 = new MockFile("sg*L(X0", "sg*L(X0");
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(mockFileOutputStream0, charsetEncoder0);
      FileUtil.closeQuietly(outputStreamWriter0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      File file0 = MockFile.createTempFile("c<CDHCX-d1.i", "");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(file0);
      Locale locale0 = Locale.ITALY;
      Object[] objectArray0 = new Object[6];
      PrintWriter printWriter0 = mockPrintWriter0.format(locale0, "jdA.yi", objectArray0);
      BufferedWriter bufferedWriter0 = new BufferedWriter(printWriter0, 444);
      FileUtil.closeQuietly(bufferedWriter0);
      long long0 = FileUtil.length(file0);
      assertEquals(6L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockFile mockFile0 = new MockFile("sg*L(X0", "sg*L(X0");
      long long0 = FileUtil.lastModified(mockFile0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      long long0 = FileUtil.lastModified(mockFile0);
      assertEquals(1392409281320L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      boolean boolean0 = FileUtil.isFile(mockFile0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      boolean boolean0 = FileUtil.isDirectory(mockFile0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      String string0 = FileUtil.getShortPath(mockFile0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = FileUtil.exists("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFile mockFile0 = new MockFile("9?#{8<b+>GH`@;6Y'o", "{p;i9(,g0I");
      boolean boolean0 = FileUtil.exists((File) mockFile0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        FileUtil.listFiles((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.airsonic.player.util.FileUtil$6", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        FileUtil.length((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.airsonic.player.util.FileUtil$5", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        FileUtil.isFile((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.airsonic.player.util.FileUtil$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        FileUtil.isDirectory((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.airsonic.player.util.FileUtil$2", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        FileUtil.exists((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        FileUtil.exists((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.airsonic.player.util.FileUtil$3", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FilterOutputStream filterOutputStream0 = new FilterOutputStream((OutputStream) null);
      MockPrintStream mockPrintStream0 = new MockPrintStream(filterOutputStream0);
      // Undeclared exception!
      try { 
        FileUtil.closeQuietly(mockPrintStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      boolean boolean0 = FileUtil.exists((File) mockFile0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileUtil.closeQuietly((Closeable) null);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockFile mockFile0 = new MockFile("3Fspd|7~iaVmm*k}i!Dq");
      File file0 = MockFile.createTempFile("3Fspd|7~iaVmm*k}i!Dq", "3Fspd|7~iaVmm*k}i!Dq", (File) mockFile0);
      String string0 = FileUtil.getShortPath(file0);
      assertEquals("3Fspd|7~iaVmm*k}i!Dq/3Fspd|7~iaVmm*k}i!Dq03Fspd|7~iaVmm*k}i!Dq", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = FileUtil.getShortPath((File) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockFile mockFile0 = new MockFile("3Fspd|7~iaVmm*k}i!Dq");
      MockFile.createTempFile("3Fspd|7~iaVmm*k}i!Dq", "3Fspd|7~iaVmm*k}i!Dq", (File) mockFile0);
      File[] fileArray0 = FileUtil.listFiles(mockFile0);
      assertEquals(1, fileArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockFile mockFile0 = new MockFile("3Fspd|7~iaVmm*k}i!Dq");
      File[] fileArray0 = FileUtil.listFiles(mockFile0);
      assertNotNull(fileArray0);
      assertEquals(0, fileArray0.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      boolean boolean0 = FileUtil.exists("3Fspd|7~iaVmm*k}i!Dq");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockFile mockFile0 = new MockFile("3Fspd|7~iaVmm*k}i!Dq");
      long long0 = FileUtil.length(mockFile0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockFile mockFile0 = new MockFile("3Fspd|7~iaVmm*k}i!Dq");
      boolean boolean0 = FileUtil.isDirectory(mockFile0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockFile mockFile0 = new MockFile("3Fspd|7~iaVmm*k}i!Dq");
      boolean boolean0 = FileUtil.isFile(mockFile0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        FileUtil.lastModified((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.airsonic.player.util.FileUtil$4", e);
      }
  }
}
