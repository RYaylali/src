import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double boy, kilo;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu girinizi(metre): ");
        boy=girdi.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz(kg): ");
        kilo=girdi.nextDouble();
        double vke = kilo / (boy*boy);
        System.out.println("Vücut kitle endeksiniz = " + vke);
    }
}
