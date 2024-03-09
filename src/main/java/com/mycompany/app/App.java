package com.mycompany.app;
import java.util.ArrayList;
import java.util.Random;

/**
 * 
The repository must satisfy the following criteria:
It must contain an App.java file which has a simple static method implementation:
The method should accept at least 4 parameters.
At least two of these parameters must be
Integer [ ] or
ArrayList<Integer>.
The method should perform a meaningful computation on the set of strings and return a result.
 *
 */


//take a lsit of integers, a string, and then from the other side take a single intteger and a single character 
//and check the frequency of occurrences of the single int and char 


public class App 
{

 public static String search(ArrayList<Integer> array, String str, int e, char c) {

        System.out.println("inside search");
        if (array == null) return "null integer list";
        if (str==null) return "empty string";
  
        //String intresult = "";
        int intfreq = 0;
        int charfreq=0;
       // String strresult = "";
        
        for (int elt : array) {
          if (elt == e) intfreq++;
        }
        str=str.toLowerCase();
        for (int i =0; i<str.length(); i++) {
        	if (str.charAt(i)==c) {
        		charfreq++;
        	}
        }
        
        
        return "frequency of the character "+c+" : "+charfreq+"\nfrquency of the int "+e+" : "+intfreq;
        
        
      }


public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(1);numbers.add(2);numbers.add(3);numbers.add(4);numbers.add(5);
    numbers.add(1);numbers.add(2);numbers.add(3);numbers.add(1);
    String text = "Hello World!";
    int numberToSearch = 1;
    char charToSearch = 'o';

    String result = search(numbers, text, numberToSearch, charToSearch);
    System.out.println(result);
}
}
