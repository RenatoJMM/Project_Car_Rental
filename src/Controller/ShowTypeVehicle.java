package Controller;

import Domain.TypeOfVehicle;
import Utils.ScannerSC;

public class ShowTypeVehicle {

    public static TypeOfVehicle execute() {
        TypeOfVehicle[] cat = TypeOfVehicle.values();

        System.out.println("Available Categories of Vehicle:");

        for (int i = 0; i < TypeOfVehicle.values().length; i++) {
            System.out.println((i + 1) + "- " + cat[i]);
        }

        int option = 0;

        while (true) {
            option = ScannerSC.readInt("Choose a category: (1 to 3)");

            if (option > 0 && option <= 3) {
                break;
            }
        }
        return cat[option - 1];
    }

}
