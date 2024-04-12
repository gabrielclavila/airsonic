/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 14:26:42 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.SegmentMetadata;
import com.sonos.services._1.SegmentMetadataList;
import java.util.LinkedList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SegmentMetadataList_ESTest extends SegmentMetadataList_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SegmentMetadataList segmentMetadataList0 = new SegmentMetadataList();
      LinkedList<SegmentMetadata> linkedList0 = new LinkedList<SegmentMetadata>();
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      linkedList0.add(segmentMetadata0);
      segmentMetadataList0.segmentMetadata = (List<SegmentMetadata>) linkedList0;
      List<SegmentMetadata> list0 = segmentMetadataList0.getSegmentMetadata();
      assertTrue(list0.contains(segmentMetadata0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SegmentMetadataList segmentMetadataList0 = new SegmentMetadataList();
      Integer integer0 = new Integer(0);
      segmentMetadataList0.duration = integer0;
      Integer integer1 = segmentMetadataList0.getDuration();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SegmentMetadataList segmentMetadataList0 = new SegmentMetadataList();
      Integer integer0 = new Integer((-175));
      segmentMetadataList0.setDuration(integer0);
      Integer integer1 = segmentMetadataList0.getDuration();
      assertEquals((-175), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SegmentMetadataList segmentMetadataList0 = new SegmentMetadataList();
      Integer integer0 = new Integer(1978);
      segmentMetadataList0.setDuration(integer0);
      Integer integer1 = segmentMetadataList0.getDuration();
      assertEquals(1978, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SegmentMetadataList segmentMetadataList0 = new SegmentMetadataList();
      segmentMetadataList0.getSegmentMetadata();
      List<SegmentMetadata> list0 = segmentMetadataList0.getSegmentMetadata();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SegmentMetadataList segmentMetadataList0 = new SegmentMetadataList();
      Integer integer0 = segmentMetadataList0.getDuration();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SegmentMetadataList segmentMetadataList0 = new SegmentMetadataList();
      XMLGregorianCalendar xMLGregorianCalendar0 = segmentMetadataList0.getStartTime();
      assertNull(xMLGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SegmentMetadataList segmentMetadataList0 = new SegmentMetadataList();
      segmentMetadataList0.setStartTime((XMLGregorianCalendar) null);
      assertNull(segmentMetadataList0.getDuration());
  }
}
