/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        ListNode rem = head;
        int len = 0;

        if (head.next == null) 
            return null;

        while(curr != null){
            curr = curr.next;
            len++;
        }

        n = len - n;

        if(n == 0){
            head = head.next;
        }
        
        for(int i = 1; i < n; i++){
            rem = rem.next;
        }
        rem.next = rem.next.next;
        
        return head;
        
    }
}