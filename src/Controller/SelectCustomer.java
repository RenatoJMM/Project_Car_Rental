package Controller;

import Utils.*;

public class SelectCustomer {

    public static int execute() {
        System.out.println("Type of Customer:");
        System.out.println("1- Natural Person.");
        System.out.println("2- Legal Entity.");

        int option = 0;
        while (true) {
            option = ScannerSC.readInt("\nChoose: (1 or 2)");
            if (option > 0 && option <= 2) {
                break;
            }
        }

        return option;
    }

}
