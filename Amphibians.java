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
public class Amphibians extends Animal {

    private String thuocLoai;
    private String moiTruongSong;

    public String getThuocLoai() {
        return thuocLoai;
    }

    public void setThuocLoai(String thuocLoai) {
        this.thuocLoai = thuocLoai;
    }

    public String getMoiTruongSong() {
        return moiTruongSong;
    }

    public void setMoiTruongSong(String moiTruongSong) {
        this.moiTruongSong = moiTruongSong;
    }

    public void nhap() {
        System.out.println("----------Nhap Amphibians------------");
        super.nhap̣̣̣();
        System.out.println("Nhap loai: ");
        thuocLoai = sc.nextLine();
        System.out.println("Nhap moi truong song: ");
        moiTruongSong = sc.nextLine();
        System.out.println("--------------------------------------");

    }

    @Override
    public void xuat() {
        System.out.println("------------Xuat Amphibians--------------");
        super.xuat();
        System.out.println("Thuoc loai: " + thuocLoai);
        System.out.println("Moi truong song: " + moiTruongSong);
        System.out.println("----------------------------------------");
    }

}
