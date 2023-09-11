package Domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Rent {

    private final int ID;
    private String location;
    private LocalDateTime dateTime;
    private Vehicle vehicle;
    private Person person;
    private Return returnVehicle;

    public Rent(int ID, String location, LocalDateTime dateTime, Vehicle vehicle, Person person) {
        this.ID = ID;
        this.location = location;
        this.dateTime = dateTime;
        this.vehicle = vehicle;
        this.person = person;
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

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Return getReturnVehicle() {
        return returnVehicle;
    }

    public void setReturnVehicle(Return returnVehicle) {
        this.returnVehicle = returnVehicle;
    }

    @Override
    public String toString() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String result = "RENT DETAILS:\n.ID:" + this.ID + "\n.Customer: " + this.person + "\n.Vehicle: " + this.vehicle
                + "\n.Location: " + this.location + " / Date and Time: " + this.dateTime.format(dateTimeFormatter);

        if (returnVehicle == null) {
            result += "\n.Not yet returned!";
        } else {
            result += "\n." + this.returnVehicle;
        }

        return result;
    }

}
