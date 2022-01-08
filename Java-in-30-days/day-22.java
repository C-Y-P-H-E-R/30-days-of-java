import java.io.*;
import java.util.*;

public class Solution {
    public void printArrayInt(int []arr) {
        for(int x : arr) {
            System.out.println(x);
        }
    }
    public void printArrayString(String []arr) {
        for(String x : arr) {
            System.out.println(x);
        }
    }
    // public void printArray(E[] generic){
    //         for(E element : generic) {
    //             System.out.println(element); 
    //         }
    // } 
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);

        int x = 2;    
        while(x > 0) {
            int t = Integer.parseInt(sc.nextLine());  
            
            String s = sc.nextLine();
            if(s.matches("\\d+")) {
                int []arr = new int[t];
                arr[0] = Integer.parseInt(s);
                for(int i=1; i<t; i++) {
                    arr[i] = Integer.parseInt(sc.nextLine());
                }        
                sol.printArrayInt(arr);
            } else {
                String []arr = new String[t];
                arr[0] = s;
                for(int i=1; i<t; i++) {
                    arr[i] = sc.nextLine();
                } 
                sol.printArrayString(arr);
            }
            x--;
        }
    }
}
