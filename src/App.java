/**
 * @author Nim : 10116430 Nama : Wisnu Bayu Aji Kelas: IF-2
 */

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        Tabungan tb = new Tabungan();

        // in
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukan Saldo Awal : ");
        int saldo = scn.nextInt();
        System.out.print("Jumlah uang yang diambil : ");
        int ambil = scn.nextInt();

        // out
        int jumlah = saldo - ambil;
        tb.ambilUang(jumlah);
        System.out.println("Saldo Anda Sekarang : " + tb.ambilUang(jumlah));
    }
}
