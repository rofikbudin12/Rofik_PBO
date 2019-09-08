package bangunruang;

import java.util.Scanner;

public class BangunRuang {


    public static void main(String[] args) {


        Perhitungan perhitungan = new Perhitungan();
        Scanner scanner = new Scanner(System.in);
        int pilih, pil;
        Double s, s1, s2, s3;

        do {
            menu:
            System.out.println("  Menu  ");
            System.out.println("1. Kerucut  ");
            System.out.println("2. Kubus  ");
            System.out.println("3. Balok  ");
            System.out.println("4. Keluar ");
            System.out.print("Pilih :  ");
            pilih = scanner.nextInt();

            switch (pilih) {
                case 1:

                    do {
                        System.out.println("  Menu  ");
                        System.out.println("1. Luas  ");
                        System.out.println("2. Volume ");
                        System.out.println("3. Kembali  ");
                        System.out.print("Pilih :  ");
                        pil = scanner.nextInt();

                        if (pil == 1) {
                            System.out.print("Masukan radius = ");
                            s1 = scanner.nextDouble();
                            System.out.print("Masukan Garis Pelukis = ");
                            s2 = scanner.nextDouble();
                            Double luasKerucut;
                            luasKerucut = perhitungan.luasKerucut(s1, s2);
                            System.out.println("Luas = " + luasKerucut);
                        } else if (pil == 2) {
                            System.out.print("Masukkan Luas Alas : ");
                            s = scanner.nextDouble();
                            System.out.print("Masukkan Tinggi : ");
                            s2 = scanner.nextDouble();
                            Double volumeKerucut;
                            volumeKerucut = perhitungan.volumeKerucut(s, s2);
                            System.out.println("Volume = " + volumeKerucut);
                        } else if (pil == 3) {
                            System.out.println(" ");
                        } else {
                            System.out.println("Eror");
                        }

                    } while (pil == 1 || pil == 2 || pil > 3 || pil < 1);
                    break;

                case 2:

                    do {
                        System.out.println("  Menu  ");
                        System.out.println("1. Luas  ");
                        System.out.println("2. Volume ");
                        System.out.println("3. Kembali  ");
                        System.out.print("Pilih :  ");
                        pil = scanner.nextInt();

                        if (pil == 1) {
                            System.out.print("Masukan Sisi = ");
                            s1 = scanner.nextDouble();
                            Double luasPersegi;
                            luasPersegi = perhitungan.luasKubus(s1);
                            System.out.println("Luas = " + luasPersegi);
                        } else if (pil == 2) {
                            System.out.print("Masukkan Sisi : ");
                            s1 = scanner.nextDouble();
                            Double volumeKubus;
                            volumeKubus = perhitungan.volumeKubus(s1);
                            System.out.println("Volume = " + volumeKubus);
                        } else if (pil == 3) {
                            System.out.println(" ");
                        } else {
                            System.out.println("Eror");
                        }

                    } while (pil == 1 || pil == 2 || pil > 3 || pil < 1);
                    break;

                case 3:
                    do {
                        System.out.println("  Menu  ");
                        System.out.println("1. Luas  ");
                        System.out.println("2. Volume  ");
                        System.out.println("3. Kembali  ");
                        System.out.print("Pilih :  ");
                        pil = scanner.nextInt();
                        //Luas Balok
                        if (pil == 1) {
                            System.out.print("Masukan Panjang Balok = ");
                            s1 = scanner.nextDouble();
                            System.out.print("Masukan Tinggi Balok = ");
                            s2 = scanner.nextDouble();
                            System.out.print("Masukan Lebar Balok = ");
                            s3 = scanner.nextDouble();
                            Double luasBalok;
                            luasBalok = perhitungan.luasBalok(s1, s2, s3);
                            System.out.println("Luas = " + luasBalok);
                        } else if (pil == 2) {
                            System.out.print("Masukkan Panjang : ");
                            s1 = scanner.nextDouble();
                            System.out.print("Masukkan Luas : ");
                            s2 = scanner.nextDouble();
                            System.out.print("Masukkan Tinggi : ");
                            s3 = scanner.nextDouble();
                            Double volumeBalok;
                            volumeBalok = perhitungan.volumeBalok(s1, s2, s3);
                            System.out.println("Volume = " + volumeBalok);
                        } else if (pil == 3) {
                            System.out.println(" ");
                        } else {
                            System.out.println("Eror");
                        }

                    } while (pil == 1 || pil == 2 || pil > 3 || pil < 1);
                    break;

                case 4:
                    System.out.println("Terima Kasih");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Maaf pilihan anda tidak tersedia ");
                    break;
            }


        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih > 4 || pilih < 1);

    }

}

