public class PetShop {
    protected String id, namaProduk;
    protected double harga;
    protected int stok;

    public PetShop(String id, String namaProduk, double harga, int stok) {
        this.id = id;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    public String[] display() {
        return new String[] { id, namaProduk, String.valueOf(harga), String.valueOf(stok) };
    }

    public void updateData(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }
}

class Aksesoris extends PetShop {
    protected String jenis, bahan, warna;

    public Aksesoris(String id, String namaProduk, double harga, int stok, String jenis, String bahan, String warna) {
        super(id, namaProduk, harga, stok);
        this.jenis = jenis;
        this.bahan = bahan;
        this.warna = warna;
    }

    @Override
    public String[] display() {
        return new String[] { id, namaProduk, String.valueOf(harga), String.valueOf(stok), jenis, bahan, warna };
    }
}

class Baju extends Aksesoris {
    private String untuk, size, merk;

    public Baju(String id, String namaProduk, double harga, int stok, String jenis, String bahan, String warna,
            String untuk, String size, String merk) {
        super(id, namaProduk, harga, stok, jenis, bahan, warna);
        this.untuk = untuk;
        this.size = size;
        this.merk = merk;
    }

    @Override
    public String[] display() {
        return new String[] { id, namaProduk, String.valueOf(harga), String.valueOf(stok), jenis, bahan, warna, untuk,
                size, merk };
    }

    public void updateBaju(String namaProduk, double harga, int stok, String jenis, String bahan, String warna,
            String untuk, String size, String merk) {
        updateData(namaProduk, harga, stok);
        this.jenis = jenis;
        this.bahan = bahan;
        this.warna = warna;
        this.untuk = untuk;
        this.size = size;
        this.merk = merk;
    }
}