package hw3.taks4;

public class User {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;


    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    void paySalary() {
    setBalance(getBalance()+getSalary());
    }
    void withdraw(int summ){
     if(summ<1000){
        setBalance((int) (getBalance()-summ-(summ*0.05)));
     }
     else setBalance((int) (getBalance()-summ-(summ*0.1)));
  }
   int companyNameLenght(){
//       System.out.println(getCompanyName().length());
       return getCompanyName().length();
   }
   void monthIncreaser(int addMonth){
        setMonthsOfEmployment(getMonthsOfEmployment()+addMonth);
    }
}