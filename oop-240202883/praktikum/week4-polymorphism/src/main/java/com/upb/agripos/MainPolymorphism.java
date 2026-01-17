package com.upb.agripos;

import com.upb.agripos.model.*;
import com.upb.agripos.util.CreditBy;

public class MainPolymorphism {
    public static void main(String[] args) {
        // Dynamic Binding menggunakan Array
        Produk[] daftarProduk = {
            new Benih("BNH-01", "Benih Padi", 25000, 50, "Cianjur"),
            new Pupuk("PPK-02", "Urea Petro", 150000, 20, "Kimia"),
            new Produk("GEN-03", "Plastik Mulsa", 50000, 10)
        };

        System.out.println("=== INFO PRODUK AGRI-POS ===");
        for (Produk p : daftarProduk) {
            // Java akan menentukan method mana yang dipanggil saat runtime
            System.out.println(p.getInfo()); 
        }

        // Contoh Overloading
        daftarProduk[0].tambahStok(10);      // Memanggil versi int
        daftarProduk[1].tambahStok(5.5);    // Memanggil versi double

        // Tampilkan Identitas Rizal
        CreditBy.print("240202883", "Rizal Ramadani");
    }
}