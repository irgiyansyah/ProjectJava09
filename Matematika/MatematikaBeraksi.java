package matematika;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        // Membuat objek Matematika
        Matematika mtk = new Matematika();

        // Mengeksekusi method dan menampilkan hasilnya
        int hasilPertambahan = mtk.pertambahan(20, 20);
        System.out.println("Pertambahan: 20 + 20 = " + hasilPertambahan);

        int hasilPengurangan = mtk.pengurangan(10, 5);
        System.out.println("Pengurangan: 10 - 5 = " + hasilPengurangan);

        int hasilPerkalian = mtk.perkalian(10, 20);
        System.out.println("Perkalian: 10 * 20 = " + hasilPerkalian);

        int hasilPembagian = mtk.pembagian(21, 2);
        System.out.println("Pembagian: 21 / 2 = " + hasilPembagian);
    }
}
