package week1;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int firstNr = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        int secondNr = Integer.parseInt(reader.nextLine());

        double result = 1.0 * firstNr / secondNr;

        System.out.println("Division: " + firstNr + " / "
                + secondNr + " = " + result);
    }

}