class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode next1 = curr.next;
        while(curr != null){
            curr.next = prev;
            prev = curr;
            curr = next1;
            if(next1 != null){
                next1 = curr.next;
            }
        }
        head = prev;
        return head;
        
    }
}
