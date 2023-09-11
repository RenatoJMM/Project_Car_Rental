import Controller.Menu;
import Controller.OptionSelector;
import Domain.TypeOfVehicle;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("\n------- Welcome to ADA LocateCar --------");

        Menu menu = new Menu();

        // DATA TEST
        menu.getVehicleService().create("Gol", "1.0", TypeOfVehicle.SMALL, "1234");
        menu.getVehicleService().create("BMW X5", "1.0", TypeOfVehicle.MEDIUM, "1236");
        menu.getVehicleService().create("BMW X1", "1.0", TypeOfVehicle.SMALL, "1238");
        menu.getVehicleService().create("BMW X100", "6.0", TypeOfVehicle.SUV, "147");

        menu.getLegalEntityService().create("Company 1", "123", "email", "0001");
        menu.getLegalEntityService().create("Company 2", "123", "email", "0002");
        menu.getLegalEntityService().create("Company 3", "123", "email", "0003");
        menu.getLegalEntityService().create("Company 4", "123", "email", "0004");

        menu.getNaturalPersonService().create("Person 1", "145", "email", "123");
        menu.getNaturalPersonService().create("Person 2", "145", "email", "1234");
        menu.getNaturalPersonService().create("Person 3", "145", "email", "12345");
        menu.getNaturalPersonService().create("Person 4", "145", "email", "123456");

        while (true) {
            int option = menu.execute();
            if (option == 8) {
                break;
            }
            OptionSelector.execute(option, menu);
        }

    }
}
