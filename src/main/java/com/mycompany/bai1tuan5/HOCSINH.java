/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai1tuan5;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class HOCSINH extends Nguoi{
    float DTB;
    public HOCSINH(String hovaten, String ngaysinh, String gioitinh) {
        super(hovaten, ngaysinh, gioitinh);
    }
   
    @Override
    public void Nhap(){
       super.Nhap();
       Scanner scanner=new Scanner(System.in);
       System.out.println("Diem trung binh:");
       DTB=scanner.nextFloat();
      
   }
   public int XetKhenThuong(){
      if(DTB>=9)
   {
         return 1;
       }else{
         return 0;
       }
   
   }
   public void ThongbaoKQKhenThuong(){
       if(XetKhenThuong()==1)
       {
           System.out.println(hovaten+"duoc khen thuong");
       }else 
       {
           System.out.println(hovaten+"khong duoc khen thuong");
       }
   }
    }  
