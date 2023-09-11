package Controller;

public class OptionSelector {

    public static void execute(int option, Menu menu) {

        switch (option) {
            case 1 -> RegisterVehicle.execute(menu.getVehicleService());
            case 2 -> ShowVehicles.execute(menu.getVehicleService());
            case 3 -> RegisterCustomer.execute(menu.getNaturalPersonService(), menu.getLegalEntityService());
            case 4 -> ShowCustomers.execute(menu.getNaturalPersonService(), menu.getLegalEntityService());
            case 5 -> RentVehicle.execute(menu.getVehicleService(), menu.getNaturalPersonService(),
                    menu.getLegalEntityService(), menu.getRentService());
            case 6 -> ShowRents.execute(menu.getRentService());
            case 7 -> ReturnVehicle.execute(menu.getReturnService(), menu.getRentService());
        }
    }

}
