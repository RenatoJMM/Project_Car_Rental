package Controller;

import Service.VehicleService;
import Utils.ScannerSC;

public class ShowVehicles {

    public static void execute(VehicleService vehicleService) {

        System.out.println("\n------------ Registered Vehicles ------------");
        System.out.println(vehicleService.listAll());

        System.out.println("\nOptions:");
        System.out.println("1- Back.");
        System.out.println("2- Search Vehicle by name.");
        System.out.println("3- Update Vehicle.");

        int option = ScannerSC.readInt("\nChoose: (1 to 3)");

        if (option == 2) {
            SearchVehicles.execute(vehicleService);
        } else if (option == 3) {
            UpdateVehicle.execute(vehicleService);
        }
    }

}
