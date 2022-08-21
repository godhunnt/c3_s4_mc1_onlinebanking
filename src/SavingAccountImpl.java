public class SavingAccountImpl {
    public static void main(String[] args) {

        SavingAccount savingAccount = new SavingAccount(123456789, 19, "14.10.20",
                "SelfOperation",true,2000,1000,7);

        RecurringDepositAccount recurringDepositAccount = new RecurringDepositAccount(123456789,18,
                "14.10.20", "SelfOperation",true,1000,100,
                9);

        System.out.println(" Saving account Balance After credit " + savingAccount.credit(200));

        System.out.println("Saving account Balance After debit " + savingAccount.debit(300));
        System.out.println("Recurring  account Balance After credit " + recurringDepositAccount.credit(500));
        System.out.println("Recurring  account Balance After debit " + recurringDepositAccount.debit(200));
        System.out.println("Eligible for opening Saving Account -"+savingAccount.checkAge());
        System.out.println("Eligible for opening Recurring Account -"+recurringDepositAccount.checkAge());
    }
}
