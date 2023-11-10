import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
  int sayi;
   int gecicisayi;
  int deger=1;
  int total=0;
   Scanner input= new Scanner(System.in);
   System.out.println("bir sayi giriniz:");
   sayi=input.nextInt();
  gecicisayi=sayi;
   while(gecicisayi!=0){

        deger=gecicisayi%10;
total=total+deger;
  gecicisayi/=10;
   }
   System.out.println(" girilen sayinin basamaklarinin toplami:" + total);




    }
}