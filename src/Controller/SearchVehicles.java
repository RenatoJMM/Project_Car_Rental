package Controller;

import Service.VehicleService;
import Utils.ScannerSC;

public class SearchVehicles {

    public static void execute(VehicleService vehicleService) {
        ScannerSC.clearCache();
        System.out.println("\n------------ Search Vehicles ------------\n");
        String name = ScannerSC.readString("Vehicle Name:");

        System.out.println("Results:");
        System.out.println(vehicleService.listByName(name));

        System.out.println("\nOptions:");
        System.out.println("1- Back.");
        System.out.println("2- Search another Vehicle by name.");
        System.out.println("3- Alterar Veículo.");

        int option = ScannerSC.readInt("\nChoose: (1 to 3)");

        if (option == 2) {
            SearchVehicles.execute(vehicleService);
        } else if (option == 3) {
            UpdateVehicle.execute(vehicleService);
        }

    }

}
