/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KT1;

/**
 *
 * @author ADMIN
 */
public class Sach {
    public String maSach;
    public String tenSach;
    public Double giaBia;
    public int namXuatBan;

    public Sach(String maSach, String tenSach, double giaBia, int namXuatBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.giaBia = giaBia;
        this.namXuatBan = namXuatBan;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public double getGiaBia() {
        return giaBia;
    }

    public void setGiaBia(double giaBia) {
        this.giaBia = giaBia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    @Override
    public String toString() {
        return "Sach{" + "maSach=" + maSach + ", tenSach=" + tenSach + ", giaBia=" + giaBia + ", namXuatBan=" + namXuatBan + '}';
    }
    
    
    
}
