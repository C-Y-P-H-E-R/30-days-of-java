public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        // List is defined the following way.
        // reverse function comes from Collections class.
        // the for-each loop is same as in c++
      
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
            
        Collections.reverse(arr);
        for(Integer i : arr) {
            System.out.print(i + " ");
        }
        bufferedReader.close();
    }
}
