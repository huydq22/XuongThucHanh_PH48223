    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xuongthuhanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author whath
 */
public class Zoo {

    ArrayList<Animal> listAnimal = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    int c;

    public void CN1() {
        System.out.println("Nhap so luong Animal: ");
        c = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < c; i++) {
            System.out.println("Nhap dong vat thuc " + (i + 1) + "");
            System.out.println("1-Mammal 2-Bird 3-Fish 4-Reptile 5-Amphibians");
            int chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    Mammal mm = new Mammal();
                    mm.nhap();
                    listAnimal.add(mm);
                    break;

                case 2:
                    Bird b = new Bird();
                    b.nhap();
                    listAnimal.add(b);
                    break;
                    
                case 3:
                    Fish f = new Fish();
                    f.nhap();
                    listAnimal.add(f);
                    break;
                    
                case 4:
                    Reptile r = new Reptile();
                    r.nhap();
                    listAnimal.add(r);
                    break;
                    
                case 5:
                    Amphibians apb = new Amphibians();
                    apb.nhap();
                    listAnimal.add(apb);
                    break;
            }
        }
    }
    

    public void CN2(){
        for (Animal anm : listAnimal) {
            anm.xuat();
        }
    }
       
    public void xoaDongVat(String maDv) {
        for (Animal animal : listAnimal) {
            if(animal.getMaDongVat().equals(maDv)){
                listAnimal.remove(maDv);
                System.out.println("Xóa thanh cong dong vat");
            }else {
                System.out.println("Ma Dong vat khong ton tai");
            }
            
        }
        
    }
 
     public void sua() {
        System.out.println("Moi ban nhap vao ma dong vat muon sua : ");
        String ma = new Scanner(System.in).nextLine();
        for (Animal item : listAnimal) {
            if(item.getMaDongVat().equalsIgnoreCase(ma))
            {
                item.nhap̣̣̣();
            }
        }
         
    }
    
    public void xoaTheoTen () {
         System.out.println("Moi ban nhap vao ten dong vat muon xoa ");
         String ten = new Scanner(System.in).nextLine();
         for (Animal item : listAnimal ) {
             if (item.getMaDongVat().equalsIgnoreCase(ten)) {
                 listAnimal.remove(item);
                 break;
             }
         }
         CN2();
     }
     public void timKiemTheoTen () {
          System.out.println("Moi ban nhap vao ten dong vat muon tim ");
         String ten = new Scanner(System.in).nextLine();
         for (Animal item : listAnimal ) {
             if (item.getMaDongVat().equalsIgnoreCase(ten)) {
                
                 item.xuat();
                 break;
             }
         }
     }
     public void timkiemTheoMa() {
         System.out.println("Moi ban nhap vao ma dong vat muon tim kiem : ");
          String ma = new Scanner(System.in).nextLine();
          
         for (Animal item : listAnimal ) {
             listAnimal.indexOf(ma);
             if (item.getMaDongVat().equalsIgnoreCase(ma)) {
                  
                 item.xuat();
                 break;
             }
         }
     }

    public void xapXepTen() {
        Comparator<Animal> comp = new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.getTenDongVat().compareTo(o2.getTenDongVat());
            }
        };
        Collections.sort(listAnimal, comp);
        CN2();
    }
    public void timdvTheoCanNang () {
        System.out.print("Moi ban nhap khoang can nang toi thieu : ");
        int tt = new Scanner(System.in).nextInt(); 
        System.out.print("Moi ban nhap khoang can nang toi da : ");
        int td = new Scanner(System.in).nextInt(); 
        for (Animal item : listAnimal ) {
            if (item.getCanNang()> tt && item.getCanNang()< td) {
                
                item.xuat();
                break;
            }
        }
     }
    
}
