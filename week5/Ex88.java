package week5;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex88 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.print("name: ");
            String name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("studentnumber: ");
            String number = reader.nextLine();
            list.add(new Student(name, number));
        }

        for (Student student : list) {
            System.out.println(student);
        }

        System.out.println();

        System.out.print("Give search term: ");
        String searchTerm = reader.nextLine();
        System.out.println("Result:");

        for (Student student : list) {
            if (student.getName().contains(searchTerm)) {
                System.out.println(student);
            }
        }
    }
}
