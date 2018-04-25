package edu.luc.cs271.wordcount;

import java.util.*;

public class Main {

  public static void main(final String[] args) throws InterruptedException {

    // set up the scanner so that it separates words based on space and punctuation
    final Scanner input = new Scanner(System.in).useDelimiter("[^\\p{Alnum}]+");

    // TODO complete this main program
    // 1. create a WordCounter instance
      Map<String,Integer> WordMap=new HashMap<String, Integer>();
      WordCounter WC=new WordCounter(WordMap);
    // 2. use this to count the words in the input
      WC.countWords(input);
    // 3. determine the size of the resulting map
      int mapSize=(WC.getCounts()).size();
    // 4. create an ArrayList of that size and
      List<Map.Entry<String,Integer>>MapList=new ArrayList<>(mapSize);
    // 5. store the map's entries in it (these are of type Map.Entry<String, Integer>
      for(Map.Entry<String,Integer>entry:WordMap.entrySet())
          MapList.add(entry);
    // 6. sort the ArrayList in descending order by count
    //    using Collections.sort and an instance of the provided comparator (after fixing the latter)
      Collections.sort(MapList,new DescendingByCount());
    // 7. print the (up to) ten most frequent words in the text
      for(int j=0;j<10;j++)
      {
          System.out.println(MapList.get(j));
      }

  }
}
