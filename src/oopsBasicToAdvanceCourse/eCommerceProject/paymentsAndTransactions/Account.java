/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 01/09/21
 *   Time: 6:31 PM
 *   File: Account.java
 */

package oopsBasicToAdvanceCourse.eCommerceProject.paymentsAndTransactions;

import java.util.Arrays;

public class Account {
    private static final int DEFAULT_TRANSACTIONS_AMOUNT = 10;
    private int id;
    private Transaction[] transactions;
    private int lastTransactionIndex;

    {
        transactions = new Transaction[DEFAULT_TRANSACTIONS_AMOUNT];
    }

    public Account(int id) {
        this.id = id;
    }

    public Transaction[] getTransactions() {
        int nonNullTransactionsAmount = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null) {
                nonNullTransactionsAmount++;
            }
        }
    }

    public void sendMoneyToAccount(Account accountTo, double moneyAmount) {
        if (accountTo == null) {
            return;
        }
        if (moneyAmount <= 0) {
            return;
        }
        Transaction transaction = new Transaction(this, accountTo, moneyAmount, StandardAccountOperations.MONEY_TRANSFER_SEND);
        addTransaction(transaction);
        accountTo.receiveMoney(this, moneyAmount);
    }

    private void receiveMoney(Account accountFrom, double moneyAmount) {
        if (accountFrom == null) {
            return;
        }
        if (moneyAmount <= 0) {
            return;
        }
        Transaction transaction = new Transaction(accountFrom, this, moneyAmount, StandardAccountOperations.MONEY_TRANSFER_RECEIVE);
        addTransaction(transaction);
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
        Transaction transaction = new Transaction(this, null, moneyAmount, StandardAccountOperations.WITHDRAW);
        addTransaction(transaction);
    }

    @Override
    public String toString() {
        return "Account ID: " + this.id;
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
