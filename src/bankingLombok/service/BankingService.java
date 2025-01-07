package bankingLombok.service;
public interface BankingService {
    void withdraw(double cash);
    void deposit(double cash);
    void showBalance();
    void getKHCurrency();
    void getDollarCurrency();
}