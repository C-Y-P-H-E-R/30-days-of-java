public class Solution {
    
    //try-catch exceptions (NoSuchElementException - when reading and get an empty line instance)
    // hashmaps
    // declaration: HashMap<dtypeClass1, dtypeClass2> hm = new HashMap<dtype1,dtype2>();
    // methods:
    // 1) containsKey(k) => checks if there is a key 'k' present in the hashmap
    // 2) get(k) => fetches the value associated to the key 'k'
    // 3) put(data) => inserts 'data' to the hashmap
    // 4) long data type is primitive and can be accessed just like int 

    public static void main(String[] args) {
        HashMap<String, Long> hm = new HashMap<String, Long>();
        Scanner sc = new Scanner(System.in);
        int t;
        t = Integer.parseInt(sc.nextLine());

            String s;

            for(int i=0; i<t; i++) {
                s = sc.nextLine();
                String []rawData = s.split(" ");
                s = rawData[0];
                long num = Long.parseLong(rawData[1]);
                hm.put(s, num);
            }

            while(true) {
                try {
                    String str = sc.nextLine();
                    if(str.length() == 0) {
                        break;
                    } 
                    if(hm.containsKey(str) == false) {
                        System.out.println("Not found");
                    } else {
                        System.out.print(str + "=");
                        System.out.print(hm.get(str)+"\n");
                    }
                } catch(NoSuchElementException error) {
                    return;
                }
            }
    }
}
