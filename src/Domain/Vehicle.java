package Domain;

public class Vehicle {

    private final int ID;
    private String name;
    private String engine;
    private TypeOfVehicle type;
    private String plate;
    private boolean available;

    public Vehicle(int id, String name, String engine, TypeOfVehicle type, String plate) {
        this.ID = id;
        this.name = name;
        this.engine = engine;
        this.type = type;
        this.plate = plate;
        this.available = true;
    }

    @Override
    public String toString() {

        return "Vehicle: " + this.name + " / Engine: " + this.engine + " / Category: " + this.type.getDescription()
                + " / Plate: " + this.plate + " / Available : " + ((available == true) ? "Yes" : "No");
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public TypeOfVehicle getType() {
        return type;
    }

    public void setType(TypeOfVehicle type) {
        this.type = type;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

}
