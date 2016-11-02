package hw8;

import java.util.ArrayList;
import java.util.List;

public class UserDAO extends AbstractDAOImpl{

    public static void main(String[] args) {
        UserDAO us = new UserDAO();
        List<UserDAO> sp = new ArrayList<>();
        us.save(us);
        us.delete(us);
        list.add(sp);

    }
}
