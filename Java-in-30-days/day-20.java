import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        
        int sum = 0;
        for(int i=2; i<=n; i++) {
            if(n % i == 0) sum += i; 
        }
        
        sum += 1;
        
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(sum);
    }
}
