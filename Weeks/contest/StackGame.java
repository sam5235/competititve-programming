public class StackGame {
    int sum = 0;
    int c = 0;
while(sum < maxSum){
 
    if(a.get(0) <b.get(0)){
        sum += a.remove(0); 
        if(sum < maxSum){
            c++; 
        }
       
    }else {
        sum += b.remove(0);
        if(sum < maxSum){
            c++; 
        }
    }

}
return c;

}
