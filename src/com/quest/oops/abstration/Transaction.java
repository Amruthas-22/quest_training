package com.quest.oops.abstration;

public abstract class Transaction {
int amount;
BankAccount bankAccount ;
public Transaction(int amount, BankAccount bankAccount) {
   this.amount = amount;
   this.bankAccount = bankAccount;
}
public abstract void processTransaction();

}
