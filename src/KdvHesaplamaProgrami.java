import java.util.Scanner;


public class KdvHesaplamaProgrami {
    public static void main(String[] args) {
        double tutar, kdvOran, kdvTutari, kdvliTutar;
        boolean kdvDurum;

        Scanner input = new Scanner(System.in);
        System.out.println("Tutarı Giriniz: ");
        tutar = input.nextDouble();

        kdvDurum = (0<tutar) && (1000>tutar);
        kdvOran = kdvDurum ? 0.18 : 0.08;
        kdvTutari = tutar*kdvOran;
        kdvliTutar= tutar+kdvTutari;

        System.out.println("KDV'siz Tutar:"+ tutar);
        System.out.println("KDV Oranı:"+ kdvOran);
        System.out.println("KDV Tutarı:"+kdvTutari);
        System.out.println("KDV'li Tutar:"+kdvliTutar);





    }
}
