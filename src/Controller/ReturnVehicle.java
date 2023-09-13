package Controller;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import Domain.LegalEntity;
import Domain.NaturalPerson;
import Domain.Rent;
import Service.RentService;
import Service.ReturnService;
import Utils.ScannerSC;

public class ReturnVehicle {

    public static void execute(ReturnService returnService, RentService rentService) {

        System.out.println("\n------------ Return Vehicle ------------");

        System.out.println(rentService.listOpens());

        Rent rent;

        while (true) {
            int id = ScannerSC.readInt("\nChose one of the Rentals, typing it's ID:");
            rent = rentService.find(id);

            if (!(rent == null)) {
                if (rent.getReturnVehicle() == null) {
                    break;
                }
            }
            System.out.println("\nPlease, type another ID!");
        }

        ScannerSC.clearCache();
        String location = ScannerSC.readString("Local where the vehicle were delivered: ");

        LocalDateTime dateTime = LocalDateTime.now();

        returnService.create(location, dateTime, rent);

        System.out.println("\nReturn Made Successfully!");

        System.out.println("\n----- Order Summary -----");
        System.out.println("Vehicle: " + rent.getVehicle().getName());
        System.out.println("Person: " + rent.getPerson().getName());

        long seg = ChronoUnit.SECONDS.between(rent.getDateTime(), dateTime);

        // long numberOfDays = Math.ceilDiv(min, 1440);
        long numberOfDays = Math.ceilDiv(seg, 86400);

        BigDecimal price = rent.getVehicle().getType().getPricePerDay().multiply(new BigDecimal(numberOfDays));

        if (numberOfDays > 5 && rent.getPerson() instanceof NaturalPerson) {
            price = price.multiply(new BigDecimal("0.95"));
        } else if (numberOfDays > 3 && rent.getPerson() instanceof LegalEntity) {
            price = price.multiply(new BigDecimal("0.90"));
        }

        System.out.println("Rental Price: R$" + price);

    }

}
