import java.util.ArrayList;
import java.util.List;

public class SortingTheSentence {

        public String sortSentence(String s) {
            String [] sentence = new String[9];
            char [] ch = new char [s.length()];
            for (int i = 0; i < s.length(); i++){
                ch[i] = s.charAt(i);
            }
            System.out.println(ch);
            
            List<Character> words = new ArrayList<>();
           
            int index = 0;
            
            
            for (int i = 0; i < ch.length; i++){
                int temp  = i - 1;
                int temp2 = i - 2;
                if(ch[i] == ' ' || ch[i]==ch[ch.length-1]){
                    if(ch[i] == ch[ch.length-1]){
                        temp = i;
                        temp2 = i - 1;
                    }
                    for(int j = index; j <= temp2;j++){
                         words.add(ch[j]);
                        
                    }
                    int num = Character.getNumericValue(ch[temp]);
                    System.out.println("Num: " + num + " , char : "+ ch[temp]);
                
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
        return listString;
    }
    public String convertListOfStringToStr(List<Character> chars){
        StringBuilder sb = new StringBuilder();
        for(char c : chars){
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
