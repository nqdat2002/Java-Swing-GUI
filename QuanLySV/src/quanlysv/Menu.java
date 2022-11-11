/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysv;

import java.util.List;

/**
 *
 * @author ASUS
 */
public interface Menu {
    public void themSV(List<Student> student);
    public void xemDS(List<Student> student);
    public void xoaDS(List<Student> student);
    public void sapxepTuoi(List<Student> student);
    public void sapxepTen(List<Student> student);
    public void timkiemTen(List<Student> student);
    public void suathongtinSV(List<Student> student);
    public void thoat();
}
