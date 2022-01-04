import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        
        // String str = "n and p should be non-negative";
        
        while(t > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            try {
                if(a < 0 || b < 0) throw new Exception("n and p should be non-negative");
                System.out.println((int)Math.pow(a,b));
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
            // System.out.println(a + " " + b);
            t = t - 1;
        }
    }
}
