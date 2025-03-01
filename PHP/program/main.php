<?php
session_start();

require 'Crud.php';

if (isset($_SESSION['produkList']) && !is_array($_SESSION['produkList'])) {
    unset($_SESSION['produkList']);
}

$crud = new Crud();

if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    if (isset($_POST['create'])) {
        $foto = $_FILES['foto']['name'];
        $target = "uploads/" . basename($foto);
        move_uploaded_file($_FILES['foto']['tmp_name'], $target);

        $crud->create($_POST['id'], $_POST['nama_produk'], $_POST['kategori_produk'], $_POST['harga_produk'], $target);
    } elseif (isset($_POST['update'])) {
        $foto = $_FILES['foto']['name'];
        $target = "uploads/" . basename($foto);
        move_uploaded_file($_FILES['foto']['tmp_name'], $target);

        $crud->update($_POST['id'], $_POST['nama_produk'], $_POST['kategori_produk'], $_POST['harga_produk'], $target);
    } elseif (isset($_POST['delete'])) {
        $crud->delete($_POST['id']);
    }
}

echo "<h2><center>Daftar Produk PetShop</center></h2>";
$crud->read();
?>

<center>
    <h3>Tambah Produk</h3>
    <form method="POST" enctype="multipart/form-data">
        ID: <input type="text" name="id" required><br>
        Nama Produk: <input type="text" name="nama_produk" required><br>
        Kategori: <input type="text" name="kategori_produk" required><br>
        Harga: <input type="text" name="harga_produk" required><br>
        Foto: <input type="file" name="foto" required><br>
        <button type="submit" name="create">Tambah</button>
    </form>

    <h3>Update Produk</h3>
    <form method="POST" enctype="multipart/form-data">
        ID: <input type="text" name="id" required><br>
        Nama Produk: <input type="text" name="nama_produk" required><br>
        Kategori: <input type="text" name="kategori_produk" required><br>
        Harga: <input type="text" name="harga_produk" required><br>
        Foto: <input type="file" name="foto"><br>
        <button type="submit" name="update">Update</button>
    </form>

    <h3>Hapus Produk</h3>
    <form method="POST">
        ID: <input type="text" name="id" required><br>
        <button type="submit" name="delete">Hapus</button>
    </form>
</center>