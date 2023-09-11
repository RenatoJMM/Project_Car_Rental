package Controller;

import Service.LegalEntityService;
import Service.NaturalPersonService;
import Utils.ScannerSC;

public class ShowCustomers {

    public static void execute(NaturalPersonService naturalPersonService, LegalEntityService legalEntityService) {

        System.out.println("\n------------ Registered Customers ------------\n");

        int option = ShowCustomersRent.execute(naturalPersonService, legalEntityService);

        System.out.println("\nOptions:");
        System.out.println("1- Back.");
        System.out.println("2- Update Customer.");

        int option2 = ScannerSC.readInt("\nChoose: (1 or 2)");

        if (option2 == 2) {
            UpdateCustomer.execute(naturalPersonService, legalEntityService, option);
        }
    }

}
