import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner input= new Scanner(System.in);
int sayi1,sayi2;
int ebob=1,ekok=1;
System.out.println("ilk sayıyı giriniz:");
sayi1=input.nextInt();
System.out.println("ikinci sayiyi giriniz:");
sayi2=input.nextInt();
if(sayi1<=sayi2){
    int i=sayi1;
    while(i>=sayi1){
        if(i%sayi1==0 ){
           ebob=i;
           i--;
        }
    }

System.out.println(" Girilen sayıların en büyük böleni:" + ebob);}
else{
    int j=sayi2;
    while(j>=sayi2){
        if(j%sayi2==0){
            ebob=j;
            j--;
        }
    }
    System.out.println("Girilen sayıların en büyük ortak katı: " + ebob);
}
ekok=(sayi1*sayi2)/(ebob);
    System.out.println("Girilen sayıların en küçük ortak katı:" + ekok );
}
    }

