package hw4;

public class USBank extends Bank{
    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD)
            return 1000;
        else return 1200;
    }

    @Override
    int getLimitOfFunding() {
        if(getCurrency() == Currency.EUR)
            return 10000;
        else return 0;
    }

    @Override
    int getMonthlyRate() {
        if(getCurrency()==Currency.USD)
            return 1;
        else return 2;
    }

    @Override
    int getCommission(int summ) {
        if(getCurrency()==Currency.USD){
            if (summ>1000)return 7;
            else return 5;
        }
        else {
            if(summ>1000)return 8;
            else return 6;
        }
    }
}
