package hw4;

public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        Bank userBank = user.getBank();

        double commission = userBank.getCommission(amount);
        if (userBank.getLimitOfWithdrawal() >= amount + amount * commission) {
            double newBalance = user.getBalance() - amount - amount * commission;
            user.setBalance(newBalance);
        }
        else System.out.println("Over limit");
    }

    @Override
    public void fundUser(User user, int amount) {
        if (user.getBank().getLimitOfFunding() > amount)
            user.setBalance(user.getBalance() + amount);
        else System.out.println("Over limit");
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        if (toUser.getBank().getLimitOfFunding() > amount && fromUser.getBank().getLimitOfWithdrawal() > amount) {
            fromUser.setBalance(fromUser.getBalance() - amount - fromUser.getBank().getCommission(amount));
            toUser.setBalance(toUser.getBalance() + amount);
        }
    }

    @Override
    public void paySalary(User user) {
        if (user.getBank().getLimitOfFunding()>user.getBank().getAvrSalaryOfEmployee()){
            user.setBalance(user.getBank().moneyPaidMonthlyForSalary()-user.getBank().getCommission((int)user.getBank().moneyPaidMonthlyForSalary()));
        }
    }
}
