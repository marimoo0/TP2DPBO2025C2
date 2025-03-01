/* Saya Khana Yusdiana 2100991 mengerjakan soal Latihan 1
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan
seperti yang telah dispesifikasikan. Aamiin. */

// Import library
// File: Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Produk");
            System.out.println("3. Ubah Produk");
            System.out.println("4. Hapus Produk");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            String pilihan = input.next();

            switch (pilihan) {
                case "1":
                    Crud.tambahProduk();
                    break;
                case "2":
                    Crud.tampilkanProduk();
                    break;
                case "3":
                    Crud.ubahProduk();
                    break;
                case "4":
                    Crud.hapusProduk();
                    break;
                case "0":
                    input.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
