public class Lab implements Room{

    private String roomNumber;
    private int capacity;

    public Lab(){
        super();
    }

    public Lab(String roomNumber, int capacity){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
    }

    @Override
    public String getRoomNumber() {
        return this.roomNumber;
    }

    @Override
    public int getCapacity() {
        return this.capacity;
    }

    @Override
    public void book(String date, String time) {
        System.out.println(date +" " + time);
    }

    @Override
    public void displayRoomInfo() {
        System.out.println(this.roomNumber);
        System.out.println(this.capacity);
    }
    
}