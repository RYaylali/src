import java.util.Scanner;


public class main {
    public static void main(String[] args ){
        double tutar , kdvOran=0.18;
        Scanner input = new Scanner(System.in);

        System.out.print("Tutarı giriniz:");
        tutar=input.nextDouble();
        double kdvtütari = tutar*kdvOran + tutar;
        System.out.println(kdvtütari);





    }
}