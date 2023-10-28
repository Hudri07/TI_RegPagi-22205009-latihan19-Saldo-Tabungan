/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TIRegPagi22205009latihan19SaldoTabungan;
import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author Axioo
 * NAMA     : Asmalik Hudri
 * Prodi    : Teknik Informatika
 * NIM      : 22205009
 * Deskripsi Program    : Program ini berisi program untuk menampilkan
 * saldo tabungan 
 * 
 */
public class TIRegPagi22205009latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Locale local = new Locale("id","ID");
        
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(local);
        symbols.setDecimalSeparator('.');
        
        DecimalFormat formatter = new DecimalFormat("Rp,#,###,###",symbols);
        // Input
        System.out.print("Saldo Awal: Rp.");
        int saldoAwal = scanner.nextInt();

        System.out.print("Bunga/Bulan (%): ");
        int bungaPerBulan = scanner.nextInt();

        System.out.print("Lama (bulan): ");
        int lama = scanner.nextInt();

        // Hitung saldo
        for (int i = 1; i <= lama; i++) {
            saldoAwal += saldoAwal * bungaPerBulan / 100;
            System.out.println("Saldo di bulan ke-" + i + " " + formatter.format(saldoAwal));
        }
    }
}


