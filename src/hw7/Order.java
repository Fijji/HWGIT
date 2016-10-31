package hw7;

import hw4.task1.Currency;

public class Order {
    private long id;
    private int price;
    private Currency currency;
    private String itemName;
    private String shopIdentificator;

    public Order(int price, String itemName, String shopIdentificator, User user) {
        this.price = price;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
        this.user = user;
    }

    private User user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getShopIdentificator() {
        return shopIdentificator;
    }

    public void setShopIdentificator(String shopIdentificator) {
        this.shopIdentificator = shopIdentificator;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Order{" +
                "price=" + price +
                ", itemName='" + itemName + '\'' +
                " user City=" + user.getCity() +
                '}';
    }
}
