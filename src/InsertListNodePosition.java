public class InsertListNodePosition {

    public static ListNode insertAtPosition(ListNode head, int data, int pos) {
        ListNode newNode = new ListNode(data);
        if(head == null) return newNode;
        else if(pos == 1) {
            newNode.next = head;
            return newNode;
        }
        else {
            ListNode curr = head;
            ListNode prev = curr;
            int count = 1;

            while(curr != null) {
                if(count == pos) {
                    break;
                }
                prev = curr;
                curr = curr.next;
                count++;
            }
            prev.next = newNode;
            newNode.next = curr;
        }

        return head;
    }
}
