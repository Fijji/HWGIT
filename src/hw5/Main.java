package hw5;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.requestRooms(100, 1, "Krakow", "Radison");
        controller.requestRooms(150, 1, "Kyiv", "Radison");
        controller.requestRooms(280, 10, "London", "Test");

        controller.check(new BookingComAPI(), new GoogleAPI());
        controller.check(new BookingComAPI(), new TripAdvisorAPI());
        controller.check(new GoogleAPI(), new TripAdvisorAPI());
    }
}
