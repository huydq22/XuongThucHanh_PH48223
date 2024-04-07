/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xuongthuhanh;

/**
 *
 * @author whath
 */
public class Mammal extends Animal {

    private String thuocLoai;
    private int soLuongDe;

  
    public void nhap() {
        System.out.println("--------Nhap Mammal-----------");
        super.nhap̣̣̣();
        System.out.println("Nhap chung loai: ");
        thuocLoai = sc.nextLine();
        System.out.println("So luong de: ");
        soLuongDe = sc.nextInt();
        System.out.println("------------------------------");

    }

    @Override
    public void xuat() {
        System.out.println("-----------Xuat Mammal------------");
        super.xuat();
        System.out.println("Thuoc loai: " + thuocLoai);
        System.out.println("So luong: " + soLuongDe);
        System.out.println("----------------------------------");
        
    }

}
