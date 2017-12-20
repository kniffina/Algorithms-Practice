public class DeleteMIdNotHead {

    public static boolean deleteNode(ListNode n) {
        if(n == null || n.next == null) return false;

        ListNode curr = n;
        n.data = n.next.data;
        n = n.next;

        System.out.println(n.data);

        return true;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);

        n1.next = n2;
        n2.next = n3;

        deleteNode(n2);
    }
}
