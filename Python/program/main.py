from Crud import tambah_produk, tampilkan_produk, ubah_produk, hapus_produk


def main():
    while True:
        print("\nMenu:")
        print("1. Tambah Produk")
        print("2. Tampilkan Produk")
        print("3. Ubah Produk")
        print("4. Hapus Produk")
        print("0. Keluar")
        pilihan = input("Pilih: ")
        if pilihan == "1":
            tambah_produk()
        elif pilihan == "2":
            tampilkan_produk()
        elif pilihan == "3":
            ubah_produk()
        elif pilihan == "4":
            hapus_produk()
        elif pilihan == "0":
            break
        else:
            print("Pilihan tidak valid, coba lagi!")


if __name__ == "__main__":
    main()
