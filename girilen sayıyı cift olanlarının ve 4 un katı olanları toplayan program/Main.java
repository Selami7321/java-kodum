import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     int k;
     double total=0;
     Scanner input = new Scanner(System.in);
     do {
         System.out.println("bir sayi giriniz:");
         k = input.nextInt();
         if (k % 2 == 0 && k % 4 == 0) {
             total = total + k;
         }

     } while (k % 2 == 0) ;
        System.out.println("toplam:" + total);

    }

}