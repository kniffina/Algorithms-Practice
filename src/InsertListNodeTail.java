public class InsertListNodeTail {

    public ListNode insertAtTail(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        if(head == null) {
            head = newNode;
        }
        else {
            ListNode curr = head;
            while(curr.next != null) {
                curr = curr.next;
            }
            //insert new node at end
            curr.next = newNode;

        }
        return head;
    }
}
