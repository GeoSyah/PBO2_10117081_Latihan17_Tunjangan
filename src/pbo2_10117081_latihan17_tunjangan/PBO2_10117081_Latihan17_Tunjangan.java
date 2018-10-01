/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan17_tunjangan;

import java.util.Scanner;

/**
 *
 * @author Geo Syah Alkautsar
 * NIM : 10117081
 * Kelas : IF2/PBO2
 * Deskripsi Program : Program Tunjangan Karyawan Berdasarkan Status Pernikahan
 *              dan gaji Pokok
 */
public class PBO2_10117081_Latihan17_Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        double gajiPokok = 0;
        double tunjangan = 0;
        double totalGaji = 0;
        String status;
        String status1 = "Menikah";
        String status2 = "Belum";
        
        Scanner isi = new Scanner(System.in);
        
        System.out.println("====== Program Tunjangan ======");
        System.out.print("Berapa Gaji Pokok Anda Perbulan?\t: Rp. ");
        gajiPokok = isi.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum)\t: ");
        status = isi.next();
        System.out.println("====== Hasil Perhitungan Gaji Anda ======");
        System.out.println("Gaji Pokok\t : Rp.  " + gajiPokok);
        if (status.equals(status1)){
            tunjangan = gajiPokok * 0.35;
            System.out.println("Tunjangan\t : Rp.  " + tunjangan);
        } else {
            System.out.println("Tunjangan\t : Rp.  " + tunjangan);
        }
        totalGaji = gajiPokok + tunjangan;
        System.out.println("Total Gaji\t : Rp.  " + totalGaji);
    }
    
}
