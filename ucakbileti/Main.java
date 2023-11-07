import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
int yas;
double sabitucret=0.10;
double mesafe;
int  tekyon=1,gidisdonus=2;
double ucustotal;
int secim;

Scanner input= new Scanner(System.in);
System.out.println("mesafe degerini giriniz:");
mesafe=input.nextDouble();
        ucustotal=mesafe * sabitucret;
System.out.println("yas degerini giriniz:");
yas=input.nextInt();
System.out.println("1)tekyon\n2)gidisdonus\n");
System.out.println("lutfen yolculuk tipini yukardaki degerlere uygun giriniz:");

secim=input.nextInt();

     if(secim!=1 && secim !=2) {
         System.out.println("hatalı deger girdiniz:");
     }
if(secim == 1){
    if(yas<12){
        System.out.println("odeceginiz ucret:" + (ucustotal/2.0));

    }else if( yas<=24){
        System.out.println("odenecek tutar:" + (ucustotal * (9.0/10)));
    }else if(yas>65){
        System.out.println("odenecek tutar:"+ (ucustotal*(7.0/10)));

    }
} else if(secim == 2) {
    if(yas<12){
        System.out.println("odeceginiz ucret:" +((4.0/5) * ucustotal/2.0));

    }else if( yas<=24){
        System.out.println("odenecek tutar:" +((4.0/5)* ucustotal * (9.0/10)));
    }else if(yas>65){
        System.out.println("odenecek tutar:"+((4.0/5) * ucustotal*(7.0/10)));

    }
}

















    }
}