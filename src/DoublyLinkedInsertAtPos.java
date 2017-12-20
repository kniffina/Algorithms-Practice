public class DoublyLinkedInsertAtPos {

    public DoublyLinkedNode insertAtPos(DoublyLinkedNode head, int data, int pos) {
        DoublyLinkedNode newNode = new DoublyLinkedNode(data);

        if(head == null && pos == 1) head = newNode;
        else {
            DoublyLinkedNode curr = head;
            DoublyLinkedNode prev = curr;
            int count = 1;

            while(curr != null) {
                if(count == pos)
                    break;
                else {
                    prev = curr;
                    curr = curr.next;
                    count++;
                }
            }

            //do nothing if position not available
            if(count < pos) return head;

            //insert at heading position
            else if(count == 1) {
                newNode.next = curr;
                curr.prev = newNode;
                head = newNode;
            }
            //insert at middle position
            else if(curr != null) {
                newNode.next = curr;
                newNode.prev = prev;
                prev.next = newNode;
                curr.prev = newNode;
            }
            //insert at ending position
            else {
                prev.next = newNode;
                newNode.prev = prev;
            }
        }

        return head;
    }
}
