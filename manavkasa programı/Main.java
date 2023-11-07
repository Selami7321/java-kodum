import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
double armut=2.14;
double elma=3.67;
double domates=1.11;
double muz=0.95;
double patlican=5.00;
double kilo;
double kilo2;
double kilo3;
double kilo4;
double kilo5;

double tutar;
Scanner input = new Scanner(System.in);

System.out.println("kac kilo armut alındı:");
kilo=input.nextDouble();
        System.out.println("kac kilo elma alındı:");
kilo2=input.nextDouble();
        System.out.println("kac kilo domates alındı:");
kilo3=input.nextDouble();
        System.out.println("kac kilo muz alındı:");
kilo4=input.nextDouble();
        System.out.println("kac kilo patlican alındı:");
kilo5=input.nextDouble();
tutar=((armut*kilo)+(elma*kilo2)+(domates*kilo3)+(muz*kilo4)+(patlican*kilo5));
System.out.println("alınan tüm meyve sebze için odenecek tutar"+tutar);





    }
}