
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        while(t-->0){
            int n = Integer.valueOf(sc.nextLine());
            List<SinhVien> list = new ArrayList<>();
            for(int i = 1; i <= n; ++i) list.add(SinhVien.nextSinhVien(sc, i));
//            Collections.sort(list, new Comparator<SinhVien>(){
//                @Override
//                public int compare(SinhVien o1, SinhVien o2){
//                    return o1.getName().compareTo(o2.getName());
//                }
//            });
            
            Collections.sort(list, (SinhVien o1, SinhVien o2)->(o1.getName().compareTo(o2.getName())));
            
            for (SinhVien s: list)
                System.out.println(s);
        }
        sc.close();
    }
}
