import java.util.Scanner;

public class odev05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i;
        System.out.println("bir sayı girin");
        i = scanner.nextInt();


        if (i%2==0){
            System.out.println("girdiğiniz sayı çift");
        }
        else {
            System.out.println("girdidğiniz sayı tek");
        }
    }
}
