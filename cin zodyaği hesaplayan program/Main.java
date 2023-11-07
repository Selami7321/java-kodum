import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 int dogumyili;
 Scanner input = new Scanner(System.in);
 System.out.println("dogum yilinizi giriniz:");
 dogumyili=input.nextInt();
 if(dogumyili%12==0){
     System.out.println("Maymun");
 }else if(dogumyili%12==1){
     System.out.println("Horoz");

 }else if(dogumyili%12==2){
     System.out.println("Köpek");
 }else if(dogumyili%12==3){
     System.out.println("Domuz");
 }else if(dogumyili%12==4){
     System.out.println("Fare");
 }else if(dogumyili%12==5){
     System.out.println("Öküz");
 }else if (dogumyili%12==6){
     System.out.println("Kaplan");

 }else if(dogumyili%12==7){
     System.out.println("Tavşan");

 }else if(dogumyili%12==8){
     System.out.println("Ejderha");

 }else if(dogumyili%12==9){
     System.out.println("Yılan");
 }else if(dogumyili%12==10){
     System.out.println("At");
 }else if(dogumyili%12==11){
     System.out.println("Koyun");
 }



    }
}