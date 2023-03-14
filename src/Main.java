import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvOrani, kdvTutari,kdv1=0.18,kdv2=0.08,kdvliTutar;
        Scanner input= new Scanner (System.in);
        System.out.print("Ücret Tutarını Giriniz:");
        tutar=input.nextDouble();
        kdvOrani = tutar<=1000? kdv1:kdv2;
        kdvTutari=tutar<=1000? tutar*kdv1:tutar*kdv2;
        kdvliTutar=tutar+kdvTutari;

        System.out.println("KDV'siz Tutar:"+tutar);
        System.out.println("KDV Oranı:"+kdvOrani);
        System.out.println("KDV Tutarı:"+kdvTutari);
        System.out.println("KDV'li Tutar:"+kdvliTutar);





    }
}