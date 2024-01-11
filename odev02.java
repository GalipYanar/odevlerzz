import java.util.Scanner;

public class odev02 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int faktoriyel = 1;

        System.out.println("Hoşgeldiniz, Faktöriyelini Hesaplamak İstediğiniz Sayıyı Giriniz: ");
        int i = scan.nextInt();

        while ( i > 1){
            faktoriyel *= i;
            i--;

        }
        System.out.println("Girdiğiniz Sayının Faktöriyeli: "+faktoriyel);
    }

}
