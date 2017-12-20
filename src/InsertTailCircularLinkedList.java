public class InsertTailCircularLinkedList {

    public ListNode insertAtTail(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = newNode;

        if(head == null) return newNode;
        if(head.next == null) {
            head.next = newNode;
            newNode.next = head;
            return head;
        }
        ListNode curr = head.next;

        while(curr.next != head) {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.next = head;


        return head;
    }
}
