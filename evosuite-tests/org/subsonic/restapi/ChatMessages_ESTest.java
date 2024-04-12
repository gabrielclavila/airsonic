/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 11 00:50:12 GMT 2024
 */

package org.subsonic.restapi;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.subsonic.restapi.ChatMessage;
import org.subsonic.restapi.ChatMessages;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ChatMessages_ESTest extends ChatMessages_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ChatMessages chatMessages0 = new ChatMessages();
      LinkedList<ChatMessage> linkedList0 = new LinkedList<ChatMessage>();
      chatMessages0.chatMessage = (List<ChatMessage>) linkedList0;
      ChatMessage chatMessage0 = new ChatMessage();
      linkedList0.add(chatMessage0);
      List<ChatMessage> list0 = chatMessages0.getChatMessage();
      assertTrue(list0.contains(chatMessage0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ChatMessages chatMessages0 = new ChatMessages();
      chatMessages0.getChatMessage();
      List<ChatMessage> list0 = chatMessages0.getChatMessage();
      assertTrue(list0.isEmpty());
  }
}