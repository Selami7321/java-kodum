import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
double mat,turkce,fizik,kimya,müzik;
Scanner input= new Scanner(System.in);
System.out.println("matematik notunuzu giriniz:");
mat=input.nextDouble();
System.out.println("turkce notunuzu giriniz:");
turkce=input.nextDouble();
System.out.println("fizik notunuzu giriniz");
fizik=input.nextDouble();
System.out.println("kimya notunuzu giriniz:");
kimya=input.nextDouble();
System.out.println("muzik notunuzu giriniz:");
müzik=input.nextDouble();
double total;
double avarage;
total=(mat)+(turkce)+(fizik)+(kimya)+(müzik);
avarage=total/5;
if(mat>=0 && mat <=100 && turkce>=0 && turkce <=100  && fizik>=0 && fizik <=100  && kimya >=0 && kimya <=100 && müzik>=0 && müzik<=100 ){
    if(avarage>=55){
        System.out.println("congirilitations Geçtiniz :)");
    }else{
        System.out.println("maalesef kaldınız :(");
    }
}



    }
}