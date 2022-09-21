import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tutar, kdvOran = 0.18, KdvOrani1 = 0.08, kdvTutar, kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.println("Ücret Bilgisiniz Giriniz : ");

        tutar = input.nextDouble();

        kdvOran = (tutar <= 1000) ? 0.18 : 0.08;

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar :" + tutar);
        System.out.println("KDV Tutarı : " + kdvTutar);
        System.out.println("KDV Orano : " + kdvOran);
        System.out.println("KDV'li Tutar :" + kdvliTutar);







    }
}