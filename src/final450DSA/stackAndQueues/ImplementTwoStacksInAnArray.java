/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 17-04-2022/04/2022
 *   Time: 11:44 AM
 *   File: ImplementTwoStacksInAnArray
 */

/**
 * GFG QUESTION =>
 * <p>
 * Your task is to implement  2 stacks in one array efficiently.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * push1(2)
 * push1(3)
 * push2(4)
 * pop1()
 * pop2()
 * pop2()
 * <p>
 * Output:
 * 3 4 -1
 * <p>
 * Explanation:
 * push1(2) the stack1 will be {2}
 * push1(3) the stack1 will be {2,3}
 * push2(4) the stack2 will be {4}
 * pop1()   the poped element will be 3
 * from stack1 and stack1 will be {2}
 * pop2()   the poped element will be 4
 * from stack2 and now stack2 is empty
 * pop2()   the stack2 is now empty hence -1 .
 */

package final450DSA.stackAndQueues;

public class ImplementTwoStacksInAnArray {
    static class TwoStack {

        int size;
        int top1, top2;
        int[] arr = new int[100];

        TwoStack() {
            size = 100;
            top1 = -1;
            top2 = size;
        }
    }

    static class Stacks {
        //Function to push an integer into the stack1.
        void push1(int x, TwoStack sq) {
            sq.arr[sq.top1 + 1] = x;
            sq.top1 = sq.top1 + 1;
        }

        //Function to push an integer into the stack2.
        void push2(int x, TwoStack sq) {
            sq.arr[sq.top2 - 1] = x;
            sq.top2 = sq.top2 - 1;
        }

        //Function to remove an element from top of the stack1.
        int pop1(TwoStack sq) {
            if (sq.top1 != -1) {
                int temp = sq.arr[sq.top1];
                sq.arr[sq.top1] = 0;
                sq.top1 = sq.top1 - 1;
                return temp;
            }
            return -1;
        }

        //Function to remove an element from top of the stack2.
        int pop2(TwoStack sq) {
            if (sq.top2 != sq.size) {
                int temp = sq.arr[sq.top2];
                sq.arr[sq.top2] = 0;
                sq.top2 = sq.top2 + 1;
                return temp;
            }
            return -1;
        }
    }
}
