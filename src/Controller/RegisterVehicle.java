package Controller;

import Domain.TypeOfVehicle;
import Service.VehicleService;
import Utils.ScannerSC;

public class RegisterVehicle {

    public static void execute(VehicleService vehicleService) {

        ScannerSC.clearCache();
        System.out.println("\n------------ Register Vehicle ------------\n");

        String name = ScannerSC.readString("Name of the Vehicle:");

        String engine = ScannerSC.readString("Vehicle Engine:");

        TypeOfVehicle type = ShowTypeVehicle.execute();
        ScannerSC.clearCache();

        String plate;
        while (true) {
            plate = ScannerSC.readString("Type Vehicle Registration Plate:");
            if (vehicleService.verify(plate)) {
                break;
            }
            System.out.println("Plate already used!");
        }

        vehicleService.create(name, engine, type, plate);

        System.out.println("Vehicle Created Sucessfully!");
    }

}
