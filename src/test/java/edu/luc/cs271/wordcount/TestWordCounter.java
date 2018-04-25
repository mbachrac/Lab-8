package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class TestWordCounter {

  // TODO complete this test class

  // TODO declare a reference to the SUT (system under test), i.e., WordCounter
  private WordCounter fixture,fixture2;
    private Map<String,Integer> TestMap=new HashMap<>();
   // private Map<String,Integer> TestMap2=new HashMap<>();

  @Before
  public void setUp() {
    // TODO create the SUT instance
    fixture=new WordCounter(TestMap);
    //fixture2=new WordCounter(TestMap2);
  }

  @After
  public void tearDown() {
    // TODO set the SUT instance to null
      fixture=null;
     // fixture2=null;
  }

  @Test
  public void testGetCountEmpty() {
    // TODO verify that the SUT initially returns an empty map
      assertTrue(TestMap.isEmpty());
    //fail();

  }

  @Test
  public void testGetCountNonEmpty() {
      // TODO run the SUT on a specific String iterator with some repeated words,
      // then use assertions to verify the correct counts
      // do this for at least two words in the iterator and two not in the iterator
      List<String> myList = new LinkedList<>();
      myList.add("there");
      myList.add("are");
      myList.add("you");
      myList.add("hello");
      myList.add("today");
      myList.add("hello");
      myList.add("how");
      myList.add("you");
      myList.add("are");
      myList.add("you");
      myList.add("today");
      myList.add("are");
      myList.add("how");
      myList.add("hello");
      myList.add("you");
      ListIterator<String> myIter = myList.listIterator();
      fixture.countWords(myIter);
      assertEquals(3, fixture.getCount("hello"));
      assertEquals(4, fixture.getCount("you"));
      assertEquals(1, fixture.getCount("there"));
      List<String> myList2 = new LinkedList<>();
      myList2.add("there");
      myList2.add("are");
      myList2.add("you");
      myList2.add("hello");
      myList2.add("today");
      myList2.add("hello");
      myList2.add("how");
      myList2.add("you");
      myList2.add("are");
      myList2.add("you");
      ListIterator<String> myIter2 = myList2.listIterator();
      fixture.countWords(myIter2);
      //these are my tests that I did to see if I could call countWords for two iterators.
      //assertEquals(2, fixture.getCount("hello"));
      //assertEquals(3, fixture.getCount("you"));
      //assertEquals(1, fixture.getCount("there"));
  }
     @Test (expected=NullPointerException.class)
     public void anotherTest(){
        assertEquals(0,fixture.getCount("yesterday"));
        assertNotSame(5,fixture.getCount("mother"));
      //fail();

  }
}
