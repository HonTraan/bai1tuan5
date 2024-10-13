/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai1tuan5;

import com.mycompany.bai1tuan5.HOCSINH;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class SINHVIEN extends HOCSINH{ 
    private int NCKH;

    public SINHVIEN(String hovaten, String ngaysinh, String gioitinh) {
        super(hovaten, ngaysinh, gioitinh);
    }
    public void Nhap(){
        super.Nhap();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap nghien cuu khoa hoc:");
        NCKH=scanner.nextInt();
    }
    public int XetKhenThuong(){
        if(DTB>=9&&NCKH==1)
  {
         return 1;
       }else{
         return 0;
       }
    }
    public void ThongbaoKQKhenThuong(){
       if(XetKhenThuong()==1)
       {
           System.out.println(hovaten+"duoc de xuat");
       }else 
       {
           System.out.println(hovaten+"khong duoc de xuat");
       }
   }
    
}
    
