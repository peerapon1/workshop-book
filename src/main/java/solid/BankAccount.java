package solid;

class Main {
    public static void main(String[] args) {
        ThailandBankAccount bankAccount = new ThailandBankAccount();
        bankAccount.transferMoney(new ThailandBankAccount(), 100);

        InterBankAccount inter = new InterBankAccount();
        inter.transferMoney(new ThailandBankAccount(), 100);
    }
}

class ThailandBankAccount {
    void transferMoney(ThailandBankAccount targetAccount, int amount) {
        System.out.println("Transfer money in Thailand");
    }
}
class InterBankAccount {
    void  transferMoney(ThailandBankAccount targetAccount, int amount) {
        System.out.println("Transfer money in Inter");
    }
}
