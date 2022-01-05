import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s1 = sc.nextLine();
       
       String s2 = s1;
       
       StringBuffer sbr1 = new StringBuffer(s1); 
       StringBuffer sbr2 = new StringBuffer(s2);
       sbr2.reverse();
       
    //    System.out.println(sbr1 + " " + sbr2);
       if(sbr1.toString().equals(sbr2.toString())) {
           System.out.println("The word, " + s1 + ", is a palindrome.");
       } else {
           System.out.println("The word, " + s1 + ", is not a palindrome.");
       }
    }
}
