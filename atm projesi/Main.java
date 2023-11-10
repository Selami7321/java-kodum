import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password, username;
        int right = 3;
        int balance = 3000;
        int select;
        while (right > 0) {
            System.out.println("kullanıcı adınızı giriniz:");
            username = input.nextLine();
            System.out.println("şifrenizi giriniz:");
            password = input.nextLine();
            if (username.equals("SELAMİ") && password.equals("ÇETİN")) {
                System.out.println("merhabalar SELAMİ ÇETİN BANKASINA HOŞGELDİNİZ :))");
                do {
                    System.out.println("1) PARA YATIRMA\n" +
                            "2) PARA ÇEKME\n" +
                            "3) BAKİYE SORGULAMA\n" +
                            "4)ÇIKIŞ YAPMAK\n");
                    System.out.println("lütfen yukardaki menüden yapacağınız işlemi seçiniz:");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.println("Lütfen yatırmak istediğiniz para miktarını giriniz:");
                        int add = input.nextInt();
                        balance += add;

                    } else if (select == 2) {
                        System.out.println("Lütfen çekmek istediğiniz tutarı giriniz:");
                        int noadd = input.nextInt();
                        if (noadd > balance) {
                            System.out.println("Hesabınızda bu kadar tutar bulunmamakta işleminizi yapamıyoruz");
                        } else {
                            balance -= noadd;
                        }
                    } else if (select == 3) {
                        System.out.println(" Mevcut bakiyeniz: " + balance);
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere sağlıcakla kalınız:");
                break;
            } else {
                right--;

                System.out.println("Hatalı kullanıcı adı veya hatalı şifre tekrar deneyiniz :)");
                if (right == 0) {
                    System.out.println("Maximum yanlış giriş hakkınızı kullandınız ve bu yüzden hesabınız bloke olmuştur lütfen hesabınızı açmak için bizimle iletişime geçiniz");

                } else {
                    System.out.println("Kalan giriş hakkınız:" + right);

                }
            }
        }
    }
}





