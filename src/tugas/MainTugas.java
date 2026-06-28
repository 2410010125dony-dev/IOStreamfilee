// Nama  : Dony Hares Subrata
// NPM   : 2410010125
package tugas;
 
public class MainTugas {
    public static void main(String[] args) {
 
        // Array kategori barang (ukuran tetap, minimal 3)
        String[] kategori = {"Elektronik", "Makanan & Minuman", "Alat Tulis", "Pakaian", "Peralatan Rumah"};
        System.out.println("=== Kategori Barang ===");
        for (int i = 0; i < kategori.length; i++) {
            System.out.println((i + 1) + ". " + kategori[i]);
        }
        System.out.println();
 
        // Membuat objek Gudang dan menambah minimal 5 barang
        Gudang gudang = new Gudang("barang.txt");
        gudang.tambahBarang(new Barang("Laptop ASUS VivoBook",    8500000.0, 10));
        gudang.tambahBarang(new Barang("Mouse Wireless Logitech",  250000.0, 35));
        gudang.tambahBarang(new Barang("Buku Tulis 58 Lembar",      15000.0, 200));
        gudang.tambahBarang(new Barang("Kemeja Batik Pria",        120000.0, 50));
        gudang.tambahBarang(new Barang("Sapu Lantai Premium",       45000.0, 80));
        gudang.tambahBarang(new Barang("Keyboard Mechanical",      650000.0, 15));
 
        gudang.tampilkanSemua();
        System.out.printf("Total nilai persediaan: Rp%,.0f%n", gudang.totalNilai());
        System.out.println();
 
        // Simpan seluruh data ke barang.txt
        gudang.simpanKeBerkas();
        System.out.println();
 
        // Buat objek Gudang baru, muat dari berkas, tampilkan & hitung total
        System.out.println("=== Memuat dari Berkas (objek Gudang baru) ===");
        Gudang gudangBaru = new Gudang("barang.txt");
        gudangBaru.muatDariBerkas();
        System.out.println();
        gudangBaru.tampilkanSemua();
        System.out.println("Jumlah jenis barang  : " + gudangBaru.jumlahBarang());
        System.out.printf("Total nilai persediaan: Rp%,.0f%n", gudangBaru.totalNilai());
        System.out.println("\n>>> Data berhasil disimpan dan dimuat kembali dari berkas! <<<");
    }
}
 