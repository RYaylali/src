import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int a, b, c, u;
        Scanner deger = new Scanner(System.in);
        System.out.print("1.kenarı giriniz : ");
        a=deger.nextInt();
        System.out.print("2.kenarı giriniz : ");
        b=deger.nextInt();
        System.out.print("3.kenarı giriniz : ");
        c=deger.nextInt();

            u= (a+b+c)/2;

            double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("SONUÇ: "+ alan);


    }
}