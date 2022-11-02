/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;

/**
 *
 * @author revin
 */
public class TugasBMI {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double tb,bb,hasil;
        String nama,jk;
        
        
    
        
        
        
        System.out.println("Masuka nama anda : ");
        nama =input.next();
        
        System.out.println("Masukan Tinggi badan (cm) :");
        tb =input.nextDouble();
        
        System.out.println("Masukan Berat Badan (kg):");
        bb =input.nextDouble();
        
        
        tb /=100;
        hasil= bb/(tb*tb);
        
        System.out.println("Nama anda :"+nama);
        System.out.println("BMI anda adalah :"+hasil);
        
        if (hasil < 18.5) {
            System.out.println("kekurangan berat badan");
            
        }
        else if (hasil > 18.5 && hasil <24.9) {
            System.out.println("Normal (ideal) ");
            
        }
        else if (hasil > 25.00 && hasil <29.9) {
            System.out.println("Kelebihan berat badan");
            
        }
        else if (hasil > 30.00) {
            System.out.println("Kegemukan (obesitas)");
            
        }
        
        
        
           }
        
    }
    
    

