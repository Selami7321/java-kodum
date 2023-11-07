import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    boolean kiyas=false;
        int ay,gun;
Scanner input = new Scanner(System.in);
System.out.println("dogdugunuz ayı giriniz :");
ay=input.nextInt();
System.out.println("dogdugunuz gunu girin:");
gun=input.nextInt();
if(ay==1) {
    if (gun >= 1 && gun <= 31) {
        if (gun <= 21) {
            System.out.println("oglak burcusunuz ");
        }else{
            System.out.println("kova burcusunuz");

        }
    }
    if(ay==2){
        if(gun<=19){
            System.out.println("kova burcusunuz");
        }else{
            System.out.println("balık burcusunuz");

        }
    }
    if(ay==3){
        if(gun<=20){
            System.out.println("balık burcusunuz");
        }else{
            System.out.println("koc burcusunuz");
        }
    }
    if(ay==4){
       if(gun<=20){
        System.out.println("koc burcusunuz");}
       else{
           System.out.println("boga burcusunuz");
       }
    }
    if(ay==5){
        if(gun<=21){
            System.out.println("boga burcusunuz");
        }else{
            System.out.println("ikizler burcusunuz");
        }
    }
    if(ay==6){
        if(gun<=22){
            System.out.println("ikizler burcusunuz");
        }else{
            System.out.println("yengec burcusunuz");
        }
    }if(ay==7){
        if(gun<=22){
            System.out.println("yengec burcusunuz");
        }else{
            System.out.println("aslan burcusunuz");
        }
    }if(ay==8){
        if(gun<=22){
            System.out.println("aslan burcusunuz");

        }else{
            System.out.println("başak burcusunuz");
        }
    }if(ay==9){
        if(gun<=22){
            System.out.println("başak burcusunuz");
        }else{
            System.out.println("terazi burcusunuz");
        }
    }if(ay==10){
        if(gun<=23){
            System.out.println("terazi burcusunuz");
        }else{
            System.out.println("akrep burcusunuz");
        }
    }if(ay==11){
        if(gun<=21){
            System.out.println("akrep burcusunuz");
        }else{
            System.out.println("yay burcusunuz");
        }
    }if(ay==12){
        if(gun<=21){
            System.out.println("yay burcusunuz");
        }else{
            System.out.println("oglak burcusunuz");
        }
    }

}


    }
}