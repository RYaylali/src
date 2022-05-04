import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        double pi=3.14, r , a ;

        Scanner girdi = new Scanner(System.in);


        System.out.println("dairenin yarıçapını girin: ");
        r=girdi.nextDouble();
        System.out.println("Kaç derecelik dilim ");
        a= girdi.nextDouble();
        double alan  = (pi*r*r*a)/360;
        System.out.println(a+"lık alanı: " + alan);




    }
}