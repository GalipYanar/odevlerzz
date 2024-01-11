public class odev07 {


    public static void main(String[] args) {


        int  i = 0, birinciSayi = 0, ikinciSayi = 1;

        while (i<15){

            int fibonacciSayisi = birinciSayi + ikinciSayi;
           birinciSayi = ikinciSayi;
           ikinciSayi = fibonacciSayisi;
           i++;

            System.out.println(i + ". fibonacci sayilari: " + fibonacciSayisi );


        }

    }
}
