package Controller;

import Service.LegalEntityService;
import Service.NaturalPersonService;
import Service.RentService;
import Service.ReturnService;
import Service.VehicleService;
import Utils.*;

public class Menu {

    private VehicleService vehicleService;
    private NaturalPersonService naturalPersonService;
    private LegalEntityService legalEntityService;
    private RentService rentService;
    private ReturnService returnService;

    public Menu() {
        this.vehicleService = new VehicleService();
        this.naturalPersonService = new NaturalPersonService();
        this.legalEntityService = new LegalEntityService();
        this.rentService = new RentService();
        this.returnService = new ReturnService();
    }

    public int execute() {
        System.out.println("\n------------ Menu Car Rental ------------\n");
        System.out.println("1- Register Vehicle.");
        System.out.println("2- View all Vehicles.");
        System.out.println("3- Register Customer.");
        System.out.println("4- View all Customers.");
        System.out.println("5- Rent a Vehicle.");
        System.out.println("6- View Rent Historic.");
        System.out.println("7- Return Vehicle.");
        System.out.println("8- Exit.\n");

        int answer = 0;

        while (true) {

            answer = ScannerSC.readInt("Desired Option : (Type only integers, 1 to 8)");

            if (answer > 0 && answer <= 8) {
                break;
            }
        }

        return answer;
    }

    public VehicleService getVehicleService() {
        return vehicleService;
    }

    public NaturalPersonService getNaturalPersonService() {
        return naturalPersonService;
    }

    public LegalEntityService getLegalEntityService() {
        return legalEntityService;
    }

    public RentService getRentService() {
        return rentService;
    }

    public ReturnService getReturnService() {
        return returnService;
    }

}
