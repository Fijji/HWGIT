package hw4.task1;

public class Main {
    public static void main(String[] args) {

        Bank usb = new USBank(1, "USA", Currency.USD, 1000, 500, 1, 10000000);
        Bank cn = new ChinaBank(2, "China", Currency.USD, 500, 200, 20, 200000);
        Bank eu = new EUBank(3, "France", Currency.EUR, 1200, 800, 2, 2000000);

        User u1 = new User(200, 600, usb);
        User u2 = new User(200, 700, usb);
        User u3 = new User(200, 800, cn);
        User u4 = new User(200, 900, cn);
        User u5 = new User(200, 100, eu);
        User u6 = new User(200, 300, eu);

        BankSystem imp = new BankSystemImpl();
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);
        System.out.println(u4);
        System.out.println(u5);
        System.out.println(u6);

        imp.fundUser(u1, 100);
        imp.transferMoney(u1, u2, 50);
        imp.withdrawOfUser(u1, 100);
        imp.paySalary(u1);

        imp.fundUser(u2, 7700);
        imp.transferMoney(u2, u3, 6660);
        imp.withdrawOfUser(u2, 2200);
        imp.paySalary(u2);

        imp.fundUser(u3, 1200);
        imp.transferMoney(u3, u4, 70);
        imp.withdrawOfUser(u3, 500);
        imp.paySalary(u3);

        imp.fundUser(u4, 3300);
        imp.transferMoney(u4, u5, 30);
        imp.withdrawOfUser(u4, 200);
        imp.paySalary(u4);

        imp.fundUser(u5, 200);
        imp.transferMoney(u5, u6, 350);
        imp.withdrawOfUser(u5, 2100);
        imp.paySalary(u5);

        imp.fundUser(u6, 1001);
        imp.transferMoney(u6, u5, 250);
        imp.withdrawOfUser(u6, 1100);
        imp.paySalary(u6);

        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);
        System.out.println(u4);
        System.out.println(u5);
        System.out.println(u6);
    }
}
