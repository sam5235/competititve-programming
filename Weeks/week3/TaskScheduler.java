import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;



public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        int[] freqs = new int[26];
        for (char c : tasks) {
            freqs[c - 'A']++;
        }
        PriorityQueue<Task> pq = new PriorityQueue<>(26, new TaskComp());
        for (int f : freqs) {
            if(f!=0){
                pq.add(new Task(f));
            }
           
        }
        System.out.println(pq);

        Queue<Task> coolDown = new LinkedList<>();
        int time = 0;
        System.out.println("innnn");
        while(!(pq.isEmpty()&&coolDown.isEmpty())){
            if(!coolDown.isEmpty() && time == coolDown.peek().coolDown ){
                pq.add(coolDown.poll());
            }
            else if (pq.isEmpty()&& !coolDown.isEmpty()){
                System.out.println(coolDown +" : " + time);
                time++;
                System.out.println("idle");
            }
            if(!pq.isEmpty()){
                Task temp = pq.poll();
                temp.freq--;
                if(temp.freq>=1){
                    temp.coolDown = time + (1+n);
                    coolDown.add(temp);
                }
                time++;
            }
            
           

        }
    
        return time; 
    }

     public static void main(String[] args) {
         TaskScheduler t = new TaskScheduler();
         char[] tasks = {'A','A','A','A','A','A','B','C','D','E','F','G'};
         int n = 2;
         System.out.println(t.leastInterval(tasks, n));
     
        
    }
}

class Task {

    int freq;
    int coolDown;

    Task(int f) {
        freq = f;
    }
    public String toString(){
        return "(" + freq + ","+ coolDown +")" ;
    }
}

class TaskComp implements Comparator<Task> {
    public int compare(Task a, Task b) {
        return b.freq - a.freq;
    }

}
