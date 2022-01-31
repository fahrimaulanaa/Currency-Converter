import java.util.Scanner;
import java.text.DecimalFormat;
public class Currency {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //Inisialisai variabel
        double amount, dollar, pound, code, euro, yen, ringgit, rupee, rupiah;

        DecimalFormat f = new DecimalFormat("##.##");
        System.out.println("Welcome To Currency Converter");
        System.out.println("Mata uang apa yang anda ingin rubah ke rupiah?");
        System.out.println("1:Rupee \t2:Dollar \t3:Pound \t4:Euro  \t5:Yen    \t6:Rinngit");
        code = sc.nextInt();

        System.out.println("Berapa nominal yang anda ingin konversi: ");
        amount = sc.nextDouble();

        //Percabangan untuk memulai perhitungan konversi mata uang

        if (code == 1){
            rupiah = 192.55 * amount;
            System.out.println(amount + " Rupee adalah "+rupiah+ " Rupiah");
        }
        else if (code == 2){
            rupiah = 14.328 * amount;
            System.out.println(amount + " Dollar adalah "+rupiah + " Rupiah");
        }
        else if (code == 3){
            rupiah = 19278 * amount;
            System.out.println(amount + " Pound adalah "+rupiah + " Rupiah");
        }
        else if (code == 4){
            rupiah = 16.207 * amount;
            System.out.println(amount + " Euro adalah "+rupiah + " Rupiah");
        }
        else if (code == 5){
            rupiah = 124.41 * amount;
            System.out.println(amount + " Yen adalah "+rupiah+ " Rupiah");
        }
        else if (code == 6){
            rupiah = 3.423 * amount;
            System.out.println(amount + " Ringgit adalah "+rupiah + "Rupiah");
        }else{
            System.out.println("Parameter Tidak Valid");
        }
    }
}
