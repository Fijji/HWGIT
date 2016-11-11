package hw9;


import hw7.Order;

import java.util.Comparator;
import java.util.stream.Collectors;

import static hw7.Main.list;
import static hw7.Main.users;

public class Main {
    public static void main(String[] args) {

        Comparator<Order> decrease = (Order o1, Order o2) -> o2.getPrice()-o1.getPrice();
        Comparator<Order> increase = (Order o1, Order o2) -> o1.getPrice()-o2.getPrice();
        Comparator<Order> city = (Order o1, Order o2) -> o1.getUser().getCity().length()-o2.getUser().getCity().length();
        Comparator<Order> itemName = (Order o1, Order o2) -> o1.getItemName().compareTo(o2.getItemName());

        System.out.println(list.stream().sorted(decrease).collect(Collectors.toList())); //sort list by Order price in decrease order
        System.out.println(list.stream().sorted(increase).collect(Collectors.toList())); //sort list by Order price in increase order
        System.out.println(list.stream().sorted(city).collect(Collectors.toList())); //sort list by User city
        System.out.println(list.stream().sorted(itemName).collect(Collectors.toList())); //sort list by ItemName
        System.out.println(list.stream().distinct().collect(Collectors.toList())); //delete duplicates from the list
        System.out.println(list.stream().filter(o-> o.getPrice()<1500).collect(Collectors.toList())); //delete items where price less than 1500
//        System.out.println(list.stream().filter(s -> s.getCurrency().toString().contains("USD")).collect(Collectors.toList())); //separate list for two list - orders in USD
//        System.out.println(list.stream().filter(s -> s.getCurrency().toString().contains("UAH")).collect(Collectors.toList())); // UAH  ******Did not specified in constructor> produce NullPE error
        System.out.println(users.stream().anyMatch(s-> s.getFirstName().contains("Petrov"))); //  check if set contain Order where User’s lastName is - “Petrov”



    }
}
