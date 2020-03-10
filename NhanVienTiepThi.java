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
public class NhanVienTiepThi extends NhanVien {

    private double luongHH;
    private double doanhSo;

    public NhanVienTiepThi() {
        super();
    }

    public NhanVienTiepThi(double luongHH, double doanhSo) {
        super();
        this.luongHH = luongHH;
        this.doanhSo = doanhSo;
    }

    public double getLuongHH() {
        return luongHH;
    }

    public void setLuongHH(double luongHH) {
        this.luongHH = luongHH;
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    //Nhập thông tin nhân viên
    @Override
    public void nhapNV() {
        super.nhapNV();
        System.out.print("Nhap doanh so : ");
        doanhSo = sc.nextDouble();
        System.out.print("Nhap luong hoa hong: ");
        luongHH = sc.nextDouble();

    }

    //Xuất nhân viên
    @Override
    public void xuatNV() {
        super.xuatNV();
        System.out.format("%-15.1f", doanhSo);
        System.out.format("%-15.1f", luongHH);
        System.out.format("%-20s", "0");
        System.out.format("%-15.1f", tinhLuong());
        System.out.format("%-15.1f", tinhThue());

    }

    //Tính lương
    @Override
    public double tinhLuong() {
        super.tinhLuong();
        return luongNV + luongHH;
    }
}
