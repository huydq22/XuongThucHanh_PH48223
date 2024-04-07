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
public class QL_Animal {

    public static void main(String[] args) {
        Zoo zo = new Zoo();
        int chon;
       while(true) {
            Scanner sc = new Scanner(System.in);
            menu();
            System.out.println("Moi ban chon chuc nang: ");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 0:
                    System.out.println("Thoat");
                    System.exit(0);
                case 1:
                    zo.CN1();
                    break;
                case 2:
                    zo.CN2();
                    break;
                case 3:
                   zo.sua();

                    break;
                case 4:
                    System.out.println("Vui long nhap ma Dong vat ");
                    String maDv = sc.nextLine();
                    zo.xoaDongVat(maDv);
                    break;
                case 5:
                    zo.xoaTheoTen();
                    break;
                case 6:
                    zo.timkiemTheoMa();
                    break;
                case 7:
                    zo.timKiemTheoTen();
                    break;
                case 8:
                    zo.timdvTheoCanNang();
                    break;
                case 9:
                    zo.xapXepTen();
                    break;
                case 10:
                    menu();
                    break;
            }

        } 

    }
    public static void menu(){
         System.out.println("--------------------Menu---------------------");
            System.out.println("0.Thoat");
            System.out.println("1.Nhap Animal.");
            System.out.println("2.Xuat Animal.");
            System.out.println("3.sửa Animal theo mã.");
            System.out.println("4.Xóa Animal theo mã");
            System.out.println("5.Xóa Animal theo tên.");
            System.out.println("6.Tim kiếm theo mã.");
            System.out.println("7.Tìm kiếm theo ten.");
            System.out.println("8.Tìm Animal theo cân nặng.");
            System.out.println("9.Sap xep theo tên.");
            System.out.println("10.Menu.");
            System.out.println("-----------------------------------------------");
    }

}
