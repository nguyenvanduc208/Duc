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
public class NhanVienHanhChinh extends NhanVien {

    public NhanVienHanhChinh() {
        super();
    }

    //Nhập thông tin nhân viên
    @Override
    public void nhapNV() {
        super.nhapNV();

    }

    //Tinh luong
    @Override
    public double tinhLuong() {
        return luongNV;
    }

    //Xuất danh sách nhân viên
    @Override
    public void xuatNV() {
        super.xuatNV();
        System.out.format("%-15s", "0");
        System.out.format("%-15s", "0");
        System.out.format("%-20s", "0");
        System.out.format("%-15.1f", tinhLuong());
        System.out.format("%-15.1f", tinhThue());
    }

}
