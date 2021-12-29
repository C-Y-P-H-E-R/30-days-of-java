import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        String []arr = s.split(" ");
        
        int id = Integer.parseInt(arr[2]);
        int d = Integer.parseInt(sc.nextLine());
        String s2 = sc.nextLine();
        String []arr2 = s2.split(" ");
        int cnt = 0;
        
        for(String ss : arr2) {
            cnt++;
        }
        
        int []arr3 = new int[cnt];
        
        int i=0;
        
        for(String x: arr2) {
            arr3[i] = Integer.parseInt(x);            
            i++;
        }
        
        System.out.println("Name: "+arr[1] + ", " + arr[0]);
        System.out.println("ID: " + id);
        
        int sum = 0;
        
        for(int x: arr3) {
            sum += x;
            // cnt++;   
            // System.out.println(x);
        }
        
        double avg = (double)sum / cnt;
        
        // System.out.println(avg);
        if(avg <= 100 && avg >= 90) {
            System.out.println("Grade: O");
        } else if(avg < 90 && avg >= 80) {
            System.out.println("Grade: E");
        } else if(avg < 80 && avg >= 70) {
            System.out.println("Grade: A");
        } else if(avg < 70 && avg >= 55) {
            System.out.println("Grade: P");
        }  else if(avg < 55 && avg >= 40) {
            System.out.println("Grade: D");
        }  else if(avg < 40) {
            System.out.println("Grade: T");
        }
    }
}
