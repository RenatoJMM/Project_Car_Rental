package Controller;

import Service.LegalEntityService;
import Service.NaturalPersonService;

public class ShowCustomersRent {

    public static int execute(NaturalPersonService naturalPersonService, LegalEntityService legalEntityService) {

        int option = SelectCustomer.execute();

        if (option == 1) {
            System.out.println("\n------------ Registered Natural Persons ------------\n");
            System.out.println(naturalPersonService.listAll());

        } else {
            System.out.println("\n------------ Registered Legal Entities ------------\n");
            System.out.println(legalEntityService.listAll());
        }

        return option;

    }

}
