public class Solution {
    // while loop used to find out binary form of a number
    // [] -> does not work with strings or StringBuilder in java, use charAt() method.
    // use of try and catch and knowledge of exceptions in java is a must.( StringIndexOutOfBoundException )
    // The max, min and round functions can be called easily using Math library.
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        
        int temp = n;
        String s = "";
        
        while(n > 0) {
            int rem = n % 2;
            if(rem  == 1) {
                s += '1';
            } else {
                s += '0';
            }
            n = n / 2;
        }
        
        int ans = -1;
        for(int i=s.length()-1; i>=0; i--) {
            if(s.charAt(i) == '1') {
                int j = i;
                int cnt = 0;
                try {
                    while(s.charAt(j) == '1') {
                        cnt++;
                        j--;
                    }
                } catch(StringIndexOutOfBoundsException error) {
                    ans = Math.max(ans,cnt);
                    break;
                }
                ans = Math.max(ans, cnt);
                i = j;
            }
        }
        
        System.out.println(ans);

        bufferedReader.close();
    }
}
