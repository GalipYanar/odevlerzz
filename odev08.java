public class odev08 {

    public static void main(String[] args) {


        int i = 1;
        System.out.println("1-50 arası sayıların karesi: ");

        do {
            int kare = i * i ;
            System.out.println(i +" * "+ i +" = " + kare);
            i++;

        }while (i <= 50);



    }
}
