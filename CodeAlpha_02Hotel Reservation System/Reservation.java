public class Reservation {

    String customerName;
    Room room;

    Reservation(String customerName, Room room){
        this.customerName = customerName;
        this.room = room;
    }
    void showBooking(){
        System.out.println("\nBooking Details");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Room Number: " + room.roomNumber);
        System.out.println("Category: " + room.category);
        System.out.println("Price: " + room.price);

    }
    
}
