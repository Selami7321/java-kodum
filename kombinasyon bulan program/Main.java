import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
int n,r;
  int total =1;
  int total2=1;
  int total3=1;
        Scanner input = new Scanner(System.in);
System.out.println("kombinasyonu bulmak icin n degerini giriniz:");
n=input.nextInt();
System.out.println("kombinasyon için r degerini giriniz:");
r=input.nextInt();
for(int i=1;i<=n;i++){
    total=total*i;

}
for(int k=1;k<= r;k++){
    total2=total2*k;
}for(int j=1;j<=(n-r);j++){
    total3=total3 * j;
        }
System.out.println("girilen degerlerin kombinasyonu:" + total/(total2*total3));



    }
}