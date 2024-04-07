/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xuongthuhanh;

import java.util.Scanner;

/**
 *
 * @author whath
 */
public class Bird extends Animal{
    private String loaiChim;
    private int kichThuocCanh;
    private String khaNangBay;
    private String khaNangHot;

   
    
    public void nhap(){
        System.out.println("---------Nhap bird--------");
        super.nhap̣̣̣();
        System.out.println("Nhap loai chim: ");
        loaiChim = sc.nextLine();
        System.out.println("Nhap kich thuoc canh: ");
        kichThuocCanh = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap kha nang bay: ");
        khaNangBay = sc.nextLine();
        System.out.println("Nhap kha nang hot: ");
        khaNangHot = sc.nextLine();
        System.out.println("------------------------------");
        
        
    }
   
    @Override
    public void xuat(){
        System.out.println("----------Xuat Bird-----------");
        super.xuat();
        System.out.println("loai chim: "+loaiChim);
        System.out.println("kich thuoc canh: "+kichThuocCanh);
        System.out.println("kha nang bay: "+khaNangBay);
        System.out.println("kha nang hot: "+khaNangHot);
        System.out.println("------------------------------");
        
    }
  
    
}
