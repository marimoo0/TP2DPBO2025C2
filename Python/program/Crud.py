from PetShop import Baju

daftar_produk = [
    Baju("001", "Baju Anjing", 150000, 10, "Pakaian",
         "Katun", "Merah", "Anjing", "M", "PetWear"),
    Baju("002", "Baju Kucing", 120000, 8, "Pakaian",
         "Poliester", "Biru", "Kucing", "S", "CatStyle"),
    Baju("003", "Jas Anjing", 200000, 5, "Pakaian",
         "Wol", "Hitam", "Anjing", "L", "DogElite"),
    Baju("004", "Kemeja Kucing", 170000, 6, "Pakaian",
         "Katun", "Putih", "Kucing", "M", "KittyFashion"),
    Baju("005", "Jaket Anjing", 180000, 4, "Pakaian",
         "Denim", "Biru", "Anjing", "XL", "PetTrendy")
]


def tambah_produk():
    id = input("ID: ")
    nama = input("Nama Produk: ")
    harga = float(input("Harga: "))
    stok = int(input("Stok: "))
    jenis = input("Jenis: ")
    bahan = input("Bahan: ")
    warna = input("Warna: ")
    untuk = input("Untuk (Anjing/Kucing): ")
    size = input("Size: ")
    merk = input("Merk: ")
    daftar_produk.append(Baju(id, nama, harga, stok, jenis,
                         bahan, warna, untuk, size, merk))


def tampilkan_produk():
    print("\n" + "="*120)
    print(f"{'ID':<10}{'Nama Produk':<20}{'Harga':<15}{'Stok':<10}{'Jenis':<15}{'Bahan':<15}{'Warna':<10}{'Untuk':<10}{'Size':<10}{'Merk':<15}")
    print("="*120)
    for baju in daftar_produk:
        print(f"{baju.id:<10}{baju.nama_produk:<20}{baju.harga_produk:<15}{baju.stok_produk:<10}{baju.jenis:<15}{baju.bahan:<15}{baju.warna:<10}{baju.untuk:<10}{baju.size:<10}{baju.merk:<15}")


def ubah_produk():
    id = input("Masukkan ID produk yang akan diubah: ")
    for baju in daftar_produk:
        if baju.id == id:
            nama = input("Nama Baru: ")
            harga = float(input("Harga Baru: "))
            stok = int(input("Stok Baru: "))
            jenis = input("Jenis: ")
            bahan = input("Bahan: ")
            warna = input("Warna: ")
            untuk = input("Untuk: ")
            size = input("Size: ")
            merk = input("Merk: ")
            baju.update_baju(nama, harga, stok, jenis,
                             bahan, warna, untuk, size, merk)
            break


def hapus_produk():
    id = input("Masukkan ID produk yang akan dihapus: ")
    global daftar_produk
    daftar_produk = [b for b in daftar_produk if b.id != id]
