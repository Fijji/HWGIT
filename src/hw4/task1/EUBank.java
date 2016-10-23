package hw4.task1;

public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }
    @Override
    int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD)
            return 2000;
        else return 2200;
    }

    @Override
    int getLimitOfFunding() {
        if(getCurrency() == Currency.EUR)
            return 20000;
        else return 10000;
    }

    @Override
    int getMonthlyRate() {
        if(getCurrency()==Currency.USD)
            return 0;
        else return 1;
    }

    @Override
    int getCommission(int summ) {
        if(getCurrency()==Currency.USD){
            if (summ>1000)return 7;
            else return 5;
        }
        else {
            if(summ>1000)return 4;
            else return 2;
        }
    }
}
