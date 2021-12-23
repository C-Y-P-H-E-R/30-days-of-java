import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        // int t = Integer.parseInt(bufferedreader.readLine());
        
        
        while(t > 0) {
            // String s = bufferedreader.readLine();
            String s = sc.nextLine();
            String even = "", odd = "";
            for(int i=0; i<s.length(); i++) {
                if(i % 2 == 0) {
                    even = even + s.charAt(i);
                } else {
                    odd = odd + s.charAt(i);
                }
            }
            System.out.println(even + " " + odd);
            t = t - 1;
        }        
        
        // bufferedreader.close();
    }
}
