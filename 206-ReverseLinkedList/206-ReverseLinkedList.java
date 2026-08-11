// Last updated: 11/08/2026, 18:51:09
class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next; 
            current.next = prev;          
            prev = current;              
            current = next;             
        }
        return prev;
    }
}