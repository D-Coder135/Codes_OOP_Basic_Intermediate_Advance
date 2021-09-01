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

    public Account(int id) {
        this.id = id;
    }

    public Transaction[] getTransactions() {
        return transactions;
    }

    public void sendMoneyToAccount(Account accountTo, double moneyAmount) {

    }

    public void withdrawMoney(double moneyAmount) {

    }

    public static class Transaction {
        private Account accountFrom, accountTo;
        private double moneyAmount;
        private StandardAccountOperations operations;

        public Transaction(Account accountFrom, Account accountTo, double moneyAmount, StandardAccountOperations operations) {
            this.accountFrom = accountFrom;
            this.accountTo = accountTo;
            this.moneyAmount = moneyAmount;
            this.operations = operations;
        }

        public Account getAccountFrom() {
            return accountFrom;
        }

        public void setAccountFrom(Account accountFrom) {
            this.accountFrom = accountFrom;
        }

        public Account getAccountTo() {
            return accountTo;
        }

        public void setAccountTo(Account accountTo) {
            this.accountTo = accountTo;
        }

        public double getMoneyAmount() {
            return moneyAmount;
        }

        public void setMoneyAmount(double moneyAmount) {
            this.moneyAmount = moneyAmount;
        }

        public StandardAccountOperations getOperations() {
            return operations;
        }

        public void setOperations(StandardAccountOperations operations) {
            this.operations = operations;
        }
    }

}
