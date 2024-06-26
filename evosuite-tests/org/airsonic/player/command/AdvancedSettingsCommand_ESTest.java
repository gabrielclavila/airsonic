/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 21:15:06 GMT 2024
 */

package org.airsonic.player.command;

import org.junit.Test;
import static org.junit.Assert.*;
import org.airsonic.player.command.AdvancedSettingsCommand;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AdvancedSettingsCommand_ESTest extends AdvancedSettingsCommand_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      advancedSettingsCommand0.setLdapEnabled(true);
      boolean boolean0 = advancedSettingsCommand0.isLdapEnabled();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      advancedSettingsCommand0.setUploadLimit("F(");
      String string0 = advancedSettingsCommand0.getUploadLimit();
      assertEquals("F(", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      advancedSettingsCommand0.setSmtpUser("po4 aU+&D @,gQ5!A");
      String string0 = advancedSettingsCommand0.getSmtpUser();
      assertEquals("po4 aU+&D @,gQ5!A", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      advancedSettingsCommand0.setSmtpServer("");
      String string0 = advancedSettingsCommand0.getSmtpServer();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      advancedSettingsCommand0.setSmtpPort("");
      String string0 = advancedSettingsCommand0.getSmtpPort();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      advancedSettingsCommand0.setSmtpPassword("cn&f2*6>$J:]-3");
      String string0 = advancedSettingsCommand0.getSmtpPassword();
      assertEquals("cn&f2*6>$J:]-3", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      advancedSettingsCommand0.setSmtpPassword("");
      String string0 = advancedSettingsCommand0.getSmtpPassword();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      advancedSettingsCommand0.setSmtpFrom("*25aT*t5'a");
      String string0 = advancedSettingsCommand0.getSmtpFrom();
      assertEquals("*25aT*t5'a", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      advancedSettingsCommand0.setSmtpFrom("");
      String string0 = advancedSettingsCommand0.getSmtpFrom();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      advancedSettingsCommand0.setSmtpEncryption("0p");
      String string0 = advancedSettingsCommand0.getSmtpEncryption();
      assertEquals("0p", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      advancedSettingsCommand0.setRecaptchaSiteKey("ikw(");
      String string0 = advancedSettingsCommand0.getRecaptchaSiteKey();
      assertEquals("ikw(", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      advancedSettingsCommand0.setRecaptchaSecretKey("7&");
      String string0 = advancedSettingsCommand0.getRecaptchaSecretKey();
      assertEquals("7&", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      advancedSettingsCommand0.setLdapUrl("wDem=d+");
      String string0 = advancedSettingsCommand0.getLdapUrl();
      assertEquals("wDem=d+", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      advancedSettingsCommand0.setLdapUrl("");
      String string0 = advancedSettingsCommand0.getLdapUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      advancedSettingsCommand0.setLdapSearchFilter("iv.0WzJR>ma}8l");
      String string0 = advancedSettingsCommand0.getLdapSearchFilter();
      assertEquals("iv.0WzJR>ma}8l", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      advancedSettingsCommand0.setLdapSearchFilter("");
      String string0 = advancedSettingsCommand0.getLdapSearchFilter();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      advancedSettingsCommand0.setLdapManagerPassword("wl4:EP7d\"3xcUq9W;y");
      String string0 = advancedSettingsCommand0.getLdapManagerPassword();
      assertEquals("wl4:EP7d\"3xcUq9W;y", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      advancedSettingsCommand0.setLdapManagerDn("sf`b");
      String string0 = advancedSettingsCommand0.getLdapManagerDn();
      assertEquals("sf`b", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      advancedSettingsCommand0.setLdapManagerDn("");
      String string0 = advancedSettingsCommand0.getLdapManagerDn();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      advancedSettingsCommand0.setDownloadLimit("it^]7membn");
      String string0 = advancedSettingsCommand0.getDownloadLimit();
      assertEquals("it^]7membn", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      advancedSettingsCommand0.setDownloadLimit("");
      String string0 = advancedSettingsCommand0.getDownloadLimit();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      advancedSettingsCommand0.setBrand("8f]c;");
      String string0 = advancedSettingsCommand0.getBrand();
      assertEquals("8f]c;", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      String string0 = advancedSettingsCommand0.getSmtpEncryption();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      boolean boolean0 = advancedSettingsCommand0.isLdapAutoShadowing();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      advancedSettingsCommand0.setReloadNeeded(true);
      assertNull(advancedSettingsCommand0.getRecaptchaSecretKey());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      String string0 = advancedSettingsCommand0.getLdapSearchFilter();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      advancedSettingsCommand0.setCaptchaEnabled(true);
      boolean boolean0 = advancedSettingsCommand0.isCaptchaEnabled();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      String string0 = advancedSettingsCommand0.getBrand();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      String string0 = advancedSettingsCommand0.getSmtpFrom();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      String string0 = advancedSettingsCommand0.getRecaptchaSecretKey();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      advancedSettingsCommand0.setRecaptchaSiteKey("");
      String string0 = advancedSettingsCommand0.getRecaptchaSiteKey();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      String string0 = advancedSettingsCommand0.getRecaptchaSiteKey();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      String string0 = advancedSettingsCommand0.getUploadLimit();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      String string0 = advancedSettingsCommand0.getLdapUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      advancedSettingsCommand0.setSmtpUser("");
      String string0 = advancedSettingsCommand0.getSmtpUser();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      advancedSettingsCommand0.setLdapAutoShadowing(true);
      boolean boolean0 = advancedSettingsCommand0.isLdapAutoShadowing();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      advancedSettingsCommand0.setLdapManagerPassword("");
      String string0 = advancedSettingsCommand0.getLdapManagerPassword();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      String string0 = advancedSettingsCommand0.getLdapManagerDn();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      String string0 = advancedSettingsCommand0.getSmtpUser();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      advancedSettingsCommand0.setRecaptchaSecretKey("");
      String string0 = advancedSettingsCommand0.getRecaptchaSecretKey();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      String string0 = advancedSettingsCommand0.getLdapManagerPassword();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      advancedSettingsCommand0.setSmtpPort("");
      String string0 = advancedSettingsCommand0.getSmtpPort();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      String string0 = advancedSettingsCommand0.getSmtpServer();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      String string0 = advancedSettingsCommand0.getDownloadLimit();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      advancedSettingsCommand0.setSmtpEncryption("");
      String string0 = advancedSettingsCommand0.getSmtpEncryption();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      boolean boolean0 = advancedSettingsCommand0.isCaptchaEnabled();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      boolean boolean0 = advancedSettingsCommand0.isLdapEnabled();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      advancedSettingsCommand0.setSmtpServer("m");
      String string0 = advancedSettingsCommand0.getSmtpServer();
      assertEquals("m", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      advancedSettingsCommand0.setUploadLimit("");
      String string0 = advancedSettingsCommand0.getUploadLimit();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      advancedSettingsCommand0.setBrand("");
      String string0 = advancedSettingsCommand0.getBrand();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      String string0 = advancedSettingsCommand0.getSmtpPort();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      AdvancedSettingsCommand advancedSettingsCommand0 = new AdvancedSettingsCommand();
      String string0 = advancedSettingsCommand0.getSmtpPassword();
      assertNull(string0);
  }
}
