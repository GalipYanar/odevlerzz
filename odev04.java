import java.util.Scanner;

public class odev04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i;

        do {
            System.out.println("Kontrol etmek istediğiniz sayıyı girin: ");
            i = scanner.nextInt();


        }while (i%i==1 && i%1==1);
        System.out.println("girdiğiniz sayı bir asal sayıdır");


    }
}
