package hw6;

public class Main {
    public static void main(String[] args) {
        User[] array = new User[5];
        array[0] = new User(1,"Jack", "Back", 500, 1000);
        array[1] = null;
        array[2] = new User(2,"Daniel", "Redclif", 200, 12000);
        array[3] = new User(1,"Jack", "Back", 500, 1000);
        array[4] = new User(1,"Jack", "Back", 500, 1000);

        UserUtils.uniqueUsers(array);
        UserUtils.deleteEmptyUsers(array);
        UserUtils.getUsersId(array);
        UserUtils.usersWithContitionalBalance(array, 1000);
    }
}
