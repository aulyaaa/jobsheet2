/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Aulya {
    public static void main(String args[]){
        AulyaDina Aulya = new AulyaDina();
        Aulya.setnamaAyah ("Mashudi");
        Aulya.setnamaIbu ("Mutmainah");
        Aulya.setnamaSendiri ("Aulya Dina Rifqiah");
        Aulya.setnamaSaudara ("M. Havidz Royyan");
        Aulya.setAlamat ("Jl. Gobis Baru Bumiayu, Malang");
        Aulya.setHobi ("Fotografi dan Hiking");
        Aulya.setCitacita ("Director");
        Aulya.setUmur(16);
        
        System.out.println("Nama Ayah       : " + Aulya.getnamaAyah());
        System.out.println("Nama Ibu        : " + Aulya.getnamaIbu());
        System.out.println("Nama Sendiri    : " + Aulya.getnamaSendiri());
        System.out.println("Nama Saudara    : " + Aulya.getnamaSaudara());
        System.out.println("Alamat          : " + Aulya.getAlamat());
        System.out.println("Hobi            : " + Aulya.getHobi());
        System.out.println("Cita - Cita     : " + Aulya.getCitacita());
        System.out.println("Umur            : " + Aulya.getUmur());
    }
}
