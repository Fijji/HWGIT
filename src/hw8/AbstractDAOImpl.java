package hw8;

import java.util.ArrayList;
import java.util.List;

public class AbstractDAOImpl implements AbstractDAO {
    static List<Object> list = new ArrayList<>();

    @Override
    public Object save(Object user) {
        System.out.println("saved " + user.toString());
        list.add(user);
        return user;
    }

    @Override
    public void delete(Object user) {
        System.out.println("deleted " + user.toString());
        list.remove(user);
    }

    @Override
    public void deleteAll(List t) {
        list.remove(t);
    }

    @Override
    public void saveAll(List t) {
        list.addAll(t);
    }

    @Override
    public List getList() {
        return list;
    }
}
