import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String pesel = "";
        String name = "";
        String surname = "";
        Boolean systemRun = true;
        List<Person> personsToXml = new ArrayList();
        People people = new People(personsToXml);


        while (systemRun) {
            System.out.println("1 - new person, 2 - save ,0 - quit.");
            int number = sc.nextInt();

            switch (number) {
                case 1:

                    System.out.println("Enter name: ");
                    name = sc.next();
                    System.out.println("Enter surname: ");
                    surname = sc.next();
                    do {
                        System.out.println("Enter PESEL: ");
                        pesel = sc.next();
                    }
                    while (!Pesel.sprawdz(pesel));

                    Person person = new Person(name, surname, pesel);
                    personsToXml.add(person);
                    System.out.println(person);
                    break;
                case 2:
                    ObjectMapper mapper = new XmlMapper();
                    mapper.writeValue(new FileOutputStream("people.xml"), personsToXml);
                case 0:
                    systemRun = false;
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }
    }


}

