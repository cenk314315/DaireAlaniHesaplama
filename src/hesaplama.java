import java.util.Scanner;

public class hesaplama {



    public static void main(String[] args) {

        double r, aci, alan, pi=3.14;
        Scanner deger = new Scanner(System.in);
        System.out.print("Dairenin yarı çapını giriniz: ");
        r = deger.nextInt();


        System.out.print("Açısını giriniz: ");
        aci = deger.nextInt();

        alan = (pi*(r*r)*aci) / 360;
        System.out.print("Dairenin alanı: " + alan);



    }




}
