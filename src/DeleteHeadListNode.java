public class DeleteHeadListNode {
    public static ListNode deleteAtHead(ListNode head) {
        if(head == null) return null;

        ListNode curr = head;

        while(curr.next != head) {
            curr = curr.next;
        }

        curr.next = head.next;
        head.next = null;
        head = curr.next;

        return head;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n1;

        ListNode test = deleteAtHead(n1);

        System.out.println(test.data);
    }
}
