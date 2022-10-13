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
public class CetakAngkaWhile {
    public static void main(String []args){
       Scanner in = new Scanner(System.in);
       int i = 20;
       
       System.out.print("Masukkan nama lengkap: ");
       String nama = in.nextLine();
       while (i >= 1)
       {
           System.out.println(nama);
           i -= 1;
       }
   } 
}
