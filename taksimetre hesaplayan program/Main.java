import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km;
double perkm=2.20,total,startprice=10;

        Scanner input=new Scanner(System.in);
System.out.println("mesafeyi KM cinsinden giriniz");
km=input.nextInt();
total = (km*perkm);
total +=startprice;
total=(total<20) ? 20 : total;
System.out.println("toplam tutar:" +total);

    }
}