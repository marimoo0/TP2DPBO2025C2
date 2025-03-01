class PetShop:
    def __init__(self, id, nama_produk, harga_produk, stok_produk):
        self.id = id
        self.nama_produk = nama_produk
        self.harga_produk = harga_produk
        self.stok_produk = stok_produk

    def display(self):
        return [self.id, self.nama_produk, self.harga_produk, self.stok_produk]

    def update_data(self, nama, harga, stok):
        self.nama_produk = nama
        self.harga_produk = harga
        self.stok_produk = stok


class Aksesoris(PetShop):
    def __init__(self, id, nama, harga, stok, jenis, bahan, warna):
        super().__init__(id, nama, harga, stok)
        self.jenis = jenis
        self.bahan = bahan
        self.warna = warna

    def display(self):
        return super().display() + [self.jenis, self.bahan, self.warna]


class Baju(Aksesoris):
    def __init__(self, id, nama, harga, stok, jenis, bahan, warna, untuk, size, merk):
        super().__init__(id, nama, harga, stok, jenis, bahan, warna)
        self.untuk = untuk
        self.size = size
        self.merk = merk

    def display(self):
        return super().display() + [self.untuk, self.size, self.merk]

    def update_baju(self, nama, harga, stok, jenis, bahan, warna, untuk, size, merk):
        self.update_data(nama, harga, stok)
        self.jenis = jenis
        self.bahan = bahan
        self.warna = warna
        self.untuk = untuk
        self.size = size
        self.merk = merk
