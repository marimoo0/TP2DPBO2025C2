<?php
session_start();

class Crud
{
    public function __construct()
    {
        if (!isset($_SESSION['produkList'])) {
            $_SESSION['produkList'] = [];
        }
    }

    public function create($id, $nama_produk, $kategori_produk, $harga_produk, $foto)
    {
        $_SESSION['produkList'][] = [
            'id' => $id,
            'nama_produk' => $nama_produk,
            'kategori_produk' => $kategori_produk,
            'harga_produk' => $harga_produk,
            'foto' => $foto
        ];
    }

    public function read()
    {
        echo "<center><table border='3'>";
        echo "<tr>
                <th>ID</th>
                <th>Nama Produk</th>
                <th>Kategori</th>
                <th>Harga</th>
                <th>Foto</th>
              </tr>";

        foreach ($_SESSION['produkList'] as $produk) {
            echo "<tr><td>{$produk['id']}</td>";
            echo "<td>{$produk['nama_produk']}</td>";
            echo "<td>{$produk['kategori_produk']}</td>";
            echo "<td>{$produk['harga_produk']}</td>";
            echo "<td><img src='{$produk['foto']}' style='width: 150px'></td></tr>";
        }

        echo "</table></center>";
    }

    public function update($id, $nama_produk, $kategori_produk, $harga_produk, $foto)
    {
        foreach ($_SESSION['produkList'] as &$produk) {
            if ($produk['id'] == $id) {
                $produk['nama_produk'] = $nama_produk;
                $produk['kategori_produk'] = $kategori_produk;
                $produk['harga_produk'] = $harga_produk;
                $produk['foto'] = $foto;
                break;
            }
        }
    }

    public function delete($id)
    {
        foreach ($_SESSION['produkList'] as $index => $produk) {
            if ($produk['id'] == $id) {
                unset($_SESSION['produkList'][$index]);
                $_SESSION['produkList'] = array_values($_SESSION['produkList']); // Reindex array
                break;
            }
        }
    }
}