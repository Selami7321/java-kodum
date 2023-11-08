import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner input =new Scanner(System.in);
int k;
double total=0;
int sayac=0;
System.out.println("lutfen bir sayi giriniz:");
k=input.nextInt();
for(int i=0;i<=k;i++){
    if(i%3==0 && i%4==0 && i!=0){
      total=total+i;
sayac+=1;


    }
}
System.out.println("toplanan sayilarin ortalamasi:" + total/sayac);





    }
}