/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JFrame_Demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author admin
 */
public class FileNotFound {
    public static void OpenFile() throws FileNotFoundException{
        File f = new File("DATA.in");
        FileReader fr = new FileReader(f);
        throw new FileNotFoundException();
    }
    
    public static void main(String[] args) {
        FileNotFound fnf = new FileNotFound();
        try{
            fnf.OpenFile();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
