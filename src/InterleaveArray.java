import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InterleaveArray {
    /*
    This problem was asked by Google.

Given a stack of N elements, interleave the first half of the stack with
the second half reversed using only one other queue. This should be done
in-place.

1 <--> 4
2 <--> 4
3 <--> 4

For example, if the stack is
   [1, 2, 3, 4, 5], it should become
   [1, 5, 2, 4, 3].
If the stack is  [1, 2, 3, 4],
it should become [1, 4, 2, 3].
     */

    /*

    It's a bit hard to see how we could transform our stack directly to the desired state. So let's consider going backwards from the desired state.

    - Given [1, 2, 3, 4, 5] we want [1, 5, 2, 4, 3].
    - We can see this is just a pairing of a queue with (5, 4) and a stack of [3, 2, 1] where we first pop off stack and then get from the queue.
    - At this point, we can get to the above from a queue of (3, 2, 1, 5, 4)
    - Which is just a rotation of (5, 4, 3, 2, 1)
    - Now let's go forward with these insights.

 1. Put all elements into the queue and get (5, 4, 3, 2, 1)
 2. Rotate len(stack) / 2 elements by taking them off the queue (5, 4) and putting them back to get (3, 2, 1, 5, 4)
 3. Put ceil(len(stack) / 2) elements into the stack. The queue is now (5, 4) and stack is [3, 2, 1]
 4. Pair them up len(stack) / 2 times. If stack is still not empty, pop one more time
 5. Move all elements from the queue to the stack

     */

    public static Stack<Integer> interleave(Stack<Integer> stack) {
        int size = stack.size();
        //FIFO queue
        Queue<Integer> q = new LinkedList<>();

        while(!stack.isEmpty()) {
            q.add(stack.pop()); //4, 3, 2, 1
        }

        //take first 2 (biggest) i = 0, i = 1 5/2 = 2 (in ints)
        // so 5, and 4 added at end after removing
        // 5, 4, 3, 2, 1  ->  3, 2, 1, 5, 4
        for(int i = 0; i < size / 2; i++) {
            q.add(q.remove());
        }

        //add the elements back to the stack (FILO) so 3,2,1 3 is last
        System.out.println("*****\n" + Math.ceil((double) size / 2));
        for(int i = 0; i < Math.ceil((double) size / 2); i++) {
            stack.add(q.remove());
        }

        //divide by the size because we always want
        for(int i = 0; i < size / 2; i++) {
            q.add(stack.pop()); //stack = 2, 1  remove top ele   so  1 -> 2
            q.add(q.remove()); // queue = 4, 3  remove first ele so  4 -> 3
                               // q1 = 1, 4   q2 = 2, 3
        }

        if(!stack.isEmpty()) {
            q.add(stack.pop());
        }

        int count = 0;
        while(!q.isEmpty()) {
            stack.add(q.remove());
        }

        return stack;
    }

    public static void main(String[] args) {
        Stack<Integer> arr = new Stack<Integer>();
        arr.push(1);
        arr.push(2);
        arr.push(3);
        arr.push(4);
        //arr.push(5);

//        System.out.println("*** START ***");
//        for(int i = 0; i < arr.size(); i++) {
//            System.out.print(arr.elementAt(i) + " ");
//        }
//        System.out.println();

        arr = interleave(arr);


        for(int i = 0; i < arr.size(); i++) {
            System.out.print(arr.elementAt(i) + " " );
        }
//        System.out.println("*** AFTER ***");
//
//        for(int i = 0; i < arr.size(); i++) {
//            System.out.print(arr.elementAt(i) + " ");
//        }
//        System.out.println();
    }
}