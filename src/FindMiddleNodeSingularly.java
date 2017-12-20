
public class FindMiddleNodeSingularly {

    public static ListNode findMiddleNode(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;

        ListNode fast = head;
        ListNode slow = fast;

        while(fast != null && fast.next != null && (fast.next).next != null) {
            slow = slow.next;
            fast = (fast.next).next;
        }

        return slow;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        ListNode newNode = findMiddleNode(node1);

        //should be 3
        System.out.println(newNode.data);
    }
}
