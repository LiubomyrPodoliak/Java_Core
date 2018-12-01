package pt2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter surname, name, patronymic");
        Scanner scanner = new Scanner(System.in);

        String snp = scanner.nextLine();

        String[] splitSnp = snp.split("\\s+");
        System.out.println("Surname and initials: "
                + splitSnp[0]
                + " " + splitSnp[1].substring(0,1) + "."
                + " " + splitSnp[2].substring(0, 1) + ".");

        System.out.println("Name:" + splitSnp[1]);

        System.out.println("Name, Patronymic, Surname :"
                + splitSnp[1] + " "
                + splitSnp[2] + " "
                + splitSnp[0]);


    }
}
