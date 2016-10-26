package hw5;

public class TripAdvisorAPI implements API {
    private Room[] rooms = new Room[5];

    public TripAdvisorAPI() {
        Room room1 = new Room(1000, 15, "Vinnitsa", "OTEL");
        Room room2 = new Room(101, 1, "Krakow", "Radison");
        Room room3 = new Room(131, 2, "Kiev", "BudkaBar");
        Room room4 = new Room(1200, 220, "Lvov", "GrandHotel");
        Room room5 = new Room(100, 3, "Smila", "ProstoHotel");
        rooms[0] = room1;
        rooms[1] = room2;
        rooms[2] = room3;
        rooms[3] = room4;
        rooms[4] = room5;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] res= new Room[rooms.length];
        for (int i=0; i<rooms.length; i++) {
            if (rooms[i].getPrice()==price&& rooms[i].getPersons()==persons)
                res[i]= rooms[i];
        }
        return res;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
