import java.util.Scanner;

public class NOTORTALAMASI {
    public static void main(String[] args){

        int mat , fizik , kimya , turkce , tarih, müzik;


        Scanner not = new Scanner(System.in);
        System.out.print("Matematik notunu giriniz...");

        mat=not.nextInt();

        System.out.print("fizik notunu giriniz...");

        fizik=not.nextInt();

        System.out.print("kimya notunu giriniz...");

        kimya=not.nextInt();

        System.out.print("Türkçe notunu giriniz...");

        turkce=not.nextInt();


        System.out.print("tarih notunu giriniz...");

        tarih=not.nextInt();

        System.out.print("Müzik notunu giriniz...");

        müzik=not.nextInt();



               double ort;

                ort = (mat+fizik+kimya+turkce+tarih+müzik)/6;


        System.out.print("Not ortalamanız:"+ort);










    }




}
