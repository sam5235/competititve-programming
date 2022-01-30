public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int sz = 0;
        int check = 1;
        while(temp != null){
            sz++;
            temp = temp.next;
        }
        if(n == sz){
            return head.next;
        }
        temp = head;
        while(temp.next != null){
            check++;
            if(check == (sz -n + 1)){
                temp.next = temp.next.next;
                return head;
            }else temp = temp.next; 
        }
        return head;
    }
}
