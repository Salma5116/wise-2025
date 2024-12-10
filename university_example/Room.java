
/**
 * Interface defining the core behaviors of a room in a university.
 * Represents a generic room that can be booked and holds information
 * about its properties such as room number and capacity.
 */
public interface Room {

    /**
     * Retrieves the room number of the room.
     *
     * @return the room number as a String.
     */
    String getRoomNumber();

    /**
     * Retrieves the maximum capacity of the room.
     *
     * @return the capacity of the room as an integer.
     */
    int getCapacity();

      /**
     * Books the room for a specified date and time.
     *
     * @param date the date for the booking in the format "YYYY-MM-DD".
     * @param time the time for the booking in the format "HH:MM".
     */
    void book(String date, String time);

    /**
     * Displays detailed information about the room,
     * including its type, capacity, and any additional features.
     */
    void displayRoomInfo();

    
}