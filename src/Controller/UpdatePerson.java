package Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domain.Person;
import Utils.ScannerSC;

public class UpdatePerson {

    public static List<String> execute(Person person) {

        List<String> infos = new ArrayList<>();

        String name = ScannerSC.readString("\nEnter the Name: (Old: " + person.getName() + ").");

        String phone = ScannerSC
                .readString("\nEnter the Contact Phone Number: (Old: " + person.getPhoneNumber() + ").");

        String email = ScannerSC.readString("\nEnter the Contact E-mail: (Old: " + person.getEmail() + ").");

        Collections.addAll(infos, name, phone, email);

        return infos;

    }

}
