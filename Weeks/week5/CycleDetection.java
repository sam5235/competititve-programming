public class CycleDetection {
   class SinglyLinkedListNode {
             int data;
            SinglyLinkedListNode next;
        }
    static boolean hasCycle(SinglyLinkedListNode head) {
        List<SinglyLinkedListNode> node = new ArrayList<>();
      while(head != null){
          node.add(head);
          if(node.contains(head.next)){
              return true;
          }
           head = head.next;
           
       }     
       return false;
         }
}
