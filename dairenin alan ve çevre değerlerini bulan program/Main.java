import java. util. Scanner;



public class Main {
    public static void main(String[] args) {
     int yaricap;
     double pi=3.14;

     Scanner inp = new Scanner(System.in);
        System.out.println("yaricap degerini giriniz:");
     yaricap=inp.nextInt();
        double alan=pi*yaricap*yaricap;
        double cevre=pi*2*yaricap;

     System.out.println("dairenin alanı :" + alan);
     System.out.println("dairenin cevresi: " + cevre);




    }
}