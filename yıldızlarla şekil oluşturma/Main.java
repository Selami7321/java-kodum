import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
   int n;
   Scanner input= new Scanner(System.in);
   System.out.println("basamak sayısını giriniz:");
   n=input.nextInt();
   for(int i=0;i<=n;i++){
       for(int j=0;j<(n-i);j++){
           System.out.print(" ");

       }
     for(int k=1;k<=(2*i+1);k++){
         System.out.print("*");
     }
   }
for(int l=0;l<=n;l++){
    for(int m=0;m<(n-l);m++){
        System.out.print(" ");
    }
    for(int f=1;f<=(2*l+1);f++){
        System.out.print("*");
    }
}

        System.out.println(" ");

        for(int l=0;l<=n;l++){
            for(int m=0;m<(n-l);m++){
                System.out.print(" ");
            }
            for(int f=1;f<=(2*l+1);f++){
                System.out.print("*");
            }
        }

        System.out.println(" ");
        for(int l=0;l<=n;l++){
            for(int m=0;m<(n-l);m++){
                System.out.print(" ");
            }
            for(int f=1;f<=(2*l+1);f++){
                System.out.print("*");
            }
        }

        System.out.println(" ");
        for(int l=0;l<=n;l++){
            for(int m=0;m<(n-l);m++){
                System.out.print(" ");
            }
            for(int f=1;f<=(2*l+1);f++){
                System.out.print("*");
            }
        }

    }
}