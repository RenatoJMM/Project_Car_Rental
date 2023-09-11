package Controller;

import Service.LegalEntityService;
import Service.NaturalPersonService;

import Utils.*;

public class RegisterCustomer {

    public static void execute(NaturalPersonService naturalPersonService, LegalEntityService legalEntityService) {

        System.out.println("\n------------ Register Vehicle ------------\n");

        int option = SelectCustomer.execute();

        ScannerSC.clearCache();

        String name = ScannerSC.readString("Name of the Customer:");

        String phone = ScannerSC.readString("Phone Number:");

        String email = ScannerSC.readString("Contact E-mail:");

        if (option == 1) {
            String cpf;

            while (true) {
                cpf = ScannerSC.readString("CPF: ");
                if (naturalPersonService.verify(cpf)) {
                    break;
                }
                System.out.println("\nCPF already used!\n");
            }

            naturalPersonService.create(name, phone, email, cpf);

        } else {
            String cnpj;

            while (true) {
                cnpj = ScannerSC.readString("CNPJ: ");
                if (legalEntityService.verify(cnpj)) {
                    break;
                }
                System.out.println("\nCNPJ already used!\n");
            }

            legalEntityService.create(name, phone, email, cnpj);
        }

        System.out.println("Customer Created Sucessfully!");

    }

}
