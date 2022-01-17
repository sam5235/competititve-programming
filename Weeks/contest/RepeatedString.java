public class RepeatedString {
    public static long repeatedString(String s, long n) {
        // Write your code here
            char c;
            int numa = 0;
            long ans = 0;
            for(int i = 0; i < s.length(); i++){
                c = s.charAt(i);
                if(c == 'a'){
                    numa++;
                }
            }
            
            
            if(n % s.length() != 0){
                long remain = n % s.length();
                int a = 0;
               for(int i = 0; i < remain; i++){
                 c = s.charAt(i);
                 if(c == 'a'){
                    a++;
                }
            }
                ans = (n / s.length())* numa + a;
            }else  ans = (n / s.length()) * numa;
            
            return ans;
        }
    
}
