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
public class Animal {
    private String maDongVat;
    private String tenDongVat;
    private String gioiTinh;
    private int kichThuoc;
    private int canNang;
    private String mauSac;
    private String thucAn;
    private int tuoi;

    public Animal() {
    }

    public Animal(String maDongVat, String tenDongVat, String gioiTinh, int kichThuoc, int canNang, String mauSac, String thucAn, int tuoi) {
        this.maDongVat = maDongVat;
        this.tenDongVat = tenDongVat;
        this.gioiTinh = gioiTinh;
        this.kichThuoc = kichThuoc;
        this.canNang = canNang;
        this.mauSac = mauSac;
        this.thucAn = thucAn;
        this.tuoi = tuoi;
    }

    public String getMaDongVat() {
        return maDongVat;
    }

    public void setMaDongVat(String maDongVat) {
        this.maDongVat = maDongVat;
    }

    public String getTenDongVat() {
        return tenDongVat;
    }

    public void setTenDongVat(String tenDongVat) {
        this.tenDongVat = tenDongVat;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(int kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getThucAn() {
        return thucAn;
    }

    public void setThucAn(String thucAn) {
        this.thucAn = thucAn;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
    Scanner sc = new Scanner(System.in);
    public void nhap̣̣̣(){
        System.out.println("Nhap ma dong vat: ");
        maDongVat = sc.nextLine();
        System.out.println("Nhap ten dong vat:");
        tenDongVat = sc.nextLine();
        System.out.println("Nhap gioi tinh:");
        gioiTinh=sc.nextLine();
         System.out.println("Nhap kich thuoc:");
        kichThuoc = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap can nang:");
        canNang = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten mau sac:");
        mauSac = sc.nextLine();
       
        System.out.println("Nhap thuc an:");
        thucAn = sc.nextLine();
        System.out.println("Nhap tuoi:");
        tuoi = Integer.parseInt(sc.nextLine());
    }
   
    public void xuat(){
        System.out.println("-----------------------------------------");
        System.out.println("ma dong vat: "+maDongVat);
        System.out.println("ten dong vat: "+tenDongVat);
        System.out.println("gioi tinh: "+gioiTinh);
        System.out.println("kich thuoc: "+kichThuoc);
        System.out.println("can nang: "+canNang);
        System.out.println("mau nang: "+mauSac);
        System.out.println("thuc an: "+thucAn);
        System.out.println("tuoi: "+tuoi);
    }
}
