import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int nmb, total = 0, rem, n;


            System.out.print("sayı giriniz: ");
            nmb = inp.nextInt();

            for (int i = 1; i < nmb; i++) {

                rem = nmb % i;

                if (rem == 0) {
                    total += i;
                }
            }

            System.out.println(nmb == total ? nmb + " Bu sayı Mükemmel sayıdır." : nmb + " Bu sayı Mükemmel sayı değildir.");
        }
    }



