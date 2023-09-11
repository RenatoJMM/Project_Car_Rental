package Repository;

import java.util.ArrayList;
import java.util.List;

import Domain.TypeOfVehicle;
import Domain.Vehicle;

public class VehicleRepository implements Repository<Vehicle> {

    private static List<Vehicle> list;

    public VehicleRepository() {
        list = new ArrayList<Vehicle>();
    }

    public String listByName(String name) {
        List<Vehicle> listVeh = new ArrayList<>();

        for (Vehicle x : list) {
            if (x.getName().toLowerCase().contains(name.toLowerCase())) {
                listVeh.add(x);
            }
        }

        String result = "";

        if (listVeh.isEmpty()) {
            result += "There are no vehicles with this name!";
        } else {
            for (int i = 0; i < listVeh.size(); i++) {
                result += "\n" + (i + 1) + "- " + listVeh.get(i);
            }
        }

        return result;
    }

    public Vehicle findByPlate(String plate) {
        for (Vehicle x : list) {
            if (x.getPlate().equalsIgnoreCase(plate)) {
                return x;
            }
        }
        return null;
    }

    @Override
    public List<Vehicle> findAll() {
        return list;
    }

    @Override
    public void create(Vehicle obj) {
        list.add(obj);
    }

    @Override
    public void delete(Vehicle obj) {
        list.remove(obj);
    }

    public void update(Vehicle vehicle, String name, String engine, TypeOfVehicle type, String plate) {
        vehicle.setName(name);
        vehicle.setEngine(engine);
        vehicle.setType(type);
        vehicle.setPlate(plate);
    }

    @Override
    public String toString() {
        String result = "";
        if (list.isEmpty()) {
            result += "There are no registered vehicles!";
        } else {
            for (int i = 0; i < list.size(); i++) {
                result += "\n" + (i + 1) + "- " + list.get(i);
            }
        }
        return result;
    }

    public String listAvailables() {
        String result = "Available Vehicles:";
        int count = 0;

        if (list.isEmpty()) {

            result += "\nThere are no registered vehicles!";

        } else {

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).isAvailable()) {
                    result += "\n" + (i + 1) + "- " + list.get(i);
                    count++;
                }
            }

            if (count == 0) {
                result += "\nThere are no available vehicles!";
            }
        }
        return result;

    }

}
