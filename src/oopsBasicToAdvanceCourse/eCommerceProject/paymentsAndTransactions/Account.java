/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 01/09/21
 *   Time: 6:31 PM
 *   File: Account.java
 */

package oopsBasicToAdvanceCourse.eCommerceProject.paymentsAndTransactions;

public class Account {
    private int id;
    private Transaction[] transactions;

    public Transaction[] getTransactions() {
        return transactions;
    }

    public static class Transaction {
        private Account accountFrom, accountTo;
        private double moneyAmount;
        private StandardAccountOperations operations;
    }
}
