package ua.en.kosse.oksana;

public class NYear {
    private int n;
    public static void god(int n){
        if (n % 4 == 0 || n%400 == 0 && n % 100 != 0 ) {
            System.out.println("leap year!");
        }
        else {
            System.out.println("Not a leap year");
        }
    }
}
