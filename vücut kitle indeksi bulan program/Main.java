import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       double kilo;
       double boy;
       double vki;
       Scanner input = new Scanner(System.in);
        System.out.println("boyunuzun ölçüsünü giriniz: ");
        boy=input.nextDouble();
        System.out.println("kilonuzun degerini giriniz:");
        kilo=input.nextDouble();
        vki=kilo/(boy*boy);
System.out.println("vucut kitle indeksi degeriniz : " + vki);



    }
}