import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String password2;
        String degisim;
        String password,username;
       Scanner input = new Scanner(System.in);
       System.out.print("kullanıcı adını giriniz:");
       username=input.nextLine();
       System.out.print("sifreyi giriniz:");
       password=input.nextLine();
       if(username.equals("SELAMİ") && password.equals("ÇETİN")){
           System.out.println("tebrikler giriş yaptınız ");

       }
       else {
           System.out.println("şifreyi degistirmek istermisiniz?");
           degisim=input.nextLine();


       if(degisim.equals("EVET")){
          System.out.println("lutfen sifrenizi ilk sifreden farklı olarak baska bir sifre olacak sekilde giriniz:");
          password2=input.nextLine();
           if(password2.equals("ÇETİN")){
               System.out.println("sifre olusturulamadı lutfen baska sifre giriniz :");
           }else{
               System.out.println("sifre olusturuldu");
           }
       }
    }}
}