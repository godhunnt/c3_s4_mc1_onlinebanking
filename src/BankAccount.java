public abstract class BankAccount {

    private int accountNumber;

    private int age;
    private String openingDate;
    private String modeOfOperation;
    private boolean internetBanking;
    private double totalbalance;
    private double availableBalance;
    private double rateOfInterest;


    public BankAccount(int accountNumber, int age, String openingDate, String modeOfOperation,
                       boolean internetBanking, double totalbalance, double availableBalance
                       , double rateOfInterest) {
        this.accountNumber = accountNumber;
        this.age = age;
        this.openingDate = openingDate;
        this.modeOfOperation = modeOfOperation;
        this.internetBanking = internetBanking;
        this.totalbalance = totalbalance;
        this.availableBalance = availableBalance;
        this.rateOfInterest = rateOfInterest;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(String openingDate) {
        this.openingDate = openingDate;
    }

    public String getModeOfOperation() {
        return modeOfOperation;
    }

    public void setModeOfOperation(String modeOfOperation) {
        this.modeOfOperation = modeOfOperation;
    }

    public boolean isInternetBanking() {
        return internetBanking;
    }

    public void setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
    }

    public double getTotalbalance() {
        return totalbalance;
    }

    public void setTotalbalance(double totalbalance) {
        this.totalbalance = totalbalance;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract String ShowAccountBalance();

    public abstract double credit(double amount);

    public abstract double debit(double amount);

    public String checkAge() {
        String result = "";
        if (getAge() >= 18) {
            result = "Eligible ";
        } else {
            result = "Not Eligible ";
        }
        return result;
    }


}

