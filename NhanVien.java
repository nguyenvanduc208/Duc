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
public class NhanVien {

    private String maNV;
    private String tenNV;
    double luongNV;

    Scanner sc = new Scanner(System.in);
    Scanner scTen = new Scanner(System.in);

    public NhanVien() {
    }

    public NhanVien(String maNV, String tenNV, double luongNV) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luongNV = luongNV;

    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public double getLuongNV() {
        return luongNV;
    }

    public void setLuongNV(double luongNV) {
        this.luongNV = luongNV;
    }

    //Nhập thông tin nhân viên
    public void nhapNV() {
        System.out.println("NHAP THONG TIN NHAN VIEN");
        System.out.print("Ma NV: ");
        maNV = scTen.nextLine();
        maNV.trim();
        System.out.print("Ten NV: ");
        tenNV = scTen.nextLine();
        tenNV.trim();
        System.out.print("Luong: ");
        luongNV = sc.nextDouble();
    }

    //Xuất danh sách nhân viên
    public void xuatNV() {
        System.out.format("%-10s", maNV);
        System.out.format("%-20s", tenNV);
        System.out.format("%-15.1f", luongNV);

    }

    //Tính lương nhân viên
    public double tinhLuong() {
        return 0;
    }

    //Tính thuế
    public double tinhThue() {
        double thue;
        if (tinhLuong() < 9000000) {
            thue = 0;
        } else if (tinhLuong() < 15000000) {
            thue = (tinhLuong() - 9000000) * 0.1;
        } else {
            thue = 6000000 * 0.1 + (tinhLuong() - 15000000) * 0.12;
        }
        return thue;
    }
}
