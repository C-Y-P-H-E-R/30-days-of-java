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
    
    // How to calculate sum of a hourglass :
    // 1) sumOfHourglass = sum of diag1 + sum of diag2 + top-center element + bottom-center element
    // 2) all the centers of hourglasses lie in the [1...rows...size-1][1...colums...size-1] matrix.
    // traversing a 2D arraylist, quite similar to 2D vectors in c++ , [] operator does not work
    // use get() method to fetch value.
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        int finalSum = -1000;
        for(int i=1; i<arr.size()-1; i++) {
            int sum = 0;
            for(int j=1; j<arr.get(i).size()-1; j++) {
                int sumd1 = arr.get(i).get(j) + arr.get(i-1).get(j-1) + arr.get(i+1).get(j+1);
                int sumd2 = arr.get(i+1).get(j-1) + arr.get(i-1).get(j+1);
                sum = sumd1 + sumd2 + arr.get(i-1).get(j) + arr.get(i+1).get(j);
                // System.out.println(sum);
                finalSum = Math.max(finalSum, sum);
            } 
        }
        
        System.out.println(finalSum);

        bufferedReader.close();
    }
}
