public class DeleteTailCircularLinkedList {

    public ListNode deleteAtTail(ListNode head) {
        ListNode curr = head;
        ListNode prev = curr;

        if(head == null)
            return null;

        while(curr.next != head) {
            prev = curr;
            curr = curr.next;
        }

        //prev is before last node, point around curr to head
        prev.next = head;
        curr.next = null; //have to do this because its circular

        return head;
    }
}
