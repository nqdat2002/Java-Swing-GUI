/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package NhapLop;

/**
 *
 * @author admin
 */
public interface Menu {
    public void ShowStudent();
    public void Show();
    public void Add(int thiscount, int thatcount);
    public void Exit();
    public void Sort1();
    public void Sort2();
    public void Delete(int id);
    public void Search(String name);
    public void Edit(int id, int age, String name);
}
