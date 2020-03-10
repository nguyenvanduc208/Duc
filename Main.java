/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.ass;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyNhanVien nv = new QuanLyNhanVien();
        while (true) {
            menu();
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    nv.nhapNV();
                    break;
                case 2:
                    nv.xuatDs();
                    break;
                case 3:
                    nv.timNV();
                    break;
                case 4:
                    nv.xoaTheoMa();
                    break;
                case 5:
                    nv.capNhat();
                    break;
                case 6:
                    nv.timTheoLuong();
                    break;
                case 7:
                    nv.sapXepTen();
                    break;
                case 8:
                    nv.sapXepLuong();
                    break;
                case 9:
                    nv.xuat5NvThuNhapCao();
                    break;
                case 0:
                    System.out.println("Ban chon thoat!!");
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("\n\n>>>>>> PHAN MEM QUAN LY NHAN VIEN <<<<<<<");
        System.out.println("   1.Nhap danh sach nhan vien");
        System.out.println("   2.Xuat danh sach nhan vien");
        System.out.println("   3.Tim va hien thi nhan vien theo ma");
        System.out.println("   5.Cap nhat thong tin nhan vien theo ma");
        System.out.println("   6.Tim nhan vien theo luong");
        System.out.println("   7.Sap xep nhan vien theo ho va ten");
        System.out.println("   8.Sap xep nhan vien theo thu nhap");
        System.out.println("   9.Xuat 5 nhan vien co thu nhap cao nhat");
        System.out.println("   0.Thoat");
        System.out.print("Moi chon chuc nang! :  ");

    }

}
