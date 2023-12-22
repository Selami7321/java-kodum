import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int tahmin;
    int hak=0;
    int [] wrong=new int[5];
    boolean isWin=false;
    boolean isGameover=false;
        Scanner input= new Scanner(System.in);
Random ran=new Random();
int sayi=ran.nextInt(100);

while(hak<5) {
    System.out.println("lütfen tahmininzi giriniz: ");
    tahmin = input.nextInt();

    if (tahmin < 0 || tahmin > 99) {
        System.out.println("yanlış aralıkta tahminde bulundunuz : ");
        if (isGameover) {
            hak++;
            System.out.println("çok fazla hatalı giriş yaptınız kalan hak:" + (5 - hak));
        } else {
            isGameover = true;
            System.out.println("bir dahaki hatalı girişinizde hakkınızdan düşülecektir");
        }
        continue;
    }
    if (tahmin == sayi) {
        System.out.println("Tebrikler doğru tahmin doğru tahmin edinilen sayı : " + sayi);
        isWin = true;
        break;
    } else {
        System.out.println("Hatalı sayı girdiniz : ");
        if (tahmin > sayi) {
            System.out.println("girdiğiniz sayı belirlenen sayıdan yüksektir tahmininizi düşürünüz:");

        } else {
            System.out.println("girilen sayı belirlenen sayıdan küçüktür tahmininizi arttırınız:");
        }
        wrong[hak++] = tahmin;
        System.out.println("kalan hakkınız: " + (5-hak));
    }
}
if(!isWin){
    System.out.println("YOU ARE LOSER");
    System.out.println("DOĞRU SEÇENEK: "+ sayi);
    if(!isGameover){
        System.out.println("tahminleriniz:"+ Arrays.toString(wrong));
    }
}







    }
}