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
    public ListNode reverseKGroup(ListNode head, int k) {

        if(checkLength(head,k)){
            return head;
        }

        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        int count = 0;

        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
    
        if (next != null) {
            head.next = reverseKGroup(next, k);
        }
        return prev;
    }

    public boolean checkLength(ListNode head,int k){
        ListNode start=head;
        int size=0;
        while(start!=null){
            start=start.next;
            size++;
        }
        return size<k;
    }
}
