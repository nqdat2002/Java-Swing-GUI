
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Matrix {
    private int n, m;
    private int [][] a;

    public Matrix(int n, int m){
        this.n = n;
        this.m = m;
        this.a = new int[n][m];
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int[][] getA() {
        return a;
    }

    public void setA(int[][] a) {
        this.a = a;
    }
    
    public void nextMatrix(Scanner sc){
        for(int i = 0; i < this.n; i++){
            for(int j = 0; j < this.m; j++){
                this.a[i][j] = sc.nextInt();
            }
        }
    }
    
    public Matrix trans(){
        Matrix res = new Matrix(this.m, this.n);
        for(int i = 0; i < this.m; ++i){
            for(int j = 0; j < this.n; ++j){
                res.a[i][j] = this.a[j][i];
            }
        }
        return res;
    }

    public Matrix mul(Matrix x){
        Matrix res = new Matrix(this.n, x.m);
        for(int i = 0; i < this.n; ++i){
            for(int j = 0; j < x.m; ++j){
                for(int k = 0; k < this.m; ++k){
                    res.a[i][j] += (this.a[i][k] * x.a[k][j]);
                }
            }
        }
        return res;
    }

    @Override
    public String toString(){
        String res = "";
        for(int i = 0; i < this.n; ++i){
            for(int j = 0; j < this.m; ++j){
                res += (this.a[i][j] + " ");
            }
            res += "\n";
        }
        return res;
    }
}
