public class IsListPalindrome {
    public static Boolean isListPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;

        ListNode fast = head;
        ListNode slow = head;

        while(fast !=  null && fast.next != null) {
            System.out.println(slow.data);
            fast = fast.next.next;
            slow = slow.next;

        }
        //att odd number
        ListNode middle = slow;
        if(fast != null) {
            slow = slow.next;
        }

        ListNode prev = head;
        ListNode next = null;

        while(head != middle) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        head = prev;


        while(head != middle && slow != null) {
            if(head.data != slow.data) {
                return false;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(5);
        ListNode n5 = new ListNode(4);
        ListNode n6 = new ListNode(3);
        ListNode n7 = new ListNode(2);

        n1.next = n2;
        n2.next = n3;
        //n3.next = n4;
        //n4.next = n5;
        n3.next = n5;
        n5.next = n6;
        n6.next = n7;

        System.out.println(isListPalindrome(n1));
    }
}