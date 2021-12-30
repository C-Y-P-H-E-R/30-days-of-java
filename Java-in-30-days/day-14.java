import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        String []arr = s.split(" ");
        String s2 = sc.nextLine();
        String []arr2 = s2.split(" ");
        
        int price = Integer.parseInt(sc.nextLine());
        
        System.out.print("Title: ");
        for(String x : arr) {
            System.out.print(x + " ");
        }
        System.out.print("\n");
        System.out.print("Author: ");
        for(String x : arr2) {
            System.out.print(x + " ");
        }
        System.out.print("\n");
        System.out.println("Price: " + price);
    }
}
