/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 01:24:14 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.ContentKey;
import com.sonos.services._1.EncryptionContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ContentKey_ESTest extends ContentKey_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ContentKey contentKey0 = new ContentKey();
      contentKey0.setUri("5];d|");
      String string0 = contentKey0.getUri();
      assertEquals("5];d|", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ContentKey contentKey0 = new ContentKey();
      contentKey0.deviceSessionToken = "";
      String string0 = contentKey0.getDeviceSessionToken();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ContentKey contentKey0 = new ContentKey();
      EncryptionContext encryptionContext0 = contentKey0.getContentKey();
      assertNull(encryptionContext0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ContentKey contentKey0 = new ContentKey();
      EncryptionContext encryptionContext0 = new EncryptionContext();
      contentKey0.setContentKey(encryptionContext0);
      EncryptionContext encryptionContext1 = contentKey0.getContentKey();
      assertSame(encryptionContext1, encryptionContext0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ContentKey contentKey0 = new ContentKey();
      contentKey0.setUri("");
      String string0 = contentKey0.getUri();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ContentKey contentKey0 = new ContentKey();
      String string0 = contentKey0.getUri();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ContentKey contentKey0 = new ContentKey();
      EncryptionContext encryptionContext0 = new EncryptionContext();
      contentKey0.setDeviceSessionKey(encryptionContext0);
      EncryptionContext encryptionContext1 = contentKey0.getDeviceSessionKey();
      assertSame(encryptionContext1, encryptionContext0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ContentKey contentKey0 = new ContentKey();
      EncryptionContext encryptionContext0 = contentKey0.getDeviceSessionKey();
      assertNull(encryptionContext0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ContentKey contentKey0 = new ContentKey();
      contentKey0.setDeviceSessionToken("Ff,lP");
      String string0 = contentKey0.getDeviceSessionToken();
      assertEquals("Ff,lP", string0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ContentKey contentKey0 = new ContentKey();
      String string0 = contentKey0.getDeviceSessionToken();
      assertNull(string0);
  }
}