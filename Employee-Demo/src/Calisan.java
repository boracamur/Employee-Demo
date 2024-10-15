public class Calisan {

    public int no;
    public String isim;
    public String soyisim;
    public int tecrube;
    public double maas;

    public Calisan(int no, String isim, String soyisim, int tecrube, double maas){
        this.no = no;
        this.isim = isim;
        this.soyisim = soyisim;
        this.tecrube = tecrube;
        this.maas = maas;
    }
    public void calisanBilgileriGoster(){
        System.out.println("Çalışan Bilgileri");
        System.out.println("----------------------------------------");
        System.out.println("Çalışanın Numarası: " + no);
        System.out.println("Çalışanın İsmi: " + isim);
        System.out.println("Çalışanın Soyismi: " + soyisim);
        System.out.println("Çalışanın Tecrübesi: " + tecrube);
        System.out.println("Çalışanın Maaşı: " + maas);

    }
    public void zamYap(int zamDegeri){
        System.out.println("Maaşınıza "+ zamDegeri + " TL zam yapıldı.");
        System.out.println("Yeni maaşınız: " + (maas + zamDegeri));
    }
    public void formatAt(String isletimSistemi, String kim){
        System.out.println(isletimSistemi + " işletim sistemine " + kim + " format atıyor...");
    }

}
