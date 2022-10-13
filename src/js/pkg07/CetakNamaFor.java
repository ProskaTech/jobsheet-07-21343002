/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package js.pkg07;

import java.util.Scanner;

/**
 *
 * Created by 21343002_Aini Rizkina
 */
public class CetakNamaFor {
    public static void main (String []args){
    Scanner in = new Scanner(System.in);
    int Nama;
    
    System.out.print("Masukkan nama lengkap: ");
    String nama = in.nextLine();
    
        for (Nama = 0 ; Nama < 10; Nama++ )
            System.out.println(nama);
    }
    
}
