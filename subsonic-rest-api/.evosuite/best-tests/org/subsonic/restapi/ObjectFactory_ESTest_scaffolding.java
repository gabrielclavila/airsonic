/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Apr 08 15:49:57 GMT 2024
 */

package org.subsonic.restapi;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ObjectFactory_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.subsonic.restapi.ObjectFactory"; 
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
    java.lang.System.setProperty("user.dir", "/home/iartes/Downloads/airsonic-master/subsonic-rest-api"); 
    java.lang.System.setProperty("user.home", "/home/iartes"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "iartes"); 
    java.lang.System.setProperty("user.timezone", "America/Manaus"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ObjectFactory_ESTest_scaffolding.class.getClassLoader() ,
      "org.subsonic.restapi.JukeboxPlaylist",
      "org.subsonic.restapi.VideoConversion",
      "org.subsonic.restapi.License",
      "org.subsonic.restapi.Bookmark",
      "org.subsonic.restapi.ResponseStatus",
      "org.subsonic.restapi.ArtistInfo2",
      "org.subsonic.restapi.IndexID3",
      "org.subsonic.restapi.SearchResult",
      "org.subsonic.restapi.InternetRadioStations",
      "org.subsonic.restapi.SimilarSongs",
      "org.subsonic.restapi.ScanStatus",
      "org.subsonic.restapi.ObjectFactory",
      "org.subsonic.restapi.PodcastEpisode",
      "org.subsonic.restapi.Bookmarks",
      "org.subsonic.restapi.Starred2",
      "org.subsonic.restapi.Child",
      "org.subsonic.restapi.VideoInfo",
      "org.subsonic.restapi.AlbumWithSongsID3",
      "org.subsonic.restapi.Indexes",
      "org.subsonic.restapi.Response",
      "org.subsonic.restapi.Videos",
      "org.subsonic.restapi.SimilarSongs2",
      "org.subsonic.restapi.AlbumID3",
      "org.subsonic.restapi.Users",
      "org.subsonic.restapi.Lyrics",
      "org.subsonic.restapi.MediaType",
      "org.subsonic.restapi.PodcastChannel",
      "org.subsonic.restapi.User",
      "org.subsonic.restapi.Shares",
      "org.subsonic.restapi.Starred",
      "org.subsonic.restapi.Podcasts",
      "org.subsonic.restapi.NowPlayingEntry",
      "org.subsonic.restapi.AudioTrack",
      "org.subsonic.restapi.Index",
      "org.subsonic.restapi.Share",
      "org.subsonic.restapi.ChatMessage",
      "org.subsonic.restapi.MusicFolder",
      "org.subsonic.restapi.AlbumList2",
      "org.subsonic.restapi.PlaylistWithSongs",
      "org.subsonic.restapi.Error",
      "org.subsonic.restapi.InternetRadioStation",
      "org.subsonic.restapi.ChatMessages",
      "org.subsonic.restapi.NowPlaying",
      "org.subsonic.restapi.ArtistWithAlbumsID3",
      "org.subsonic.restapi.TopSongs",
      "org.subsonic.restapi.Playlists",
      "org.subsonic.restapi.AlbumList",
      "org.subsonic.restapi.Songs",
      "org.subsonic.restapi.ArtistID3",
      "org.subsonic.restapi.ArtistInfo",
      "org.subsonic.restapi.Artist",
      "org.subsonic.restapi.NewestPodcasts",
      "org.subsonic.restapi.Playlist",
      "org.subsonic.restapi.ArtistsID3",
      "org.subsonic.restapi.AlbumInfo",
      "org.subsonic.restapi.Genre",
      "org.subsonic.restapi.ArtistInfoBase",
      "org.subsonic.restapi.Captions",
      "org.subsonic.restapi.PodcastStatus",
      "org.subsonic.restapi.PlayQueue",
      "org.subsonic.restapi.Genres",
      "org.subsonic.restapi.MusicFolders",
      "org.subsonic.restapi.SearchResult3",
      "org.subsonic.restapi.JukeboxStatus",
      "org.subsonic.restapi.SearchResult2",
      "org.subsonic.restapi.Directory"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ObjectFactory_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.subsonic.restapi.ObjectFactory",
      "org.subsonic.restapi.Lyrics",
      "org.subsonic.restapi.JukeboxStatus",
      "org.subsonic.restapi.JukeboxPlaylist",
      "org.subsonic.restapi.PlayQueue",
      "org.subsonic.restapi.Genres",
      "org.subsonic.restapi.Videos",
      "org.subsonic.restapi.SearchResult",
      "org.subsonic.restapi.AlbumID3",
      "org.subsonic.restapi.AlbumWithSongsID3",
      "org.subsonic.restapi.Share",
      "org.subsonic.restapi.Captions",
      "org.subsonic.restapi.SimilarSongs2",
      "org.subsonic.restapi.Songs",
      "org.subsonic.restapi.NowPlaying",
      "org.subsonic.restapi.Response",
      "org.subsonic.restapi.MusicFolders",
      "org.subsonic.restapi.SearchResult2",
      "org.subsonic.restapi.Index",
      "org.subsonic.restapi.Shares",
      "org.subsonic.restapi.AlbumList2",
      "org.subsonic.restapi.PodcastChannel",
      "org.subsonic.restapi.InternetRadioStation",
      "org.subsonic.restapi.AudioTrack",
      "org.subsonic.restapi.Error",
      "org.subsonic.restapi.ArtistInfoBase",
      "org.subsonic.restapi.ArtistID3",
      "org.subsonic.restapi.ArtistWithAlbumsID3",
      "org.subsonic.restapi.Bookmarks",
      "org.subsonic.restapi.Artist",
      "org.subsonic.restapi.IndexID3",
      "org.subsonic.restapi.Playlist",
      "org.subsonic.restapi.Starred2",
      "org.subsonic.restapi.InternetRadioStations",
      "org.subsonic.restapi.ScanStatus",
      "org.subsonic.restapi.MusicFolder",
      "org.subsonic.restapi.Directory",
      "org.subsonic.restapi.VideoConversion",
      "org.subsonic.restapi.Playlists",
      "org.subsonic.restapi.Podcasts",
      "org.subsonic.restapi.Genre",
      "org.subsonic.restapi.User",
      "org.subsonic.restapi.Bookmark",
      "org.subsonic.restapi.Child",
      "org.subsonic.restapi.PodcastEpisode",
      "org.subsonic.restapi.ArtistsID3",
      "org.subsonic.restapi.ChatMessages",
      "org.subsonic.restapi.Starred",
      "org.subsonic.restapi.NewestPodcasts",
      "org.subsonic.restapi.AlbumList",
      "org.subsonic.restapi.VideoInfo",
      "org.subsonic.restapi.NowPlayingEntry",
      "org.subsonic.restapi.ArtistInfo2",
      "org.subsonic.restapi.License",
      "org.subsonic.restapi.SimilarSongs",
      "org.subsonic.restapi.ChatMessage",
      "org.subsonic.restapi.SearchResult3",
      "org.subsonic.restapi.Users",
      "org.subsonic.restapi.TopSongs",
      "org.subsonic.restapi.Indexes",
      "org.subsonic.restapi.PlaylistWithSongs",
      "org.subsonic.restapi.AlbumInfo",
      "org.subsonic.restapi.ArtistInfo"
    );
  }
}
