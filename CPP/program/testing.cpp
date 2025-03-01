#include <iostream>
#include <vector>
#include <iomanip>

using namespace std;

// Base Class
class PetShop {
protected:
    string id, nama_produk;
    double harga_produk;
    int stok_produk;

public:
    PetShop(string id, string nama, double harga, int stok)
        : id(id), nama_produk(nama), harga_produk(harga), stok_produk(stok) {}

    string getId() { return id; }
    virtual void display() {
        cout << left << setw(10) << id << setw(15) << nama_produk
             << setw(10) << harga_produk << setw(10) << stok_produk;
    }

    void updateData(string nama, double harga, int stok) {
        nama_produk = nama;
        harga_produk = harga;
        stok_produk = stok;
    }
};

// Child Class dari PetShop
class Aksesoris : public PetShop {
protected:
    string jenis, bahan, warna;

public:
    Aksesoris(string id, string nama, double harga, int stok, string jenis, string bahan, string warna)
        : PetShop(id, nama, harga, stok), jenis(jenis), bahan(bahan), warna(warna) {}

    void display() {
        PetShop::display();
        cout << setw(15) << jenis << setw(15) << bahan << setw(10) << warna;
    }
};

// Child Class dari Aksesoris
class Baju : public Aksesoris {
private:
    string untuk, size, merk;

public:
    Baju(string id, string nama, double harga, int stok, string jenis, string bahan, string warna, string untuk, string size, string merk)
        : Aksesoris(id, nama, harga, stok, jenis, bahan, warna), untuk(untuk), size(size), merk(merk) {}

    void display() {
        Aksesoris::display();
        cout << setw(10) << untuk << setw(10) << size << setw(15) << merk << endl;
    }

    void updateBaju(string nama, double harga, int stok, string jenis, string bahan, string warna, string untuk, string size, string merk) {
        updateData(nama, harga, stok);
        this->jenis = jenis;
        this->bahan = bahan;
        this->warna = warna;
        this->untuk = untuk;
        this->size = size;
        this->merk = merk;
    }
};
