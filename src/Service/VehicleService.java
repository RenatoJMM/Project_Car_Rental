package Service;

import Repository.VehicleRepository;
import Domain.Vehicle;

import Domain.TypeOfVehicle;

public class VehicleService {

    private static int COUNTER_ID;
    private static VehicleRepository repo;

    public VehicleService() {
        repo = new VehicleRepository();
    }

    public void create(String name, String engine, TypeOfVehicle type, String plate) {
        Vehicle vehicle = new Vehicle(COUNTER_ID, name, engine, type, plate);
        repo.create(vehicle);
        COUNTER_ID++;
    }

    public void update(Vehicle vehicle, String name, String engine, TypeOfVehicle type, String plate) {
        repo.update(vehicle, name, engine, type, plate);
    }

    public String listByName(String name) {
        return repo.listByName(name);
    }

    public Vehicle findByPlate(String plate) {
        return repo.findByPlate(plate);
    }

    public void delete(Vehicle vehicle) {
        repo.delete(vehicle);
    }

    public boolean verify(String plate) {
        return findByPlate(plate) == null;
    }

    public boolean isAvailable(Vehicle vehicle) {
        return vehicle.isAvailable();

    }

    public String listAll() {
        return repo.toString();
    }

    public String listAvailables() {
        return repo.listAvailables();
    }

}
