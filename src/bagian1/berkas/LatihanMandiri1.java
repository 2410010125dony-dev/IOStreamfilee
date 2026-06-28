package bagian1.berkas;

import java.io.File;
import java.io.IOException;
 
public class LatihanMandiri1 {
    public static void main(String[] args) {
 
        // Latihan 1: cek keberadaan dan ukuran laporan.txt
        System.out.println("=== Latihan 1: Cek laporan.txt ===");
        File berkas = new File("laporan.txt");
        if (berkas.exists()) {
            System.out.println("Berkas ada, ukuran: " + berkas.length() + " byte");
        } else {
            System.out.println("Berkas laporan.txt tidak ditemukan.");
        }
 
        // Latihan 2: buat folder arsip
        System.out.println("\n=== Latihan 2: Membuat folder arsip ===");
        File folder = new File("arsip");
        if (folder.mkdir()) {
            System.out.println("Folder 'arsip' berhasil dibuat.");
        } else {
            System.out.println("Gagal membuat folder 'arsip' (mungkin sudah ada).");
        }
 
        // Latihan 3: buat lalu hapus sementara.txt
        System.out.println("\n=== Latihan 3: Buat dan hapus sementara.txt ===");
        File sementara = new File("sementara.txt");
        try {
            sementara.createNewFile();
            System.out.println("Sebelum dihapus, ada? " + sementara.exists());
            sementara.delete();
            System.out.println("Sesudah dihapus, ada? " + sementara.exists());
        } catch (IOException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        }
    }
}
 