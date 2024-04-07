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
public class Reptile extends Animal {

    private String loaiVay;
    private int kichThuocVay;
    private String thuocLoai;

    public void nhap() {
        System.out.println("-----------Nhap Reptile--------");
        super.nhap̣̣̣();
        System.out.println("Nhap loai vay: ");
        loaiVay = sc.nextLine();
        System.out.println("Nhap kich thuoc vay: ");
        kichThuocVay = Integer.parseInt(sc.nextLine());;
        System.out.println("Nhap loai: ");
        thuocLoai = sc.nextLine();
        System.out.println("------------------------------");

    }

    @Override
    public void xuat() {
        System.out.println("-----------Xuat Reptile-----------");
        super.xuat();
        System.out.println("Loai vay: " + loaiVay);
        System.out.println("Kich thuoc vay: " + kichThuocVay);
        System.out.println("Thuoc loai: " + thuocLoai);
        System.out.println("------------------------------");
    }

}
