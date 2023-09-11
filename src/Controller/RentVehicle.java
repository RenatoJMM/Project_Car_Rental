package Controller;

import java.time.LocalDateTime;

import Domain.Person;
import Domain.Vehicle;
import Service.LegalEntityService;
import Service.NaturalPersonService;
import Service.RentService;
import Service.VehicleService;
import Utils.ScannerSC;

public class RentVehicle {

    public static void execute(VehicleService vehicleService, NaturalPersonService naturalPersonService,
            LegalEntityService legalEntityService, RentService rentService) {
        System.out.println("\n------------ Rent Vehicle ------------\n");

        System.out.println(vehicleService.listAvailables());

        Vehicle vehicle;
        ScannerSC.clearCache();

        while (true) {
            String plate = ScannerSC.readString("\nChose one of the Vehicles, typing it's PLATE:");
            vehicle = vehicleService.findByPlate(plate);

            if (!(vehicle == null)) {
                if (vehicle.isAvailable()) {
                    break;
                }
            }
            System.out.println("\nPlease, type another plate!");
        }

        String location = ScannerSC.readString("\nLocal where the vehicle will be picked up: ");

        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("\nChoose Customer that will rent the vehicle:");
        int option = ShowCustomersRent.execute(naturalPersonService, legalEntityService);

        String document;
        Person person;

        ScannerSC.clearCache();
        if (option == 1) {
            while (true) {
                document = ScannerSC.readString("\nChoose the Customer typing it's CPF");
                person = naturalPersonService.findbyCPF(document);
                if (!(person == null)) {
                    break;
                }
                System.out.println("\nPlease, type another CPF!");
            }
            rentService.create(location, dateTime, vehicle, person);
        } else {
            while (true) {
                document = ScannerSC.readString("\nChoose the Customer typing it's CNPJ");
                person = legalEntityService.findByCNPJ(document);
                if (!(person == null)) {
                    break;
                }
                System.out.println("\nPlease, type another CNPJ!");
            }
            rentService.create(location, dateTime, vehicle, person);
        }

        System.out.println("Rent Created Sucessfully!");
    }

}
