import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        
        int []arr = new int[t];
        
        for(int i=0; i<t; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
            System.out.print(arr[i] + " ");
        }
    }
}
