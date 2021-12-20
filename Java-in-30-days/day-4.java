public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // another way of taking input
        // Java BufferedReader class is used to read the text from a character-based input stream.
        // It makes the performance fast.
        
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        if(N % 2 != 0) {
            System.out.println("Weird");
        } else {
            if(N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            } else if(N >= 6 && N <= 20) {
                System.out.println("Weird");
            } else if(N > 20) {
                System.out.println("Not Weird");
            }
        }
        
        bufferedReader.close();
    }
}
