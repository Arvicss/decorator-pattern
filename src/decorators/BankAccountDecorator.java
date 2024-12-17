package decorators;

import interfaces.BankAccount;

public interface BankAccountDecorator extends BankAccount {
  void setBankAccount(BankAccount bankAccount);
}
