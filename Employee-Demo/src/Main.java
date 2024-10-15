import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("**********UYGULAMAYA HOŞGELDİNİZ****************");

        Scanner scanner = new Scanner(System.in);

        System.out.print("No değerini giriniz: ");
        int no = scanner.nextInt();
        scanner.nextLine();

        System.out.print("İsim değerini giriniz: ");
        String isim = scanner.nextLine();

        System.out.print("Soyisim değerini giriniz: ");
        String soyisim = scanner.nextLine();

        System.out.print("Tecrübe değerini giriniz: ");
        int tecrube = scanner.nextInt();


        System.out.print("Maaş değerini giriniz: ");
        double maas = scanner.nextDouble();
        scanner.nextLine();

        Calisan calisan = new Calisan(no, isim, soyisim, tecrube, maas);

        String islemler = "1. Çalışan Bilgileri\n"
                + "2. Zam Yap\n"
                + "3. Format At\n"
                + "Çıkış için 4'e basınız.";
        System.out.println("----------------------------------------");
        System.out.println(islemler);
        System.out.print("Seçiminiz: ");
        int secim = scanner.nextInt();
        scanner.nextLine();

        switch (secim) {
            case 1:
                calisan.calisanBilgileriGoster();
                break;

            case 2:
                System.out.print("Yapılacak zam miktarını giriniz: ");
                int zamDegeri = scanner.nextInt();
                scanner.nextLine();
                calisan.zamYap(zamDegeri);
                break;

            case 3:
                System.out.print("Format atacak kişinin ismini giriniz: ");
                String kim = scanner.nextLine();

                System.out.print("İşletim sistemi giriniz: ");
                String isletimSistemi = scanner.nextLine();
                calisan.formatAt(isletimSistemi, kim);
                break;

            case 4:
                System.out.println("Programdan çıkılıyor...");
                break;

            default:
                System.out.println("Geçersiz işlem.");
                break;
        }

    }
}