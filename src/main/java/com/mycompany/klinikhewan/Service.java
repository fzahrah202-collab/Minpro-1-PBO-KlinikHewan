package com.mycompany.klinikhewan;

import java.util.ArrayList;
import java.util.Scanner;

public class Service {

    private ArrayList<Hewan> daftarHewan;
    private ArrayList<Pemilik> daftarPemilik;
    private ArrayList<Pemeriksaan> daftarPemeriksaan;

    private Scanner scanner;

    public Service(Scanner scanner) {
        this.daftarHewan = new ArrayList<>();
        this.daftarPemilik = new ArrayList<>();
        this.daftarPemeriksaan = new ArrayList<>();
        this.scanner = scanner;
    }

    public void tambahData() {

        System.out.println("\n=== TAMBAH DATA KLINIK ===");

        System.out.print("ID Data: ");
        int idData = scanner.nextInt();
        scanner.nextLine();

        // Data Pemilik
        System.out.println("\n--- Data Pemilik ---");

        System.out.print("Nama Pemilik: ");
        String namaPemilik = scanner.nextLine();

        System.out.print("No. Telepon: ");
        String noTelepon = scanner.nextLine();

        Pemilik pemilikBaru = new Pemilik(idData, namaPemilik, noTelepon);

        daftarPemilik.add(pemilikBaru);

        // Data Hewan
        System.out.println("\n--- Data Hewan ---");

        System.out.print("Nama Hewan: ");
        String namaHewan = scanner.nextLine();

        System.out.print("Jenis Hewan: ");
        String jenisHewan = scanner.nextLine();

        System.out.print("Umur Hewan: ");
        String umur = scanner.nextLine();

        Hewan hewanBaru = new Hewan(idData, namaHewan, jenisHewan, umur);

        daftarHewan.add(hewanBaru);

        // Data Pemeriksaan
        System.out.println("\n--- Data Pemeriksaan ---");

        System.out.print("Keluhan: ");
        String keluhan = scanner.nextLine();

        System.out.print("Diagnosa: ");
        String diagnosa = scanner.nextLine();

        Pemeriksaan pemeriksaanBaru = new Pemeriksaan(idData, keluhan, diagnosa);

        daftarPemeriksaan.add(pemeriksaanBaru);

        System.out.println("\n>> Data klinik berhasil ditambahkan!");
    }

    // TAMPILKAN DATA
    public void tampilkanData() {

        if (daftarHewan.isEmpty()) {
            System.out.println("\nBelum ada data klinik.");
            return;
        }
        
        System.out.println("===========================");
        System.out.println("\n=== DATA KLINIK HEWAN ===");

        for (int i = 0; i < daftarHewan.size(); i++) {

            Hewan h = daftarHewan.get(i);
            Pemilik p = daftarPemilik.get(i);
            Pemeriksaan pm = daftarPemeriksaan.get(i);

            System.out.println("\n=========================");
            System.out.println("ID Data: " + h.getIdData());

            System.out.println("\n--- Data Pemilik ---");
            System.out.println("Nama Pemilik: " + p.getNamaPemilik());
            System.out.println("No. Telepon: " + p.getNoTelepon());

            System.out.println("\n--- Data Hewan ---");
            System.out.println("Nama Hewan: " + h.getNamaHewan());
            System.out.println("Jenis Hewan: " + h.getJenisHewan());
            System.out.println("Umur Hewan: " + h.getUmur());

            System.out.println("\n--- Data Pemeriksaan ---");
            System.out.println("Keluhan: " + pm.getKeluhan());
            System.out.println("Diagnosa: " + pm.getDiagnosa());

            System.out.println("=========================");
        }
    }

    // HAPUS DATA
    public void hapusData() {

        System.out.print("\nMasukkan ID Data: ");
        int idTarget = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < daftarHewan.size(); i++) {

            if (daftarHewan.get(i).getIdData() == idTarget) {

                daftarHewan.remove(i);
                daftarPemilik.remove(i);
                daftarPemeriksaan.remove(i);

                System.out.println(">> Data klinik berhasil dihapus!");
                return;
            }
        }

        System.out.println(">> Data tidak ditemukan!");
    }

    // UPDATE DATA
    public void updateData() {

        System.out.print("\nMasukkan ID Data: ");
        int idTarget = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < daftarHewan.size(); i++) {

            Hewan h = daftarHewan.get(i);

            if (h.getIdData() == idTarget) {

                Pemilik p = daftarPemilik.get(i);
                Pemeriksaan pm = daftarPemeriksaan.get(i);

                System.out.println("\n=== UPDATE DATA KLINIK ===");

                // Update Pemilik
                System.out.println("\n--- Data Pemilik ---");

                System.out.print("Nama Pemilik Baru: ");
                String namaPemilikBaru = scanner.nextLine();

                System.out.print("No. Telepon Baru: ");
                String noTeleponBaru = scanner.nextLine();

                // Update Hewan
                System.out.println("\n--- Data Hewan ---");

                System.out.print("Nama Hewan Baru: ");
                String namaHewanBaru = scanner.nextLine();

                System.out.print("Jenis Hewan Baru: ");
                String jenisHewanBaru = scanner.nextLine();

                System.out.print("Umur Hewan Baru: ");
                String umurBaru = scanner.nextLine();

                // Update Pemeriksaan
                System.out.println("\n--- Data Pemeriksaan ---");

                System.out.print("Keluhan Baru: ");
                String keluhanBaru = scanner.nextLine();

                System.out.print("Diagnosa Baru: ");
                String diagnosaBaru = scanner.nextLine();

                // Menyimpan perubahan
                p.setNamaPemilik(namaPemilikBaru);
                p.setNoTelepon(noTeleponBaru);

                h.setNamaHewan(namaHewanBaru);
                h.setJenisHewan(jenisHewanBaru);
                h.setUmur(umurBaru);

                pm.setKeluhan(keluhanBaru);
                pm.setDiagnosa(diagnosaBaru);

                System.out.println("\n>> Data klinik berhasil diperbarui!");
                return;
            }
        }

        System.out.println(">> Data tidak ditemukan!");
    }
}