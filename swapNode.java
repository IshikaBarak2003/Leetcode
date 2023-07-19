class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class LinkedListSwapNodes {
    public ListNode swapNodes(ListNode head, int node1Val, int node2Val) {
        if (head == null || node1Val == node2Val) {
            return head;
        }

        // Find the nodes to be swapped and their previous nodes
        ListNode prevP = null, prevQ = null;
        ListNode p = head, q = head;
        ListNode current = head;
        while (current != null) {
            if (current.val == node1Val) {
                p = current;
                break;
            }
            prevP = current;
            current = current.next;
        }
        current = head;
        while (current != null) {
            if (current.val == node2Val) {
                q = current;
                break;
            }
            prevQ = current;
            current = current.next;
        }

        // If either node1Val or node2Val not found in the list
        if (p == null || q == null) {
            return head;
        }

        // If p and q are not adjacent nodes
        if (prevP != null) {
            prevP.next = q;
        } else {
            head = q;
        }
        if (prevQ != null) {
            prevQ.next = p;
        } else {
            head = p;
        }

        // Swap the next pointers of p and q
        ListNode temp = p.next;
        p.next = q.next;
        q.next = temp;

        return head;
    }

    public static void main(String[] args) {
        LinkedListSwapNodes swapNodes = new LinkedListSwapNodes();

        // Example usage:
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int node1Val = 2;
        int node2Val = 4;

        ListNode result = swapNodes.swapNodes(head, node1Val, node2Val);

        // Output the modified linked list
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
