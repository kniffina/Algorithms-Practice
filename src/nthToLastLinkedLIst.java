
public class nthToLastLinkedLIst {

    public static ListNode nthToLast(ListNode head, int fromEnd) {

        if(head == null) return head;

        ListNode n1 = head;
        ListNode n2 = head;

        for(int i = 0; i < fromEnd; i++) {
            if(n1 == null)
                return null;
            n1 = n1.next;
        }

        while(n1 != null) {
            n1 = n1.next;
            n2 = n2.next;
        }

        return n2;
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

        n1 = nthToLast(n1, 4);

        System.out.println(n1.data);
    }
}
