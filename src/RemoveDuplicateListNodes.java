import java.util.HashMap;

public class RemoveDuplicateListNodes {

    public static ListNode removeDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        HashMap<Integer, ListNode> hm = new HashMap<Integer, ListNode>();

        ListNode curr = head;
        ListNode prev = curr;

        while(curr != null) {
            if(hm.containsKey(curr.data)) {
                prev.next = curr.next;
                curr.next = null;
                curr = prev.next;

                if(curr == null)
                    break;
            } else {
                hm.put(curr.data, curr);
            }

            prev = curr;
            curr = curr.next;
        }
        return head;
    }

    public static ListNode removeDuplicatesNoBuffer(ListNode head) {
        ListNode curr = head;

        while(curr != null) {
            ListNode runner = curr;

            //another while loop to go through every value for each curr
            while(curr.next != null) {
                if(curr.data == runner.next.data) {
                    runner.next = (runner.next).next;
                } else {
                    runner = runner.next;
                }
            }
        }

        return head;
    }

    public static void main(String[] args) {

    }
}
