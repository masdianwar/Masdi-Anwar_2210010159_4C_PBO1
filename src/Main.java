/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
// Main.java (Update)
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Helm> listHelm = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("1. Tambah Helm Full Face");
                System.out.println("2. Tambah Helm Half Face");
                System.out.println("3. Tampilkan Semua Helm");
                System.out.println("4. Keluar");
                System.out.print("Pilih menu: ");
                int menu = scanner.nextInt();

                if (menu == 1) {
                    System.out.print("Merk: ");
                    String merk = scanner.next();
                    System.out.print("Harga: ");
                    double harga = scanner.nextDouble();
                    System.out.print("Sun Visor (true/false): ");
                    boolean sunVisor = scanner.nextBoolean();
                    listHelm.add(new HelmFullFace(merk, harga, sunVisor));
                } else if (menu == 2) {
                    System.out.print("Merk: ");
                    String merk = scanner.next();
                    System.out.print("Harga: ");
                    double harga = scanner.nextDouble();
                    System.out.print("Kaca Anti Baret (true/false): ");
                    boolean kacaAntiBaret = scanner.nextBoolean();
                    listHelm.add(new HelmHalfFace(merk, harga, kacaAntiBaret));
                } else if (menu == 3) {
                    for (Helm helm : listHelm) {
                        helm.displayInfo();
                        System.out.println();
                    }
                } else if (menu == 4) {
                    break;
                } else {
                    System.out.println("Menu tidak valid!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid! Silakan coba lagi.");
                scanner.next(); // Membersihkan input yang tidak valid
            }
        }
    }
}

