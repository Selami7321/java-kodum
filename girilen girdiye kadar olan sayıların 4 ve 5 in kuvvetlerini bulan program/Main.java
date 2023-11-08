import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
        int k;
  System.out.println("bir sayi giriniz:");
  k=input.nextInt();
  for(int i=1;i<=k;i*=4){
      System.out.println(i);
  }
for(int i=1;i<=k;i*=5){
    System.out.println(i);
}



    }
}