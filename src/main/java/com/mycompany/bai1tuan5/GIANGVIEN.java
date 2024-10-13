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
public class GIANGVIEN extends GIAOVIEN {
    private int SoSV;
    public GIANGVIEN(String hovaten, String ngaysinh, String gioitinh, String Feedback, int SoSV) {
        super(Feedback,hovaten, ngaysinh, gioitinh);
        
    }
    public void Nhap(){
       super.Nhap();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap so sinh vien huong dan:");
        SoSV=scanner.nextInt();
    }
   public int XetKhenThuong(){
       if(SoSV>=10&&super.XetKhenThuong()>=4.5)
   {
         return 1;
       }else{
         return 0;
       }
   }
    @Override
   public void ThongbaoKQKhenThuong(){
       if(XetKhenThuong()==1)
       {
           System.out.println(hovaten+"duoc de xuat");
       }else{
           System.out.println(hovaten+"khong duoc de xuat");
       }
   }
}
  
