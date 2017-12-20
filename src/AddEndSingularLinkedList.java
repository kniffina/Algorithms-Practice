class ListNode {
    int data;
    ListNode next;
    ListNode(int data) { this.data = data; }
}

public class AddEndSingularLinkedList {

    public static ListNode insertAtTail(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        if(head == null) {
            head = newNode;
            newNode.next = null;
        } else {
            ListNode current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = null;
        }

        return newNode;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(5);
        node.next = null;

        insertAtTail(node, 10);
    }
}
