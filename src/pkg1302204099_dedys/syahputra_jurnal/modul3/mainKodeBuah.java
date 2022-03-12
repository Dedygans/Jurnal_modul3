/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1302204099_dedys.syahputra_jurnal.modul3;

import java.util.Scanner;

/**
 *
 * @author dedyh
 */
public class mainKodeBuah {
      public static void main(String[] args) {
          try (Scanner input = new Scanner(System.in)) {
              System.out.print("Masukkan nama buah : ");
              String kl = input.nextLine();
              System.out.println(KodeBuah.getKodeBuah(kl));
          }
    }
}
