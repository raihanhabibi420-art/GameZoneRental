package gamezonerental;

import java.util.Scanner;

public class gamezonerentalps {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String ulang;

        do {
            System.out.println("====================================");
            System.out.println("       GAMEZONE RENTAL PS");
            System.out.println("====================================");

            System.out.print("Nama Pelanggan : ");
            String nama = input.nextLine().trim();

            while (nama.isEmpty()) {
                System.out.print("Nama tidak boleh kosong. Masukkan nama: ");
                nama = input.nextLine().trim();
            }

            System.out.println("1. PlayStation 4 - Rp8000/jam");
            System.out.println("2. PlayStation 5 - Rp12000/jam");

            int pilihan = bacaAngka("Pilihan (1/2): ", 1, 2);

            String konsol;
            long hargaPerJam;

            if (pilihan == 1) {
                konsol = "PlayStation 4";
                hargaPerJam = 8000;
            } else {
                konsol = "PlayStation 5";
                hargaPerJam = 12000;
            }

            int durasi = bacaAngka(
                "Lama Bermain (jam): ", 1, Integer.MAX_VALUE
            );

            long biayaSewa = hargaPerJam * durasi;
            long diskon = 0;

            if (durasi >= 3) {
                diskon = biayaSewa * 10 / 100;
            }

            System.out.print("Tambah Minuman (Y/T): ");
            String jawaban = input.nextLine().trim();

            while (!jawaban.equalsIgnoreCase("Y")
                    && !jawaban.equalsIgnoreCase("T")) {
                System.out.print("Masukkan Y atau T: ");
                jawaban = input.nextLine().trim();
            }

            long biayaMinuman = 0;

            if (jawaban.equalsIgnoreCase("Y")) {
                biayaMinuman = 5000;
            }

            long totalBayar = biayaSewa - diskon + biayaMinuman;

            cetakStruk(
                nama, konsol, durasi, biayaSewa,
                diskon, biayaMinuman, totalBayar
            );

            System.out.print("Transaksi Baru (Y/T): ");
            ulang = input.nextLine().trim();

            while (!ulang.equalsIgnoreCase("Y")
                    && !ulang.equalsIgnoreCase("T")) {
                System.out.print("Masukkan Y atau T: ");
                ulang = input.nextLine().trim();
            }

        } while (ulang.equalsIgnoreCase("Y"));

        System.out.println("Terima kasih!");
        input.close();
    }

    static int bacaAngka(String pesan, int min, int max) {
        while (true) {
            System.out.print(pesan);
            String teks = input.nextLine().trim();

            try {
                int angka = Integer.parseInt(teks);

                if (angka >= min && angka <= max) {
                    return angka;
                }

                System.out.println("Pilihan tidak sesuai ketentuan.");
            } catch (NumberFormatException e) {
                System.out.println("Masukkan bilangan bulat yang valid.");
            }
        }
    }

    static void cetakStruk(
            String nama,
            String konsol,
            int durasi,
            long biayaSewa,
            long diskon,
            long biayaMinuman,
            long totalBayar) {

        System.out.println("------------------------------------");
        System.out.println("           STRUK GAMEZONE");
        System.out.println("------------------------------------");
        System.out.println("Pelanggan    : " + nama);
        System.out.println("Konsol       : " + konsol);
        System.out.println("Durasi       : " + durasi + " jam");
        System.out.println("Biaya Sewa   : Rp" + biayaSewa);
        System.out.println("Diskon (10%) : Rp" + diskon);
        System.out.println("Minuman      : Rp" + biayaMinuman);
        System.out.println("TOTAL BAYAR  : Rp" + totalBayar);
        System.out.println("====================================");
    }
}

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String ulang;

        do {
            System.out.println("====================================");
            System.out.println("       GAMEZONE RENTAL PS");
            System.out.println("====================================");

            System.out.print("Nama Pelanggan : ");
            String nama = input.nextLine().trim();

            while (nama.isEmpty()) {
                System.out.print("Nama tidak boleh kosong. Masukkan nama: ");
                nama = input.nextLine().trim();
            }

            System.out.println("1. PlayStation 4 - Rp8000/jam");
            System.out.println("2. PlayStation 5 - Rp12000/jam");

            int pilihan = bacaAngka("Pilihan (1/2): ", 1, 2);

            String konsol;
            long hargaPerJam;

            if (pilihan == 1) {
                konsol = "PlayStation 4";
                hargaPerJam = 8000;
            } else {
                konsol = "PlayStation 5";
                hargaPerJam = 12000;
            }

            int durasi = bacaAngka(
                "Lama Bermain (jam): ", 1, Integer.MAX_VALUE
            );

            long biayaSewa = hargaPerJam * durasi;
            long diskon = 0;

            if (durasi >= 3) {
                diskon = biayaSewa * 10 / 100;
            }

            System.out.print("Tambah Minuman (Y/T): ");
            String jawaban = input.nextLine().trim();

            while (!jawaban.equalsIgnoreCase("Y")
                    && !jawaban.equalsIgnoreCase("T")) {
                System.out.print("Masukkan Y atau T: ");
                jawaban = input.nextLine().trim();
            }

            long biayaMinuman = 0;

            if (jawaban.equalsIgnoreCase("Y")) {
                biayaMinuman = 5000;
            }

            long totalBayar = biayaSewa - diskon + biayaMinuman;

            cetakStruk(
                nama, konsol, durasi, biayaSewa,
                diskon, biayaMinuman, totalBayar
            );

            System.out.print("Transaksi Baru (Y/T): ");
            ulang = input.nextLine().trim();

            while (!ulang.equalsIgnoreCase("Y")
                    && !ulang.equalsIgnoreCase("T")) {
                System.out.print("Masukkan Y atau T: ");
                ulang = input.nextLine().trim();
            }

        } while (ulang.equalsIgnoreCase("Y"));

        System.out.println("Terima kasih!");
        input.close();
    }

    static int bacaAngka(String pesan, int min, int max) {
        while (true) {
            System.out.print(pesan);
            String teks = input.nextLine().trim();

            try {
                int angka = Integer.parseInt(teks);

                if (angka >= min && angka <= max) {
                    return angka;
                }

                System.out.println("Pilihan tidak sesuai ketentuan.");
            } catch (NumberFormatException e) {
                System.out.println("Masukkan bilangan bulat yang valid.");
            }
        }
    }

    static void cetakStruk(
            String nama,
            String konsol,
            int durasi,
            long biayaSewa,
            long diskon,
            long biayaMinuman,
            long totalBayar) {

        System.out.println("------------------------------------");
        System.out.println("           STRUK GAMEZONE");
        System.out.println("------------------------------------");
        System.out.println("Pelanggan    : " + nama);
        System.out.println("Konsol       : " + konsol);
        System.out.println("Durasi       : " + durasi + " jam");
        System.out.println("Biaya Sewa   : Rp" + biayaSewa);
        System.out.println("Diskon (10%) : Rp" + diskon);
        System.out.println("Minuman      : Rp" + biayaMinuman);
        System.out.println("TOTAL BAYAR  : Rp" + totalBayar);
        System.out.println("====================================");
    }
}
