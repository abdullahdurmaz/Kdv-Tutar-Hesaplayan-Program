import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
        double kdv = 0.18;
        double sonuc ;
        double kdv8 =0.08;
        System.out.println("Bir Sayı Giriniz :");
        Scanner input = new Scanner(System.in);
        int deger = input.nextInt();
        if (deger>0&&deger<1000) {
            sonuc=deger+(deger*kdv);
            System.out.println(sonuc);

        }
        else if (deger>=1000){
            sonuc=deger+(deger*kdv8);
            System.out.println(sonuc);
        }
    }

}
