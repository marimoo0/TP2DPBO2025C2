#include "testing.cpp"
int main() {
    vector<Baju> daftarProduk;
    daftarProduk.push_back(Baju("001", "Baju Anjing", 150000, 10, "Pakaian", "Katun", "Merah", "Anjing", "M", "PetWear"));
    daftarProduk.push_back(Baju("002", "Baju Kucing", 120000, 8, "Pakaian", "Poliester", "Biru", "Kucing", "S", "CatStyle"));
    daftarProduk.push_back(Baju("003", "Jas Anjing", 200000, 5, "Pakaian", "Wol", "Hitam", "Anjing", "L", "DogElite"));
    daftarProduk.push_back(Baju("004", "Kemeja Kucing", 170000, 6, "Pakaian", "Katun", "Putih", "Kucing", "M", "KittyFashion"));
    daftarProduk.push_back(Baju("005", "Jaket Anjing", 180000, 4, "Pakaian", "Denim", "Biru", "Anjing", "XL", "PetTrendy"));

    int pilihan;
    do {
        cout << "\nMenu:\n1. Tambah Produk\n2. Tampilkan Produk\n3. Ubah Produk\n4. Hapus Produk\n0. Keluar\nPilih: ";
        cin >> pilihan;

        if (pilihan == 1) {
            string id, nama, jenis, bahan, warna, untuk, size, merk;
            double harga;
            int stok;

            cout << "ID: "; cin >> id;
            cout << "Nama Produk: "; cin.ignore(); getline(cin, nama);
            cout << "Harga: "; cin >> harga;
            cout << "Stok: "; cin >> stok;
            cout << "Jenis: "; cin.ignore(); getline(cin, jenis);
            cout << "Bahan: "; getline(cin, bahan);
            cout << "Warna: "; getline(cin, warna);
            cout << "Untuk (Anjing/Kucing): "; getline(cin, untuk);
            cout << "Size: "; getline(cin, size);
            cout << "Merk: "; getline(cin, merk);

            daftarProduk.push_back(Baju(id, nama, harga, stok, jenis, bahan, warna, untuk, size, merk));
        }
        else if (pilihan == 2) {
            cout << "\n===============================================================================================================\n";
            cout << left << setw(10) << "ID" << setw(15) << "Nama Produk" << setw(10) << "Harga" << setw(10) << "Stok"
                 << setw(15) << "Jenis" << setw(15) << "Bahan" << setw(10) << "Warna"
                 << setw(10) << "Untuk" << setw(10) << "Size" << setw(15) << "Merk" << endl;
            cout << "===============================================================================================================\n";
            for (vector<Baju>::iterator it = daftarProduk.begin(); it != daftarProduk.end(); ++it) {
                it->display();
            }
        }
        else if (pilihan == 3) {
            string id;
            cout << "Masukkan ID produk yang akan diubah: "; cin >> id;
            for (vector<Baju>::iterator it = daftarProduk.begin(); it != daftarProduk.end(); ++it) {
                if (it->getId() == id) {
                    string nama, jenis, bahan, warna, untuk, size, merk;
                    double harga;
                    int stok;
                    cout << "Nama Baru: "; cin.ignore(); getline(cin, nama);
                    cout << "Harga Baru: "; cin >> harga;
                    cout << "Stok Baru: "; cin >> stok;
                    cout << "Jenis: "; cin.ignore(); getline(cin, jenis);
                    cout << "Bahan: "; getline(cin, bahan);
                    cout << "Warna: "; getline(cin, warna);
                    cout << "Untuk: "; getline(cin, untuk);
                    cout << "Size: "; getline(cin, size);
                    cout << "Merk: "; getline(cin, merk);
                    it->updateBaju(nama, harga, stok, jenis, bahan, warna, untuk, size, merk);
                    break;
                }
            }
        }
        else if (pilihan == 4) {
            string id;
            cout << "Masukkan ID produk yang akan dihapus: "; cin >> id;
            for (vector<Baju>::iterator it = daftarProduk.begin(); it != daftarProduk.end(); ) {
                if (it->getId() == id) {
                    it = daftarProduk.erase(it);
                } else {
                    ++it;
                }
            }
        }
    } while (pilihan != 0);

    return 0;
}
