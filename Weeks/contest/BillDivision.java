public class BillDivision {
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
            bill.remove(k);
            int sum = 0;
            for(int num : bill){
                sum += num;
            }
            int contr = sum /2;
            if(contr == b){
                System.out.println("Bon Appetit");
            }else System.out.println(b - contr);
    
        }
}
