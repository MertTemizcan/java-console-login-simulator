import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Kayıt için kullanıcı adınızı giriniz: ");
        String savedUserName = scan.nextLine();

        System.out.print("Kayıt için şifrenizi giriniz: ");
        String savedPassword = scan.nextLine();

        System.out.println("\nKaydınız alınmıştır. Giriş yapınız.");

        boolean loginSuccess = false;
        int remainingAttempts = 3;

        while (!loginSuccess && remainingAttempts > 0) {

            System.out.print("Kullanıcı adı: ");
            String inputUserName = scan.nextLine();

            System.out.print("Şifre: ");
            String inputPassword = scan.nextLine();

            if (savedUserName.equals(inputUserName) && savedPassword.equals(inputPassword)) {

                System.out.println("Hoşgeldiniz sayın " + savedUserName);
                loginSuccess = true;

            } else {
                remainingAttempts--;
                System.out.println("Hatalı giriş kalan hakkınız: " + remainingAttempts);
            }
        }

        if (!loginSuccess) {
            System.out.println("Hesabınız kilitlenmiştir.");
            return;
        }

        scan.close();
    }
}