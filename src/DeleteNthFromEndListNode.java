public class DeleteNthFromEndListNode {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null) return null;

        ListNode onDeleteNode = head;
        ListNode prevOnDeleteNode = head;
        ListNode endOfList = head;

        for(int i = 0; i < n; i++) {
            //if it goes past to end while in loop, n > list length
            if(endOfList == null)
                return head;
            endOfList = endOfList.next;
        }
        //if endoflist is null we n = length of list. I.E. n length from head, remove head
        if(endOfList == null)
            return head.next;

        while(endOfList != null) {
            endOfList = endOfList.next;
            prevOnDeleteNode = onDeleteNode;
            onDeleteNode = onDeleteNode.next;
        }

        prevOnDeleteNode.next = onDeleteNode.next;
        onDeleteNode.next = null;

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

        ListNode data = removeNthFromEnd(n1, 5);
        System.out.println();
        while(data != null) {
            System.out.println(data.data);
            data = data.next;
        }
    }
}
