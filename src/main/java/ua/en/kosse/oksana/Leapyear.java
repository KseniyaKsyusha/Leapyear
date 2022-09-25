package ua.en.kosse.oksana;

import java.util.Scanner;
//import static ua.en.kosse.oksana.NYear.god;

public class Leapyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year:");
        int i = scanner.nextInt();
        NYear.god(i);
        System.out.println(i);
    }
}
