/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Apr 08 14:31:31 GMT 2024
 */

package com.sonos.services._1_1;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class Sonos_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.sonos.services._1_1.Sonos"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "BR"); 
    java.lang.System.setProperty("user.dir", "/home/iartes/Downloads/airsonic-master/airsonic-sonos-api"); 
    java.lang.System.setProperty("user.home", "/home/iartes"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "iartes"); 
    java.lang.System.setProperty("user.timezone", "America/Manaus"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Sonos_ESTest_scaffolding.class.getClassLoader() ,
      "com.sonos.services._1.GetMediaMetadataResponse",
      "com.sonos.services._1.DeleteContainer",
      "com.sonos.services._1.ReportPlaySecondsResult",
      "com.sonos.services._1.GenericAction",
      "com.sonos.services._1.RelatedActions",
      "com.sonos.services._1.MediaUriAction",
      "com.sonos.services._1.ReportAccountActionResponse",
      "com.sonos.services._1.RenameContainerResponse",
      "com.sonos.services._1.RenameContainerResult",
      "com.sonos.services._1.TrackMetadata",
      "com.sonos.services._1.ItemType",
      "com.sonos.services._1.ReorderContainerResponse",
      "com.sonos.services._1.AlbumArtUrl",
      "com.sonos.services._1.GetExtendedMetadata",
      "com.sonos.services._1.GetMediaURI",
      "com.sonos.services._1.DeleteContainerResponse",
      "com.sonos.services._1.LoginToken",
      "com.sonos.services._1.package-info",
      "com.sonos.services._1.MediaCollection",
      "com.sonos.services._1.Context",
      "com.sonos.services._1.GetExtendedMetadataText",
      "com.sonos.services._1.AppLinkInfo",
      "com.sonos.services._1.AddToContainerResponse",
      "com.sonos.services._1.GetContentKeyResponse",
      "com.sonos.services._1.PositionInformation",
      "com.sonos.services._1.GetSessionIdResponse",
      "com.sonos.services._1.GetDeviceAuthTokenResponse",
      "com.sonos.services._1.CreateContainerResponse",
      "com.sonos.services._1.GetMediaMetadata",
      "com.sonos.services._1.GetExtendedMetadataTextResponse",
      "com.sonos.services._1_1.CustomFault",
      "com.sonos.services._1.GetDeviceAuthToken",
      "com.sonos.services._1.DeviceAuthTokenResult",
      "com.sonos.services._1.GetMediaURIResponse",
      "com.sonos.services._1.RemoveFromContainerResponse",
      "com.sonos.services._1.GetStreamingMetadataResponse",
      "com.sonos.services._1.DeleteItemResponse",
      "com.sonos.services._1.DynamicData",
      "com.sonos.services._1.ReportPlayStatusResponse",
      "com.sonos.services._1.DeleteContainerResult",
      "com.sonos.services._1.DeleteItem",
      "com.sonos.services._1.RateItem",
      "com.sonos.services._1.HttpHeaders",
      "com.sonos.services._1.GetDeviceLinkCodeResponse",
      "com.sonos.services._1.ReportPlaySecondsResponse",
      "com.sonos.services._1.EncryptionType",
      "com.sonos.services._1.GetScrollIndicesResponse",
      "com.sonos.services._1.RadioTrackList",
      "com.sonos.services._1.DeviceLinkCodeResult",
      "com.sonos.services._1.ReportAccountAction",
      "com.sonos.services._1.AddToContainer",
      "com.sonos.services._1.GetUserInfoResponse",
      "com.sonos.services._1.OpenUrlAction",
      "com.sonos.services._1.UserInfo",
      "com.sonos.services._1.HttpHeader",
      "com.sonos.services._1.GetScrollIndices",
      "com.sonos.services._1.ReorderContainerResult",
      "com.sonos.services._1.SearchResponse",
      "com.sonos.services._1.RemoveFromContainerResult",
      "com.sonos.services._1.GetLastUpdate",
      "com.sonos.services._1.MediaMetadata",
      "com.sonos.services._1.GetAppLinkResponse",
      "com.sonos.services._1.Credentials",
      "com.sonos.services._1.GetExtendedMetadataResponse",
      "com.sonos.services._1.UserAccountType",
      "com.sonos.services._1.SetPlayedSeconds",
      "com.sonos.services._1.ReorderContainer",
      "com.sonos.services._1.ReportPlayStatus",
      "com.sonos.services._1.CreateItemResponse",
      "com.sonos.services._1.CallToActionInfo",
      "com.sonos.services._1.RateItemAction",
      "com.sonos.services._1_1.Sonos",
      "com.sonos.services._1.StreamMetadata",
      "com.sonos.services._1.BehaviorsData",
      "com.sonos.services._1.Login",
      "com.sonos.services._1.GetUserInfo",
      "com.sonos.services._1.RelatedText",
      "com.sonos.services._1.AbstractMedia",
      "com.sonos.services._1.GetContentKey",
      "com.sonos.services._1.GetMetadataResponse",
      "com.sonos.services._1.RelatedPlay",
      "com.sonos.services._1.CustomFault",
      "com.sonos.services._1.GetStreamingMetadata",
      "com.sonos.services._1.RateItemResponse",
      "com.sonos.services._1.AppLinkResult",
      "com.sonos.services._1.Search",
      "com.sonos.services._1.MediaList",
      "com.sonos.services._1.EncryptionContext",
      "com.sonos.services._1.RelatedBrowse",
      "com.sonos.services._1.CreateContainerResult",
      "com.sonos.services._1.UserAccountStatus",
      "com.sonos.services._1.ObjectFactory",
      "com.sonos.services._1.ActionType",
      "com.sonos.services._1.RefreshAuthTokenResponse",
      "com.sonos.services._1.CreateContainer",
      "com.sonos.services._1.TagsData",
      "com.sonos.services._1.SegmentMetadataList",
      "com.sonos.services._1.RemoveFromContainer",
      "com.sonos.services._1.SegmentMetadata",
      "com.sonos.services._1.RenameContainer",
      "com.sonos.services._1.GetSessionId",
      "com.sonos.services._1.CreateItem",
      "com.sonos.services._1.LastUpdate",
      "com.sonos.services._1.ItemRating",
      "com.sonos.services._1.ReportStatusResponse",
      "com.sonos.services._1_1.SonosSoap",
      "com.sonos.services._1.RefreshAuthToken",
      "com.sonos.services._1.AddToContainerResult",
      "com.sonos.services._1.GetMetadata",
      "com.sonos.services._1.GetLastUpdateResponse",
      "com.sonos.services._1.Property",
      "com.sonos.services._1.ReportStatus",
      "com.sonos.services._1.GetAppLink",
      "com.sonos.services._1.ExtendedMetadata",
      "com.sonos.services._1.GetDeviceLinkCode",
      "com.sonos.services._1.ContentKey",
      "com.sonos.services._1.ReportPlaySeconds",
      "com.sonos.services._1.SetPlayedSecondsResponse",
      "com.sonos.services._1.SimpleHttpRequestAction"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.net.URLStreamHandler", false, Sonos_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Sonos_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.sonos.services._1_1.Sonos",
      "com.sonos.services._1.ItemType",
      "com.sonos.services._1.ActionType",
      "com.sonos.services._1.UserAccountType",
      "com.sonos.services._1.UserAccountStatus",
      "com.sonos.services._1.MediaUriAction",
      "com.sonos.services._1.EncryptionType",
      "com.sonos.services._1.GetMetadata",
      "com.sonos.services._1.Search",
      "com.sonos.services._1.GetExtendedMetadataText",
      "com.sonos.services._1.GetMediaMetadata",
      "com.sonos.services._1.GetExtendedMetadata",
      "com.sonos.services._1.GetSessionId",
      "com.sonos.services._1.RateItem"
    );
  }
}