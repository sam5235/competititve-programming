import java.util.Stack;

public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        Stack<Character> ch = new Stack<>();
        int countK = 0;
        char c;
        ch.push(num.charAt(0));
        if(num.length() == 1){
            return "0";
        }
        for(int i = 1; i < num.length(); i++){
            c = num.charAt(i);
            while(!ch.isEmpty() && countK < k && (ch.peek() - '0') > (c - '0')){
                ch.pop();
                countK++;
            }
            ch.push(c);
        }
      
        if(ch.size() == num.length() || countK < k){
            while(!ch.isEmpty() && countK < k){
                ch.pop();
                countK++;
            }
        }
        
        
        StringBuilder sb = new StringBuilder();
        while(!ch.isEmpty()){
            sb.append(ch.pop());
        }
        
        num = sb.reverse().toString();
        
        for(int i = 0; i < num.length();){
            c = num.charAt(i);
            if(c == '0'){
                i++;
            }else{
               return num.substring(i);
            }
        }
        return"0";
    }
}
