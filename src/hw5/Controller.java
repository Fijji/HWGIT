package hw5;

public class Controller {
    private API[] arrayOfApis = new API[3];

    public Controller() {
        BookingComAPI bookingComAPI = new BookingComAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
        GoogleAPI googleAPI = new GoogleAPI();

        arrayOfApis[0] = bookingComAPI;
        arrayOfApis[1] = tripAdvisorAPI;
        arrayOfApis[2] = googleAPI;
    }

    public Controller(API[] arrayOfApis) {
        this.arrayOfApis = arrayOfApis;
    }

    Room[] requestRooms(int price, int persons, String city, String hotel) {
        BookingComAPI bookingComAPI = new BookingComAPI();
        GoogleAPI googleAPI = new GoogleAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
        arrayOfApis[0] = bookingComAPI;
        arrayOfApis[1] = tripAdvisorAPI;
        arrayOfApis[2] = googleAPI;

        //using
        Room[] res = bookingComAPI.findRooms(price, persons, city, hotel);
        Room[] res1 = googleAPI.findRooms(price, persons, city, hotel);
        Room[] res2 = tripAdvisorAPI.findRooms(price, persons, city, hotel);

//        System.out.println(Arrays.toString(res));
        Room[] resArray = new Room[15];

        for (int i = 0; i < res.length; i++) {
            if (res[i] != null) {
                for (int j = 0; j < resArray.length; j++) {
                    if (resArray[j] == null){
                        resArray[j] = res[i];
                    break;}
                }
            }
        }
        for (int i = 0; i < res1.length; i++) {
            if (res1[i] != null) {
                for (int j = 0; j < resArray.length; j++) {
                    if (resArray[j] == null){
                        resArray[j] = res1[i];
                    break;}
                }
            }
        }
        for (int i = 0; i < res2.length; i++) {
            if (res2[i] != null) {
                for (int j = 0; j < resArray.length; j++) {
                    if (resArray[j] == null){
                        resArray[j] = res2[i];
                    break;}
                }
            }
        }

//        System.out.println(Arrays.toString(resArray));
        DAOOImpl daoo = new DAOOImpl();
        for(int i = 0; i<resArray.length; i++){
         if(resArray[i]!=null)
            daoo.save(resArray[i]);}
        return resArray;
    }

    Room[] check(API api1, API api2) {

        Room[] roomsFromApi1 = api1.getAll();
        Room[] roomsFromApi2 = api2.getAll();

        int countRooms = 0;
        for (int i = 0; i < roomsFromApi1.length; i++) {
            for (int j = 0; j < roomsFromApi2.length; j++) {
                if (roomsFromApi1[i].equals(roomsFromApi2[j]))
                    countRooms++;
            }
        }
        System.out.println("same rooms = " + countRooms);

        return null;


    }
}
