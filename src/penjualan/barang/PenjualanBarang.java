package penjualan.barang;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class PenjualanBarang {

    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        System.out.println("======================================");
        System.out.println("Program penjualan dengan data barang");
        System.out.println("======================================");
        Scanner input = new Scanner(System.in);

        System.out.println("    Kode Barang     Nama Barang     Harga Satuan");
        System.out.println("    A01             Hardisk         Rp. 700.000,00");
        System.out.println("    B02             Monitor         Rp. 800.000,00");
        System.out.println("    C03             Mouse           Rp. 50.000,00");

        System.out.print("\nMasukkan Jumlah Pembeli   : ");
        int jpembeli = input.nextInt();
        String[] nama = new String[jpembeli];
        String[] kode = new String[jpembeli];
        int[] jbarang = new int[jpembeli];
        String[] nbarang = new String[jpembeli];
        int[] harga = new int[jpembeli];
        int[] bayar = new int[jpembeli];

        for (int i = 0; i < jpembeli; i++) {
            System.out.println("\nPembeli Ke-" + (i + 1));
            System.out.print("Nama Pembeli  : ");
            nama[i] = input.next();
            System.out.print("Kode Barang   : ");
            kode[i] = input.next();
            System.out.print("Jumlah        : ");
            jbarang[i] = input.nextInt();

            if (kode[i].equals("A01")) {
                nbarang[i] = "Hardisk";
                harga[i] = 700000;
                bayar[i] = harga[i] * jbarang[i];
                kursIndonesia.setDecimalFormatSymbols(formatRp);
            } else if (kode[i].equals("B02")) {
                nbarang[i] = "Monitor";
                harga[i] = 800000;
                bayar[i] = harga[i] * jbarang[i];
            } else if (kode[i].equals("C03")) {
                nbarang[i] = "Mouse";
                harga[i] = 50000;
                bayar[i] = harga[i] * jbarang[i];
            } else {
                System.out.println("\n\tError");
            }
        }

        System.out.println("\n==============================================================================================================================================");
        System.out.println("No \tNama Pembeli \tKode Barang \tNama Barang \tJumlah \t\tHarga \t\t\tBayar");
        for (int i = 0; i < jpembeli; i++) {
            System.out.println((i + 1) + " \t" + nama[i] + " \t\t" + kode[i] + " \t\t" + nbarang[i] + " \t" + jbarang[i] + " \t\t" + kursIndonesia.format(harga[i]) + " \t\t" + kursIndonesia.format(bayar[i]));
        }
        System.out.println("\n==============================================================================================================================================");
        System.out.println("\nNama      : Fajar Ega Firmansyah");
        System.out.println("Jurusan    : Sistem Informasi");
    }

}
