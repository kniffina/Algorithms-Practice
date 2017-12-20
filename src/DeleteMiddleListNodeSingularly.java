public class DeleteMiddleListNodeSingularly {
    public ListNode deleteAtMiddle(ListNode head, int position) {
        if(head == null || head.next == null) return null;
        if(position == 1)
            return head.next;

        ListNode curr = head;
        ListNode prev = head;
        int count = 0;

        while(curr != head) {
            count++;
            if(position == count) {
                prev.next = curr.next;
                curr.next = null;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {

    }
}
