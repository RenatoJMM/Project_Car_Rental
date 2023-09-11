package Controller;

import Service.RentService;

public class ShowRents {

    public static void execute(RentService rentService) {

        System.out.println("\n------------ Rent Historic ------------\n");
        System.out.println(rentService.listAll());

    }

}
