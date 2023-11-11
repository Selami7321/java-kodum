import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, sayi = 0;
        int max = 0, min = 999999999;
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz:");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i + ". sayıyı giriniz:");
            sayi = input.nextInt();

            if (sayi >= max) {
                max = sayi;
            }

            if (sayi <= min) {
                min = sayi;
            }
        }

        System.out.println("Girilen sayıların en büyüğü: " + max);
        System.out.println("Girilen sayıların en küçüğü: " + min);
    }
}


