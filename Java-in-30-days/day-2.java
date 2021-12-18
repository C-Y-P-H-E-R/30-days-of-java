import java.io.*;
import java.util.*;

// inputting string after int or double generally leaves the strign variable empty.
// workarounds
// 1) either use this way
//      int i = sc.nextInt();
//      sc.nextLine();
//      String str = sc.nextLine();

// 2) using parseInt,parseDouble methods.
//      int v1 = Integer.parseInt(sc.nextLine());
//      double d1 = Double.parseDouble(sc.nextLine());

// we should use print() method to print in case of int and double values.

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int v1 = Integer.parseInt(sc.nextLine());
        double d1 = Double.parseDouble(sc.nextLine());
        String ss = sc.nextLine();
        
        System.out.print(v1 + 4 + "\n");
        System.out.print(d1 + 4.0 + "\n");
        System.out.println("HackerRank " + ss);
    }
}
