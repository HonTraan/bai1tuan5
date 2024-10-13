package com.mycompany.bai1tuan5;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
 class Nguoi {
         String hovaten;
         String ngaysinh;
         String gioitinh;

    public Nguoi(String hovaten, String ngaysinh, String gioitinh) {
        this.hovaten = hovaten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
 
    }
    public String getHovaten() {
        return hovaten;
    }
    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
    }
    public String getNgaysinh() {
        return ngaysinh;
    }
    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    public String getGioitinh() {
        return gioitinh;
    }
    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }
    public void Nhap(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ho va ten:");
        hovaten=scanner.nextLine();
        System.out.println("Nhap ngay thang nam sinh:");
        ngaysinh=scanner.nextLine();
        System.out.println("Nhap gioi tinh:");
        gioitinh=scanner.nextLine();
    }
 }
    

 
 