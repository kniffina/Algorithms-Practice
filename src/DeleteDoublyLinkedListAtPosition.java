public class DeleteDoublyLinkedListAtPosition {

    public static DoublyLinkedNode deleteAtPos(DoublyLinkedNode head, int pos) {
        if(head == null || head.next == null) return null;
        if(pos == 1) return head.next;

        DoublyLinkedNode curr = head;
        DoublyLinkedNode prev = curr;

        int count = 0;

        while(curr != null) {
            count++;
            if(count == pos) {
                prev.next = curr.next;
                curr.next = null;
            }
            prev = curr;
            curr = curr.next;
        }

        return head;
    }

    public static void main(String[] args) {

    }
}
