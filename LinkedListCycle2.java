public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;
        
        
        ListNode slow=head;
        ListNode fast=head;
        boolean flag=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                flag=true;
                break;
            }
        }
        
        if(!flag) return null;
        
        fast=head;
        
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        
        return fast;
    }
}