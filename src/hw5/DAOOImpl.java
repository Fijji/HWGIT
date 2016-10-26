package hw5;

public class DAOOImpl implements DAO {
    @Override
    public Room save(Room room) {
        System.out.println("Save " + room.toString());
        return null;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("Delete " + room.toString());
        return false;
    }

    @Override
    public Room update(Room room) {
        System.out.println("Update " + room.toString());
        return null;
    }

    @Override
    public Room findById(long id) {
        System.out.println("Find by id " + id);
        return null;
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }
}
