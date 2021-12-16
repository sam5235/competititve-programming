import java.util.List;

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
         
        int temp = 0;
        for (int i = 0; i <= grades.size()-1; i++){
            if( grades.get(i) >= 38){
                if((grades.get(i) + 2) % 5 == 0){
                    temp = grades.get(i) + 2;
                     grades.set(i, temp);
                }
                if((grades.get(i) + 1) % 5 == 0){
                     temp = grades.get(i) + 1;
                     grades.set(i, temp);            }
            
            }
            
        }
        return grades;
        }


        
}
