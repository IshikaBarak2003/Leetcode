class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp1= head;
        int count = 1;
        while(count != k){
            temp1 = temp1.next;
            count++;
        }
        ListNode first = temp1;
        ListNode second = head;
        while(temp1.next != null){
            temp1 = temp1.next;
            second = second.next;
        }
        int temp = first.val;
        first.val = second.val;
        second.val = temp;

        return head;
    }
}