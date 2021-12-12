import java.util.ArrayList;
import java.util.List;

public class SortingTheSentence {

        public String sortSentence(String s) {
            String [] sentence = new String[9];
            char [] ch = new char [s.length()];
            for (int i = 0; i < s.length(); i++){
                ch[i] = s.charAt(i);
            }
          //  System.out.println(ch);
            
            List<Character> words = new ArrayList<>();
           
            int index = 0;
            
            
            for (int i = 0; i < ch.length; i++){
                int temp  = i - 1; // added 
                if(ch[i] == ' ' || ch[i]==ch[ch.length-1]){
                    // added 
                    if(ch[i] == ch[ch.length-1]){
                        temp = i;
                    }
                    for(int j = index; j <= i;j++){
                        //added only the if branch
                        if(ch[j] == ' '){
                            continue;
                        }
                         words.add(ch[j]);
                        
                    }
                    int num = Character.getNumericValue(ch[temp]);
                   // System.out.println("Num: " + num + " , char : "+ ch[temp]);
                
                    sentence[num-1] = convertListOfStringToStr(words);//
                    System.out.println(words);
                    words.clear();
                    
                    index = i +1;
                
    
                }
                            
    
    }
        String listString = "";
        for (String str :sentence)
        {   if(str == null){break;}
            listString += str;
        }
        return listString.trim();
    }
    public String convertListOfStringToStr(List<Character> chars){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < chars.size(); i++){
            char c = chars.get(i);
            if(Character.isDigit(c)){
                c  = ' ';
            }
            sb.append(c);
        }
        return sb.toString(); // todo 
    }
    
    public static void main(String[] args){
        SortingTheSentence sortingTheSentence = new SortingTheSentence();
        String s = "Myself2 Me1 I4 and3";
        String sortedSentence  = sortingTheSentence.sortSentence(s);
        System.out.println("SortedSentence: " + sortedSentence);
    }
    
}
