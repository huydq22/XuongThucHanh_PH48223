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
public class Fish extends Animal {

    private String loaiCa;
    private String tocDoBoi;



    public void nhap() {
        System.out.println("----------Nhap Fish-----------");
        super.nhap̣̣̣();
        System.out.println("Nhap Loai ca: ");
        loaiCa = sc.nextLine();
        System.out.println("Nhap toc do boi: ");
        tocDoBoi = sc.nextLine();
        System.out.println("------------------------------");

    }

    @Override
    public void xuat() {
        System.out.println("-----------Xuat Fish--------");
        super.xuat();
        System.out.println("Loai ca: "+loaiCa);
        System.out.println("Toc do boi: "+tocDoBoi);
        System.out.println("----------------------------");   
    }
}
