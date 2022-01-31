import java.sql.SQLOutput;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Currency {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //Inisialisai variabel
        double amount, dollar, pound, code, euro, yen, ringgit, rupee;

        DecimalFormat f = new DecimalFormat("##.##");
        System.out.println("Welcome To Currency Converter");
        System.out.println("Mata uang apa yang anda ingin rubah ke rupiah?");
        System.out.println("1:Rupee \t2:Dollar \t3:Pound \t4:Euro  \t5:Yen    \t6:Rinngit");
        code = sc.nextInt();

        System.out.println("Berapa nominal yang anda ingin konversi: ");
        amount = sc.nextDouble();

        //Percabangan untuk memulai perhitungan konversi mata uang

        if (code == 1){
            
        }
    }
}
