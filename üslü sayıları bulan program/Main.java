import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner input= new Scanner(System.in);
int us,ussunusu;
int total=1;
System.out.println("üssü alınacak sayıyı giriniz:");
us=input.nextInt();
System.out.println("üssün üssü olacak sayıyı giriniz:");
ussunusu=input.nextInt();
for(int i=1;i<=ussunusu;i++){
    total *=us;
}
System.out.println("üssü alinan sayının sonucu:" + total);

    }
}