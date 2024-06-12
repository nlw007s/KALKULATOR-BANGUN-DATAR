import java.util.Scanner;
import java.math.*;
public class Main {
    public static void main(String[] args) {

        String answer;
        int choice;
        int choiceHitung;
        int s_choice;
        int s_at_choice;
        int trp_choice;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("PERHITUNGAN KELILING DAN LUAS BANGUN DATAR\n");

        System.out.print("Apakah Anda ingin memulai perhitungan? (Y/N)\nMasukkan Pilihan : ");
        answer = keyboard.next();

        while (answer.equalsIgnoreCase("y")) {
            System.out.println("\n\nMasukkan Pilihan Anda!\n");
            System.out.print("1. Persegi\n2. Persegi Panjang\n3. Segitiga\n4. Lingkaran\n5. Trapesium\n\nPilihan Anda : ");
            choice = keyboard.nextInt();

            switch (choice) {
                case 1 :
                    System.out.println("\n>>> HITUNG PERSEGI <<<");
                    H_Persegi p1 = new H_Persegi();

                    System.out.print("Masukkan nilai sisi : ");
                    p1.setS(keyboard.nextInt());

                    System.out.print("Mau hitung apa?\n1. Keliling\n2. Luas\nMasukkan pilihan Anda : ");
                    choiceHitung = keyboard.nextInt();

                    if (choiceHitung == 1) {
                        p1.h_keliling();
                        System.out.println("Hasil keliling yang didapatkan adalah : " + p1.hasil);
                    } else if (choiceHitung == 2) {
                        p1.h_luas();
                        System.out.println("Hasil luas yang didapatkan adalah : " + p1.hasil);
                    }
                    System.out.println("Perhitungan Selesai!");

                    break;



                case 2 :
                    System.out.println("\n>>> HITUNG PERSEGI PANJANG <<<");
                    H_PersegiPanjang pp1 = new H_PersegiPanjang();

                    System.out.print("Masukkan nilai panjang : ");
                    pp1.setPanjang(keyboard.nextInt());

                    System.out.print("Masukkan nilai lebar : ");
                    pp1.setLebar(keyboard.nextInt());

                    System.out.print("Mau hitung apa?\n1. Keliling\n2. Luas\nMasukkan pilihan Anda : ");
                    choiceHitung = keyboard.nextInt();

                    if (choiceHitung == 1) {
                        pp1.h_keliling();
                        System.out.println("Hasil keliling yang didapatkan adalah : " + pp1.hasil);
                    } else if (choiceHitung == 2) {
                        pp1.h_luas();
                        System.out.println("Hasil luas yang didapatkan adalah : " + pp1.hasil);
                    }
                    System.out.println("Perhitungan Selesai!");

                    break;



                case 3 :
                    System.out.println("\n>>> HITUNG SEGITIGA <<<");
                    System.out.println("\nPilih salah satu pilihan di bawah ini!\n1. Masukkan alas dan tinggi saja\n2. Segitiga sama sisi\n3. Segitiga sama kaki\n4. Segitiga siku-siku");
                    System.out.print("\nMasukkan pilihan Anda : ");
                    s_choice = keyboard.nextInt();

                    if (s_choice == 1) {

                        System.out.print("\nMasukkan pilihan segitiga yang akan dihitung nilai luas-nya: ");
                        System.out.println("\n1. Segitiga sama sisi\n2. Segitiga sama kaki\n3. Segitiga siku-siku");
                        System.out.print("\nPilihan = ");
                        s_at_choice = keyboard.nextInt();

                        switch (s_at_choice) {

                            case 1 :
                                System.out.println("\n\nSEGITIGA SAMA SISI");
                                H_Segitiga hSgss = new H_SGSS();

                                System.out.print("\nMasukkan nilai alas : ");
                                hSgss.setAlas(keyboard.nextInt());

                                System.out.print("Masukkan nilai tinggi : ");
                                hSgss.setTinggi(keyboard.nextInt());

                                System.out.println("\nalas = " + hSgss.alas);
                                System.out.println("tinggi = " + hSgss.tinggi);

                                System.out.println("Perhitungan Selesai!");

                                break;


                            case 2 :
                                System.out.println("\n\nSEGITIKA SAMA KAKI");
                                H_Segitiga hSgsk = new H_SGSK();

                                System.out.print("\nMasukkan nilai alas : ");
                                hSgsk.setAlas(keyboard.nextInt());

                                System.out.print("Masukkan nilai tinggi : ");
                                hSgsk.setTinggi(keyboard.nextInt());

                                System.out.println("\nalas = " + hSgsk.alas);
                                System.out.println("tinggi = " + hSgsk.tinggi);

                                System.out.println("Perhitungan Selesai!");

                                break;


                            case 3 :
                                System.out.println("\n\nSEGITIKA SIKU-SIKU");
                                H_Segitiga hSgsksk = new H_SGSKSK();

                                System.out.print("\nMasukkan nilai alas : ");
                                hSgsksk.setAlas(keyboard.nextInt());

                                System.out.print("Masukkan nilai tinggi : ");
                                hSgsksk.setTinggi(keyboard.nextInt());

                                System.out.println("\nalas = " + hSgsksk.alas);
                                System.out.println("tinggi = " + hSgsksk.tinggi);

                                System.out.println("Perhitungan Selesai!");

                                break;
                        }
                    }

                    else if (s_choice == 2) {
                        H_SGSS hSgss1 = new H_SGSS();

                        System.out.print("Masukkan nilai sisi : ");
                        hSgss1.setS(keyboard.nextInt());

                        hSgss1.setAlas(hSgss1.s);
                        hSgss1.setTinggi(hSgss1.s);

                        System.out.print("Mau hitung apa?\n1. Keliling\n2. Luas\nMasukkan pilihan Anda : ");
                        choiceHitung = keyboard.nextInt();

                        if (choiceHitung == 1) {
                            hSgss1.h_keliling();
                            System.out.println("Hasil keliling yang didapatkan adalah : " + hSgss1.hasil);
                        } else if (choiceHitung == 2) {
                            hSgss1.h_luas();
                            System.out.println("Hasil luas yang didapatkan adalah : " + hSgss1.hasil);
                        }
                        System.out.println("Perhitungan Selesai!");

                    } else if (s_choice == 3) {
                        H_SGSK hSgsk1 = new H_SGSK();

                        System.out.print("Masukkan nilai kaki segitiga : ");
                        hSgsk1.setKaki(keyboard.nextInt());

                        System.out.print("Masukkan nilai alas : ");
                        hSgsk1.setAlas(keyboard.nextInt());

                        System.out.print("Masukkan nilai tinggi : ");
                        hSgsk1.setTinggi(keyboard.nextInt());

                        System.out.print("Mau hitung apa?\n1. Keliling\n2. Luas\nMasukkan pilihan Anda : ");
                        choiceHitung = keyboard.nextInt();

                        if (choiceHitung == 1) {
                            hSgsk1.h_keliling();
                            System.out.println("Hasil keliling yang didapatkan adalah : " + hSgsk1.hasil);
                        } else if (choiceHitung == 2) {
                            hSgsk1.h_luas();
                            System.out.println("Hasil luas yang didapatkan adalah : " + hSgsk1.hasil);
                        }
                        System.out.println("Perhitungan Selesai!");

                    } else if (s_choice == 4) {
                        H_SGSKSK hSgsksk1 = new H_SGSKSK();

                        System.out.print("Masukkan nilai sisi miring : ");
                        hSgsksk1.setSisiMiring(keyboard.nextInt());

                        System.out.print("Masukkan nilai alas : ");
                        hSgsksk1.setAlas(keyboard.nextInt());

                        System.out.print("Masukkan nilai tinggi : ");
                        hSgsksk1.setTinggi(keyboard.nextInt());

                        System.out.print("Mau hitung apa?\n1. Keliling\n2. Luas\nMasukkan pilihan Anda : ");
                        choiceHitung = keyboard.nextInt();

                        if (choiceHitung == 1) {
                            hSgsksk1.h_keliling();
                            System.out.println("Hasil keliling yang didapatkan adalah : " + hSgsksk1.hasil);
                        } else if (choiceHitung == 2) {
                            hSgsksk1.h_luas();
                            System.out.println("Hasil luas yang didapatkan adalah : " + hSgsksk1.hasil);
                        }
                        System.out.println("Perhitungan Selesai!");

                    }

                    break;



                case 4 :
                    System.out.println("\n>>> HITUNG LINGKARAN <<<");
                    H_Lingkaran l1 = new H_Lingkaran();

                    System.out.print("Masukkan nilai jari-jari : ");
                    l1.setR(keyboard.nextDouble());

                    System.out.print("Mau hitung apa?\n1. Keliling\n2. Luas\nMasukkan pilihan Anda : ");
                    choiceHitung = keyboard.nextInt();

                    if (choiceHitung == 1) {
                        l1.h_keliling();
                        System.out.println("Hasil keliling yang didapatkan adalah : " + l1.hasil);
                    } else if (choiceHitung == 2) {
                        l1.h_luas();
                        System.out.println("Hasil luas yang didapatkan adalah : " + l1.hasil);
                    }
                    System.out.println("Perhitungan Selesai!");

                    break;

                case 5 :
                    System.out.println("\n>>> HITUNG TRAPESIUM <<<");
                    System.out.println("\nPilih salah satu pilihan di bawah ini!\n1. Trapesium 2 sisi miring\n2. Trapesium siku-siku");
                    System.out.print("\nMasukkan pilihan Anda : ");
                    trp_choice = keyboard.nextInt();

                    switch(trp_choice) {

                        case 1 :
                            System.out.println("\n\nTRAPESIUM 2 SISI MIRING");
                            H_TRP hTrp = new H_TRP();

                            System.out.print("Mau hitung apa?\n1. Keliling\n2. Luas\nMasukkan pilihan Anda : ");
                            choiceHitung = keyboard.nextInt();

                            if (choiceHitung == 1) {
                                System.out.print("\nMasukkan nilai sisi miring 1 : ");
                                hTrp.setSm_1(keyboard.nextInt());

                                System.out.print("Masukkan nilai sisi miring 2 : ");
                                hTrp.setSm_2(keyboard.nextInt());

                                System.out.print("Masukkan nilai sisi atas : ");
                                hTrp.setSisi_atas(keyboard.nextInt());

                                System.out.print("Masukkan nilai sisi bawah : ");
                                hTrp.setSisi_bawah(keyboard.nextInt());

                                hTrp.h_keliling();
                                System.out.println("Hasil keliling yang didapatkan adalah : " + hTrp.hasil);

                            } else if (choiceHitung == 2) {
                                System.out.print("\nMasukkan nilai sisi atas : ");
                                hTrp.setSisi_atas(keyboard.nextInt());

                                System.out.print("Masukkan nilai sisi bawah : ");
                                hTrp.setSisi_bawah(keyboard.nextInt());

                                System.out.print("Masukkan nilai tinggi : ");
                                hTrp.setT(keyboard.nextInt());

                                hTrp.h_luas();
                                System.out.println("Hasil luas yang didapatkan adalah : " + hTrp.hasil);
                            }

                            break;


                        case 2 :
                            System.out.println("\n\nTRAPESIUM 2 SIKU-SIKU");
                            H_TRPSK hTrpSk = new H_TRPSK();

                            System.out.print("Mau hitung apa?\n1. Keliling\n2. Luas\nMasukkan pilihan Anda : ");
                            choiceHitung = keyboard.nextInt();

                            if (choiceHitung == 1) {
                                System.out.print("\nMasukkan nilai sisi miring : ");
                                hTrpSk.setSm(keyboard.nextInt());

                                System.out.print("Masukkan nilai tinggi : ");
                                hTrpSk.setT(keyboard.nextInt());

                                System.out.print("Masukkan nilai sisi atas : ");
                                hTrpSk.setSisi_atas(keyboard.nextInt());

                                System.out.print("Masukkan nilai sisi bawah : ");
                                hTrpSk.setSisi_bawah(keyboard.nextInt());

                                hTrpSk.h_keliling();
                                System.out.println("Hasil keliling yang didapatkan adalah : " + hTrpSk.hasil);

                            } else if (choiceHitung == 2) {
                                System.out.print("\nMasukkan nilai sisi atas : ");
                                hTrpSk.setSisi_atas(keyboard.nextInt());

                                System.out.print("Masukkan nilai sisi bawah : ");
                                hTrpSk.setSisi_bawah(keyboard.nextInt());

                                System.out.print("Masukkan nilai tinggi : ");
                                hTrpSk.setT(keyboard.nextInt());

                                hTrpSk.h_luas();
                                System.out.println("Hasil luas yang didapatkan adalah : " + hTrpSk.hasil);

                                break;
                            }
                    }

                    break;
            }
            System.out.print("\nMau lakukan perhitungan lagi? (Y/N)\nMasukkan Pilihan : ");
            answer = keyboard.next();
        }
        System.out.println("\n\nPROGRAM BERAKHIR, TERIMA KASIH!");
    }
}