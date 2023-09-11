package Controller;

import java.util.List;

import Domain.LegalEntity;
import Domain.NaturalPerson;
import Domain.Person;
import Service.LegalEntityService;
import Service.NaturalPersonService;
import Utils.ScannerSC;

public class UpdateCustomer {

    public static void execute(NaturalPersonService naturalPersonService, LegalEntityService legalEntityService,
            int option) {

        String document;
        Person person;
        List<String> infos;

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

            infos = UpdatePerson.execute(person);

            String cpf;

            while (true) {
                cpf = ScannerSC.readString("\nEnter the CPF: (Old: " + ((NaturalPerson) person).getCpf() + ").");
                if (naturalPersonService.verify(cpf)) {
                    break;
                }
                System.out.println("\nCPF already used!\n");
            }

            naturalPersonService.update(((NaturalPerson) person), infos.get(0), infos.get(1), infos.get(2), cpf);

        } else {
            while (true) {
                document = ScannerSC.readString("\nChoose the Customer typing it's CNPJ");
                person = legalEntityService.findByCNPJ(document);
                if (!(person == null)) {
                    break;
                }
                System.out.println("\nPlease, type another CNPJ!");
            }
            infos = UpdatePerson.execute(person);

            String cnpj;

            while (true) {
                cnpj = ScannerSC.readString("\nEnter the CNPJ: (Old: " + ((LegalEntity) person).getCnpj() + ").");

                if (legalEntityService.verify(cnpj)) {
                    break;
                }
                System.out.println("\nCNPJ already used!\n");
            }

            legalEntityService.update(((LegalEntity) person), infos.get(0), infos.get(1), infos.get(2), cnpj);
        }

        System.out.println("\nCustomer Updated Successfully!");

    }

}
