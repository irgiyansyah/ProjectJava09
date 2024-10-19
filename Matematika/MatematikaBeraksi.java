package matematika;
// Menggunakan Class MatematikaBeraksi sebagai Main fungsi
public class MatematikaBeraksi {
    public static void main(String[] args) {
        // Membuat objek Matematika
        Matematika mtk = new Matematika();

        // Mengeksekusi method dan menampilkan hasilnya
        int hasilPertambahan = mtk.pertambahan(20, 20);
        System.out.println("Pertambahan: 20 + 20 = " + hasilPertambahan);
        //  Mengesekusi Method dan menampilkan hasil pengurangan dari algoritma
        int hasilPengurangan = mtk.pengurangan(10, 5);
        System.out.println("Pengurangan: 10 - 5 = " + hasilPengurangan);
        // Mengesekusi Method dan menampilkan hasil product dari algoritma java
        int hasilPerkalian = mtk.perkalian(10, 20);
        System.out.println("Perkalian: 10 * 20 = " + hasilPerkalian);
        // Mengekekusi Method dan menampilkan hasil product dari algoritma java
        int hasilPembagian = mtk.pembagian(21, 2);
        System.out.println("Pembagian: 21 / 2 = " + hasilPembagian);   // Hasil Output dari ke empat operator diatas 
    }
}
