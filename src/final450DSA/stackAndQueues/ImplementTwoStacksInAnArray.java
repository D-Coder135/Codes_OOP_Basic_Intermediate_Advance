/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 17-04-2022/04/2022
 *   Time: 11:44 AM
 *   File: ImplementTwoStacksInAnArray
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

        }

        //Function to remove an element from top of the stack2.
        int pop2(TwoStack sq) {

        }
    }
}
