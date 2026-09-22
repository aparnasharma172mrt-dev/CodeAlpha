import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Room room1 = new Room(101, "Single", 2000);
        Room room2 = new Room(102, "Double", 3500);
        Room room3 = new Room(103, "Deluxe", 5000);

        ArrayList<Room> rooms = new ArrayList<>();

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        System.out.println("Available Rooms:");

        for(Room r : rooms){
            if(r.available){
                r.displayRoom();
            }
        }

        System.out.println("\nEnter Customer Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Room Number: ");
        int number = sc.nextInt();

        Room selectedRoom = null;

        for(Room r : rooms){
            if(r.roomNumber == number && r.available){
                selectedRoom = r;
                break;
            }
        }

        if(selectedRoom != null){
            selectedRoom.available = false;

            Reservation booking = new Reservation(name, selectedRoom);
            booking.showBooking();

            System.out.println("\nRoom booked successfully");
        }

        else{
            System.out.println("Room not available!");
        }
        sc.close();
    }
}
