package hw4.task1;

public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD)
            return 100;
        else return 150;
    }

    @Override
    int getLimitOfFunding() {
        if(getCurrency() == Currency.EUR)
            return 5000;
        else return 10000;
    }

    @Override
    int getMonthlyRate() {
        if(getCurrency()==Currency.USD)
            return 1;
        else return 0;
    }

    @Override
    int getCommission(int summ) {
        if(getCurrency()==Currency.USD){
            if (summ>1000)return 5;
            else return 3;
        }
        else {
            if(summ>1000)return 11;
            else return 10;
        }
    }
}
