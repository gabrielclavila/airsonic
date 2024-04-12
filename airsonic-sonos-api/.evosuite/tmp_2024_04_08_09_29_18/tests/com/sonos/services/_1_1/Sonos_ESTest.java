/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 14:31:31 GMT 2024
 */

package com.sonos.services._1_1;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sonos.services._1_1.Sonos;
import java.io.File;
import java.lang.reflect.Proxy;
import java.net.URI;
import java.net.URL;
import java.net.URLStreamHandler;
import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Sonos_ESTest extends Sonos_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Sonos sonos0 = null;
      try {
        sonos0 = new Sonos((WebServiceFeature[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Sonos sonos0 = null;
      try {
        sonos0 = new Sonos(uRL0, (WebServiceFeature[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL0 = MockURL.URL("", "", 3, "<~X", uRLStreamHandler0);
      WebServiceFeature[] webServiceFeatureArray0 = new WebServiceFeature[0];
      Sonos sonos0 = null;
      try {
        sonos0 = new Sonos(uRL0, webServiceFeatureArray0);
        fail("Expecting exception: WebServiceException");
      
      } catch(WebServiceException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockFile mockFile0 = new MockFile("KfHI/n@NUu8qyL(gKh", "X;rE4Y]w~<r<m&l'R");
      URL uRL0 = mockFile0.toURL();
      QName qName0 = Sonos.SERVICE;
      Sonos sonos0 = null;
      try {
        sonos0 = new Sonos(uRL0, qName0, (WebServiceFeature[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      URL uRL0 = Sonos.WSDL_LOCATION;
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL1 = MockURL.URL(uRL0, "V)+ZoH$#", uRLStreamHandler0);
      QName qName0 = new QName("V)+ZoH$#");
      WebServiceFeature[] webServiceFeatureArray0 = new WebServiceFeature[0];
      Sonos sonos0 = null;
      try {
        sonos0 = new Sonos(uRL1, qName0, webServiceFeatureArray0);
        fail("Expecting exception: WebServiceException");
      
      } catch(WebServiceException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      URL uRL0 = Sonos.WSDL_LOCATION;
      QName qName0 = Sonos.SonosSoap;
      Sonos sonos0 = null;
      try {
        sonos0 = new Sonos(uRL0, qName0);
        fail("Expecting exception: WebServiceException");
      
      } catch(WebServiceException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile("smN");
      URL uRL0 = mockFile0.toURL();
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL1 = MockURL.URL(uRL0, "smN", uRLStreamHandler0);
      QName qName0 = new QName("smN", "ir3j\"{Kr");
      Sonos sonos0 = null;
      try {
        sonos0 = new Sonos(uRL1, qName0);
        fail("Expecting exception: WebServiceException");
      
      } catch(WebServiceException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      URL uRL0 = mockFile0.toURL();
      Sonos sonos0 = null;
      try {
        sonos0 = new Sonos(uRL0);
        fail("Expecting exception: WebServiceException");
      
      } catch(WebServiceException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL0 = MockURL.URL("i.tze{", "QTxjZZv8%d,qD}", 0, "i.tze{", uRLStreamHandler0);
      Sonos sonos0 = null;
      try {
        sonos0 = new Sonos(uRL0);
        fail("Expecting exception: WebServiceException");
      
      } catch(WebServiceException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      WebServiceFeature[] webServiceFeatureArray0 = new WebServiceFeature[0];
      Sonos sonos0 = new Sonos(webServiceFeatureArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      URL uRL0 = Sonos.WSDL_LOCATION;
      Sonos sonos0 = new Sonos(uRL0);
      WebServiceFeature[] webServiceFeatureArray0 = new WebServiceFeature[2];
      // Undeclared exception!
      try { 
        sonos0.getSonosSoap(webServiceFeatureArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      URL uRL0 = Sonos.WSDL_LOCATION;
      QName qName0 = Sonos.SERVICE;
      Sonos sonos0 = new Sonos(uRL0, qName0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      WebServiceFeature[] webServiceFeatureArray0 = new WebServiceFeature[0];
      Sonos sonos0 = new Sonos((URL) null, webServiceFeatureArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Sonos sonos0 = new Sonos();
      Proxy proxy0 = (Proxy)sonos0.getSonosSoap((WebServiceFeature[]) null);
      assertNotNull(proxy0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      URL uRL0 = mockFile0.toURL();
      WebServiceFeature[] webServiceFeatureArray0 = new WebServiceFeature[5];
      Sonos sonos0 = null;
      try {
        sonos0 = new Sonos(uRL0, (QName) null, webServiceFeatureArray0);
        fail("Expecting exception: WebServiceException");
      
      } catch(WebServiceException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      URI uRI0 = MockURI.aHttpURI;
      URL uRL0 = MockURI.toURL(uRI0);
      WebServiceFeature[] webServiceFeatureArray0 = new WebServiceFeature[8];
      Sonos sonos0 = null;
      try {
        sonos0 = new Sonos(uRL0, webServiceFeatureArray0);
        fail("Expecting exception: WebServiceException");
      
      } catch(WebServiceException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Sonos sonos0 = new Sonos();
      Proxy proxy0 = (Proxy)sonos0.getSonosSoap();
      assertNotNull(proxy0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      File file0 = MockFile.createTempFile("Sonos", "Sonos");
      URL uRL0 = file0.toURL();
      Sonos sonos0 = null;
      try {
        sonos0 = new Sonos(uRL0);
        fail("Expecting exception: WebServiceException");
      
      } catch(WebServiceException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      WebServiceFeature[] webServiceFeatureArray0 = new WebServiceFeature[9];
      Sonos sonos0 = null;
      try {
        sonos0 = new Sonos(webServiceFeatureArray0);
        fail("Expecting exception: WebServiceException");
      
      } catch(WebServiceException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      URL uRL0 = mockFile0.toURL();
      QName qName0 = Sonos.SonosSoap;
      Sonos sonos0 = null;
      try {
        sonos0 = new Sonos(uRL0, qName0);
        fail("Expecting exception: WebServiceException");
      
      } catch(WebServiceException e) {
      }
  }
}