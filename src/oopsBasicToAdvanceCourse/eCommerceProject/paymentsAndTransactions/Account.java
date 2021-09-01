/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 01/09/21
 *   Time: 6:31 PM
 *   File: Account.java
 */

package oopsBasicToAdvanceCourse.eCommerceProject.paymentsAndTransactions;

import java.util.Arrays;

public class Account {
    private int id;
    private Transaction[] transactions;
    private int lastTransactionIndex;

    private static final int DEFAULT_TRANSACTIONS_AMOUNT = 10;

    {
        transactions = new Transaction[DEFAULT_TRANSACTIONS_AMOUNT];
    }

    public Account(int id) {
        this.id = id;
    }

    public Transaction[] getTransactions() {
        return transactions;
    }

    public void sendMoneyToAccount(Account accountTo, double moneyAmount) {

    }

    private void recieveMoney(Account accountFrom, double moneyAmount) {
        if (accountFrom == null) {
            return;
        }
        if (moneyAmount <= 0) {
            return;
        }
    }

    private void addTransaction(Transaction transaction) {
        if (transaction == null) {
            return;
        }
        if (transactions.length <= lastTransactionIndex) {
            transactions = Arrays.copyOf(transactions, transactions.length << 1);
        }
        transactions[lastTransactionIndex++] = transaction;
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
