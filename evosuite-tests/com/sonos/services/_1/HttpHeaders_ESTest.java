/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 01:20:49 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.HttpHeader;
import com.sonos.services._1.HttpHeaders;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HttpHeaders_ESTest extends HttpHeaders_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HttpHeaders httpHeaders0 = new HttpHeaders();
      LinkedList<HttpHeader> linkedList0 = new LinkedList<HttpHeader>();
      linkedList0.offerLast((HttpHeader) null);
      httpHeaders0.httpHeader = (List<HttpHeader>) linkedList0;
      List<HttpHeader> list0 = httpHeaders0.getHttpHeader();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HttpHeaders httpHeaders0 = new HttpHeaders();
      httpHeaders0.getHttpHeader();
      List<HttpHeader> list0 = httpHeaders0.getHttpHeader();
      assertTrue(list0.isEmpty());
  }
}