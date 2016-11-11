package hw7;

import java.util.*;

public class Main {
    public static List<Order> list = new ArrayList<>();
    public static List<User> users = new ArrayList<>();

    public static void main(String[] args) {

        users.add(new User("Boris", "Barcelona"));
        users.add(new User("Petrov", "Kiev"));
        users.add(new User("York", "Barcelona"));
        users.add(new User("Vanya", "Dublin"));
        users.add(new User("Natasha", "Zugres"));
        users.add(new User("Dima", "Antenanarivu"));
        users.add(new User("Natasha", "Zugres"));
        users.add(new User("Ira", "Kharkow"));
        users.add(new User("Kolya", "Ternopol"));
        users.add(new User("Nastya", "Zugres"));
        Set<User> treeList = new TreeSet<User>(users);
        Iterator<User> userIterator = treeList.iterator();
        while (userIterator.hasNext()) {
            User user = userIterator.next();
            if (user.getFirstName().contains("Petrov"))
                System.out.println("YES");
        }
        //other hw with the same iterator approach


        list.add(new Order(299, "desk", "room", users.get(0)));
        list.add(new Order(355, "carpet", "room", users.get(1)));
        list.add(new Order(40, "bell", "other", users.get(1)));
        list.add(new Order(5, "napkin", "other", users.get(2)));
        list.add(new Order(100, "carpet", "room", users.get(2)));
        list.add(new Order(100, "carpet", "room", users.get(2)));
        list.add(new Order(15002, "carpet", "room", users.get(6)));
        list.add(new Order(566, "carpet", "room", users.get(7)));
        list.add(new Order(123, "idn", "other", users.get(7)));
        list.add(new Order(445, "steel", "room", users.get(9)));

        Comparator<Order> comparator = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
//                return o2.getPrice() - o1.getPrice(); //decrease order
//                return o1.getPrice() - o2.getPrice();    //increase order
//                return   o1.getUser().getCity().length() -  o2.getUser().getCity().length(); //User city
                return o1.getItemName().length() - o2.getItemName().length();
            }
        };
        list.sort(comparator);
        System.out.println(list);

        Iterator<Order> orderIterator = list.iterator();
        while (orderIterator.hasNext()) {
            Order ord = orderIterator.next();
            if (ord.getPrice() < 1500) {
                orderIterator.remove();
            }
        }
    }
}