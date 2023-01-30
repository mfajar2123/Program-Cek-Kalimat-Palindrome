/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tes.magang.pkg2;

/**
 *
 * @author Fajar
 */
import java.util.Scanner;

public class TesMagang2 {

    public static void main(String[] args) {
        
        System.out.println("================================");
        System.out.println("================================");
        System.out.println(" Program Cek Kalimat Palindrome");
        System.out.println("       by Muhamad Fajar");
        System.out.println("================================");
        System.out.println("================================");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kalimat yang ingin dicek: ");
        String input = sc.nextLine();

        String kalimat = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder balikKalimat = new StringBuilder(kalimat);
        balikKalimat = balikKalimat.reverse();

        if (kalimat.equals(balikKalimat.toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Bukan Palindrome");
        }
    }
}
