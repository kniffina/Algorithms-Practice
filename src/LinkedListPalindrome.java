
import java.util.LinkedList;
import java.util.Stack;

public class LinkedListPalindrome {

    //palindrome means that it is the same forwards as backwards
    public static boolean isLLPalindrome(LinkedListNode n1) {
        if(n1 == null)
            return false;

        LinkedListNode n2 = reverseList(n1);

        while(n1 != null) {
            if(n1.data != n2.data)
                return false;

            n1 = n1.next;
            n2 = n2.next;
        }

        return true;
    }

    public static LinkedListNode reverseList(LinkedListNode node) {

        if(node == null)
            return null;

        LinkedListNode lastValue = null;

        while(node != null) {
            LinkedListNode n = new LinkedListNode(node.data);
            n.next = lastValue; //point to value prior, saving it below
            lastValue = n;
            node = node.next;

        }
        return lastValue;
    }

    public static boolean iterativeLLPalindrome(LinkedListNode head) {
        if(head == null)
            return false;

        Stack<Integer> stack = new Stack<Integer>();
        LinkedListNode fast = head;
        LinkedListNode slow = head;

        while(fast != null && fast.next != null && fast.next.next != null) {
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        //if fast.next is not null then there is an odd number, so we can skip
        // the middle element. I.E. if 9 elements fast will be at 10
        if(fast != null)
            slow = slow.next;

        while(slow != null) {
            // if 1 -> 2 -> 3  then 3 -> 2 -> 1 off top. Should equal 123321 or 1239321
            Integer value = stack.pop();

            //System.out.println("Value: " + value);
            //System.out.println("Slow.data: " + slow.data);


            if(value != slow.data) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }

    public static void main(String[] args) {
        int length = 9;
        LinkedListNode[] nodes = new LinkedListNode[length];
        for (int i = 0; i < length; i++) {
            nodes[i] = new LinkedListNode(i >= length / 2 ? length - i - 1 : i, null, null);
        }

        for (int i = 0; i < length; i++) {
            if (i < length - 1) {
                nodes[i].setNext(nodes[i + 1]);
            }
            if (i > 0) {
                nodes[i].setPrevious(nodes[i - 1]);
            }
        }
        // nodes[length - 2].data = 9; // Uncomment to ruin palindrome

        LinkedListNode head = nodes[0];
        System.out.println(head.printForward());
        System.out.println(iterativeLLPalindrome(head));
    }

}
