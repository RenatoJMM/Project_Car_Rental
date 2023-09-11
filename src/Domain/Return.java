package Domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Return {

    private final int ID;
    private String location;
    private LocalDateTime dateTime;
    private Rent rent;

    public Return(int ID, String location, LocalDateTime dateTime, Rent rent) {
        this.ID = ID;
        this.location = location;
        this.dateTime = dateTime;
        this.rent = rent;
    }

    public int getID() {
        return ID;
    }

    public String getLocation() {
        return location;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Rent getRent() {
        return rent;
    }

    @Override
    public String toString() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        return "Returned at: " + this.location + " / Day and Time: " + this.dateTime.format(dateTimeFormatter);
    }
}
