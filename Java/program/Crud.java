import java.util.ArrayList;
import java.util.Scanner;

public class Crud {
    static ArrayList<Baju> daftarProduk = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    static {
        daftarProduk
                .add(new Baju("001", "Baju Anjing", 150000, 10, "Pakaian", "Katun", "Merah", "Anjing", "M", "PetWear"));
        daftarProduk.add(
                new Baju("002", "Baju Kucing", 120000, 8, "Pakaian", "Poliester", "Biru", "Kucing", "S", "CatStyle"));
        daftarProduk
                .add(new Baju("003", "Jas Anjing", 200000, 5, "Pakaian", "Wol", "Hitam", "Anjing", "L", "DogElite"));
        daftarProduk.add(new Baju("004", "Kemeja Kucing", 170000, 6, "Pakaian", "Katun", "Putih", "Kucing", "M",
                "KittyFashion"));
        daftarProduk.add(
                new Baju("005", "Jaket Anjing", 180000, 4, "Pakaian", "Denim", "Biru", "Anjing", "XL", "PetTrendy"));
    }

    public static void tambahProduk() {
        System.out.print("ID: ");
        String id = input.next();
        input.nextLine(); // Membersihkan newline setelah next()

        System.out.print("Nama Produk: ");
        String nama = input.nextLine(); // Bisa menangani input dengan spasi

        System.out.print("Harga: ");
        double harga = input.nextDouble();
        System.out.print("Stok: ");
        int stok = input.nextInt();
        input.nextLine(); // Membersihkan newline setelah nextInt()

        System.out.print("Jenis: ");
        String jenis = input.nextLine();
        System.out.print("Bahan: ");
        String bahan = input.nextLine();
        System.out.print("Warna: ");
        String warna = input.nextLine();
        System.out.print("Untuk (Anjing/Kucing): ");
        String untuk = input.nextLine();
        System.out.print("Size: ");
        String size = input.nextLine();
        System.out.print("Merk: ");
        String merk = input.nextLine();

        daftarProduk.add(new Baju(id, nama, harga, stok, jenis, bahan, warna, untuk, size, merk));
        System.out.println("Produk berhasil ditambahkan!");
    }

    public static void tampilkanProduk() {
        System.out.printf("\n%-5s %-15s %-10s %-5s %-10s %-10s %-10s %-10s %-5s %-10s\n",
                "ID", "Nama Produk", "Harga", "Stok", "Jenis", "Bahan", "Warna", "Untuk", "Size", "Merk");
        System.out.println("=".repeat(100));
        for (Baju baju : daftarProduk) {
            String[] data = baju.display();
            System.out.printf("%-5s %-15s %-10s %-5s %-10s %-10s %-10s %-10s %-5s %-10s\n",
                    (Object[]) data);
        }
    }

    public static void ubahProduk() {
        System.out.print("Masukkan ID produk yang akan diubah: ");
        String id = input.next();
        input.nextLine(); // Membersihkan newline setelah next()

        for (Baju baju : daftarProduk) {
            if (baju.id.equals(id)) {
                System.out.print("Nama Baru: ");
                String nama = input.nextLine();

                System.out.print("Harga Baru: ");
                double harga = input.nextDouble();
                System.out.print("Stok Baru: ");
                int stok = input.nextInt();
                input.nextLine(); // Membersihkan newline

                System.out.print("Jenis: ");
                String jenis = input.nextLine();
                System.out.print("Bahan: ");
                String bahan = input.nextLine();
                System.out.print("Warna: ");
                String warna = input.nextLine();
                System.out.print("Untuk: ");
                String untuk = input.nextLine();
                System.out.print("Size: ");
                String size = input.nextLine();
                System.out.print("Merk: ");
                String merk = input.nextLine();

                baju.updateBaju(nama, harga, stok, jenis, bahan, warna, untuk, size, merk);
                System.out.println("Produk berhasil diperbarui!");
                return;
            }
        }
        System.out.println("Produk tidak ditemukan!");
    }

    public static void hapusProduk() {
        System.out.print("Masukkan ID produk yang akan dihapus: ");
        String id = input.next();
        input.nextLine(); // Membersihkan newline setelah next()

        boolean removed = daftarProduk.removeIf(baju -> baju.id.equals(id));
        if (removed) {
            System.out.println("Produk berhasil dihapus!");
        } else {
            System.out.println("Produk tidak ditemukan!");
        }
    }
}
