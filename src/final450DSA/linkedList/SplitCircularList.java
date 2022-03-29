/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 29-03-2022/03/2022
 *   Time: 02:33 PM
 *   File: SplitCircularList
 */

package final450DSA.linkedList;

import java.util.Scanner;

public class SplitCircularList {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static class circular_LinkedList {
        Node head, head1, head2;  // head of lisl
        //Node last = null;
        Node last = null;

        /* Linked list Node*/


        /* Utility functions */

        /* Drier program to test above functions */
        public static void main(String[] args) {


        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t > 0) {
                int n = sc.nextInt();
                circular_LinkedList llist = new circular_LinkedList();
                int a1 = sc.nextInt();
                Node head = new Node(a1);
                llist.addToTheLast(head);
                for (int i = 1; i < n; i++) {
                    int a = sc.nextInt();
                    llist.addToTheLast(new Node(a));


                }
			 /*Node x = head;
			 while(x!=null)
			 {
				 System.out.print(x.data+" ");
				 x = x.next;
			 }*/
                llist.circular();
                //int k=sc.nextInt();
                GFG g = new GFG();
                //System.out.println(g.getCount(llist));
                g.splitList(llist);
                llist.printList(llist.head1);
                llist.printList(llist.head2);
                //llist.printList();
                //llist.head = llist.reverse(llist.head);
                //llist.printList();


                t--;
            }
        }

        /* Inserts a new Node at front of the list. */
        public void addToTheLast(Node node) {

            if (head == null) {
                head = node;

            } else {
                Node temp = head;
                while (temp.next != null)
                    temp = temp.next;

                temp.next = node;
            }
        }

        /* Function to print linked list */
        void printList(Node node) {
            Node temp = node;
            if (node != null) {
                do {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                } while (temp != node);
            }
            System.out.println();
        }

        void circular() {
            last = head;
            while (last.next != null)
                last = last.next;
            last.next = head;
            //System.out.println(last);
        }
    }// } Driver Code Ends


    static class GFG {

    }
}
