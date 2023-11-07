import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //değişkenleri yazalım
        int a,b;
        double c;
       Scanner girdi=new Scanner(System.in);
      //kullanıcıdan değerleri alalım
        System.out.print("ucgenın ilk degerini giriniz:");
        a=girdi.nextInt();
        System.out.print("ucgenin ikinci kenarini giriniz:");
        b=girdi.nextInt();

        c=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs:"+c);

int alan;


alan=(a*b)/2;
System.out.println("ucgeninizin alanı:"+alan);
    }
}