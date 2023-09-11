package Utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerSC {

    private static Scanner scanner = new Scanner(System.in);

    public static int readInt(String msg) {

        int result = 0;

        try {

            System.out.println(msg);
            result = scanner.nextInt();

        } catch (InputMismatchException e) {

            System.out.println("\nPlease type a number! Only integers values are accepted!\n");
            scanner.nextLine();

        }
        return result;
    }

    public static String readString(String msg) {

        System.out.println(msg);
        String resultado = scanner.nextLine();

        return resultado;
    }

    public static void clearCache() {
        scanner.nextLine();
    }

}
