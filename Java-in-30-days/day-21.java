import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        // Write your code here
        // for(int el : a) {
        //     System.out.print(el + " ");
        // }
        
        int totalSwaps = 0;
        
        for(int i=0; i<n; i++) {
            int swaps = 0;
            for(int j=0; j<n-1; j++) {
                if(a.get(j) > a.get(j+1)) {
                    // swap(a.get(j), a.get(j+1));
                    int temp = a.get(j);
                    a.set(j, a.get(j+1));
                    a.set(j+1, temp);
                    swaps++;
                }
            }
            totalSwaps += swaps;
            if(swaps == 0) {
                break;
            }
        }
        
        System.out.println("Array is sorted in " + totalSwaps + " swaps.");
        System.out.println("First Element: "+a.get(0));
        System.out.println("Last Element: "+a.get(n-1));
        bufferedReader.close(); 
    }
}
