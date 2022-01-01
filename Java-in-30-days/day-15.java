import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int []arr = new int[n];
        
        int largest = -1;
        int smallest = 101;
        // for(int i=0; i<n ;i++) {
        String s = sc.nextLine();
        String []arr2 = s.split(" ");
            
            
        int []arr3 = new int[arr2.length];    
        for(int i=0; i<arr3.length; i++) {
            arr3[i] = Integer.parseInt(arr2[i]);
            largest = Math.max(largest, arr3[i]);
            smallest = Math.min(smallest, arr3[i]);
        }
        
        System.out.println(largest - smallest);
    }
}
