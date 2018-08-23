/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author user
 */
public class Bus3 {
    public int penumpang;
    public int maxpenumpang;
    private double average;
    public Bus3(int maxpenumpang){
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    //Method Mutator
    public void addpenumpang(int penumpang){
        int temp;
        temp = this.penumpang+penumpang;
        if ( temp>maxpenumpang){
            System.out.println("penumpang melebihi kuota");
        }
        else
        {
            this.penumpang=temp;
        }   
    }
    public void getpenumpang(int password)
    {
        if (password==24){
            System.out.println("Password Benar");
        }
        else
        {
            System.out.println("Password Salah");
        }
    }
    public void cetakpenumpang()
    {
        System.out.println("penumpang Bus sekarang = "+penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah = "+maxpenumpang);
    }
    public void getAverage(){
        double penumpang, average;
        penumpang = this.penumpang + this.maxpenumpang;
        average = penumpang / 2;
        System.out.println("Rata - rata penumpang Hari ini adalah = "+ average);
    }
}
