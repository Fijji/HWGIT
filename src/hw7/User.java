package hw7;

public class User  implements Comparable<User> {
   private long id;
    private String firstName;
    private String lastName;
    private String city;
    private int balance;

    public User(String firstName, String city) {
        this.firstName = firstName;
        this.city = city;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public int compareTo(User o) {
        return this.city.compareTo(o.getCity());
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        User user = (User) object;

        if (city != user.getCity()) return false;
        return firstName != null ? firstName.equals(user.getFirstName()) : user.firstName == null;

    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + firstName + '\'' +
                ", city=" + city +
                '}';
    }
}

