public class DeleteListNodeTail {

    public ListNode deleteAtTail(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode curr = head;
        ListNode prev = head;

        while(curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
        curr = null;

        return head;
    }

    public static void main(String[] args) {

    }
}
