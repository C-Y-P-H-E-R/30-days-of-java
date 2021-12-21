import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        class Person {
                int age;
                Person(int initialAge) {
                    if(initialAge >= 0) {
                        this.age = initialAge;
                    } else {
                        this.age = 0;
                        System.out.println("Age is not valid, setting age to 0.");
                    }
                }
                
                public void yearPasses() {
                    this.age++;
                }
                
                public void amIOld() {
                    if(this.age < 13) {
                        System.out.println("You are young.");
                    } else if(this.age >= 13 && this.age < 18) {
                        System.out.println("You are a teenager.");
                    } else {
                        System.out.println("You are old.");
                    }
                }
        }
        
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        
        while(t > 0) {
            int n = Integer.parseInt(sc.nextLine());
            Person ob = new Person(n);
            
            ob.amIOld();
            ob.yearPasses();
            ob.yearPasses();
            ob.yearPasses();
            
            ob.amIOld();
            t = t - 1;
            
            
            if(t != 0) {
            // System.out.print(t);
            System.out.print("\n");
            }
        }
        // System.out.println("\n");
    }
}
