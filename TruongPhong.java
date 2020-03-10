/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.ass;

/**
 *
 * @author ASUS
 */
public class TruongPhong extends NhanVien {

    private double luongTrachNhiem;

    public TruongPhong() {
        super();
    }

    public TruongPhong(double luongTrachNhiem) {
        super();
        this.luongTrachNhiem = luongTrachNhiem;
    }

    public double getLuongTrachNhiem() {
        return luongTrachNhiem;
    }

    public void setLuongTrachNhiem(double luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }

    //Nhập nhân viên
    @Override
    public void nhapNV() {
        super.nhapNV();
        System.out.print("Nhap luong trach nhiem: ");
        luongTrachNhiem = sc.nextDouble();

    }

    //Xuất nhân viên 
    @Override
    public void xuatNV() {
        super.xuatNV();
        System.out.format("%-15s", "0");
        System.out.format("%-15s", "0");
        System.out.format("%-20.1f", luongTrachNhiem);
        System.out.format("%-15.1f", tinhLuong());
        System.out.format("%-15.1f", tinhThue());
    }

    //Tính lương
    @Override
    public double tinhLuong() {
        return luongNV + luongTrachNhiem;
    }

}
