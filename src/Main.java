
import java. util.Scanner;
public class Main {

    public static void main(String[] args) {

        int sicaklik;
        Scanner scan = new Scanner(System.in);
        System.out.println("SICAKLIK DEĞERİNİ GİRİNİZ");
        sicaklik = scan.nextInt();

        if(sicaklik>25){
            System.out.println("evde kal");
        }else if(sicaklik<25){
            System.out.println("dışarı çık");
        }


    }
}
