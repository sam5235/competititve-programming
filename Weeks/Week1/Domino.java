import java.util.*;

public class Domino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String line = sc.nextLine();
         String [] data= line.split(" ");
         int M = Integer.parseInt(data[0]);
         int N = Integer.parseInt(data[1]);
          int dominos = (M * N)/2;
          System.out.println(dominos);
          sc.close();
    }
}

