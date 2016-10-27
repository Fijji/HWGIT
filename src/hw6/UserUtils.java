package hw6;

import java.util.Arrays;

public class UserUtils {
    public static User[] uniqueUsers(User[] users) {
        boolean mask[] = new boolean[users.length];
        int removeCount = 0;

        for (int i = 0; i < users.length; i++) {
            if (!mask[i]) {
                User tmp = users[i];

                for (int j = i + 1; j < users.length; j++) {
                    if (tmp.equals(users[j])) {
                        mask[j] = true;
                        removeCount++;
                    }
                }
            }
        }

        User[] result = new User[users.length - removeCount];

        for (int i = 0, j = 0; i < users.length; i++) {
            if (!mask[i]) {
                result[j++] =users[i];
            }
        }
        System.out.println(Arrays.toString(result));

        return result;
    }

    public static  User[] usersWithContitionalBalance(User[] users, int balance) {
        for (int i = 0; i < users.length; i++) {
            if( users[i]!=null &&  users[i].getBalance()!=balance)
                users[i]=null;
        }
        deleteEmptyUsers(users);
        return users;
    }

    public static   final User[] paySalaryToUsers(User[] users) {
        for (int i = 0; i <users.length ; i++) {
            users[i].setBalance(users[i].getBalance()+users[i].getSalary());
        }
        return users;
    }

    public static  final long[] getUsersId(User[] users) {
       long[] res =new long[users.length];
        for (int i = 0; i < users.length; i++) {
            if(users[i]!=null)
            res[i]=users[i].getId();
        }
        System.out.println(Arrays.toString(res));
        return res;
    }

    public static  User[] deleteEmptyUsers(User[] users) {
        User[] tmp;
        int count = 0;
        for (User u:users) {
            if(u==null){
                count++;
            }

        }
       tmp = new User[users.length-count];
        for (int i = 0; i < tmp.length; i++) {
            for (int j = 0; j < users.length; j++) {
                if (users != null) tmp[i] = users[j];
            }
        }
        System.out.println(Arrays.toString(tmp));
        return tmp;
    }

}
