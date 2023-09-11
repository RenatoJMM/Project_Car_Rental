package Controller;

import Domain.TypeOfVehicle;
import Domain.Vehicle;
import Service.VehicleService;
import Utils.ScannerSC;

public class UpdateVehicle {

    public static void execute(VehicleService vehicleService) {

        ScannerSC.clearCache();
        Vehicle vehicle;
        while (true) {
            String plate = ScannerSC.readString("Enter the PLATE of the Vehicle you want to update:");
            vehicle = vehicleService.findByPlate(plate);

            if (!(vehicle == null)) {
                if (vehicle.isAvailable()) {
                    break;
                }
            }
            System.out.println("\nPlease, type another plate!");
        }

        String name = ScannerSC.readString("\nEnter the Vehicle name: (Old: " + vehicle.getName() + ").");

        String engine = ScannerSC.readString("\nEnter the Vehicle engine: (Old: " + vehicle.getEngine() + ").");

        System.out.println("\nChoose Vehicle Category: (Old: " + vehicle.getType().getDescription() + ").");

        TypeOfVehicle type = ShowTypeVehicle.execute();

        ScannerSC.clearCache();

        String plate;

        while (true) {
            plate = ScannerSC.readString("\nEnter the Vehicle Registration Plate: (Old: " + vehicle.getPlate() + ").");

            if (vehicleService.verify(plate) || plate.equals(vehicle.getPlate())) {
                break;
            }
            System.out.println("Plate already used!");
        }

        vehicleService.update(vehicle, name, engine, type, plate);

        System.out.println("Vehicle Updated Successfully!");

    }
}
