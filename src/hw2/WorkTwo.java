package hw2;

public class WorkTwo {
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
    static double[] balances = {1200, 250, 2000, 500, 3200};

    static int balancesSum(int[] balances) {
        int sum = 0;
        for (int balance : balances) {
            if (balance > 1000 && balance < 5000) {
                sum += balance;
            }
        }
        return sum;
    }

    static String[] getOwnerNames(int[] balances, String[] names) {
        int ownersCount = 0;
        for (int balance : balances) {
            if (balance > 1000) ownersCount++;
        }

        String[] result = new String[ownersCount];

        int index = 0;
        for (int i = 0; i < balances.length; i++) {
            if (balances[i] > 1000) {
                result[index] = names[i];
                index++;
            }
        }

        return result;
    }

    ///*тип возвращаемого значения*/void  /*название метода*/ (/*параметры*/) {
    //логика

    //return //что-то
    //}

    int testMethod(int element, double test1, char pool) {
        //logic
        return 0;
    }

    void testMethod2(int test, String name) {
        //logic
        System.out.println("test....");


    }

    //параметры
    //тип значения название параметра

    //HOMEWORK 2.1
    static double withdrawBalance(double balance, double withdrawal) {
    double comission = withdrawal*0.05;
    double minus = comission+withdrawal;
        if (balance-minus<0)
        System.out.println("NO");
        else  System.out.println("OK "+comission+" "+(balance-minus));
        return 0;
    }

    //HOMEWORK 2.2
    static double withdrawBalance(String ownerName, double withdrawal) {
        double comission = withdrawal*0.05;
        double minus = comission+withdrawal;
        double balance=0;
        for (int i=0; i<ownerNames.length; i++){
            if(ownerName.equals(ownerNames[i]))
                balance = balances[i];
        }
        if (balance-minus<0)
            System.out.println("NO");
        else  System.out.println("OK "+withdrawal+" "+(balance-minus));
        return 0;
    }

    //HOMEWORK 2.3
    static double fundBalance(String ownerName, double fund) {
        for (int i=0; i<ownerNames.length; i++){
            if(ownerName.equals(ownerNames[i])){
                if(fund>0){
                balances[i]+=fund;
            System.out.println(ownerName+" "+balances[i]);}
            else System.out.println("imput more than 0");}
        }
        return 0;
    }

    public static void main(String[] args) {

//        int[] balances = {1200, 250, 2000, 500, 3200};
//        System.out.println(Arrays.toString(balances));

        withdrawBalance(100, 10);
        withdrawBalance("Oww", 490);
        fundBalance("Oww", 100);

//        int[] balances1 = {200, 200, 500, 4000, 30};

    }
}
