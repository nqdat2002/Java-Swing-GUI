
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Fraction {
    private long x;
    private long y;

    public Fraction(){
        this.x = 1;
        this.y = 1;
    }
    public Fraction(long x, long y){
        this.x = x;
        this.y = y;
    }
    public long getX(){
        return x;
    }
    public long getY(){
        return y;
    }

    public void Rutgon(){
        long tmp = gcd(this.x, this.y);
        this.x /= tmp;
        this.y /= tmp;
    }
    public Fraction CongPS(Fraction a, Fraction b){
        Fraction res = new Fraction(1, 1);
        long mc = lcm(a.y, b.y);
        a.x = mc / a.y * a.x;
        b.x = mc / b.y * b.x;
        res.x = a.x + b.x;
        res.y = mc;
        res.Rutgon();
        return res;
    }
    public Fraction TruPS(Fraction a, Fraction b){
        Fraction res = new Fraction(1, 1);
        long mc = lcm(a.y, b.y);
        a.x = a.x * mc / a.y;
        b.x = a.x * mc / b.y;
        res.x = a.x - b.x;
        res.y = mc;
        res.Rutgon();
        return res;
    }
    public Fraction NhanPS(Fraction a, Fraction b){
        a.x = a.x * b.x;
        b.y = a.y * b.y;
        a.Rutgon();
        return a;
    }

    public Fraction ChiaPS(Fraction a, Fraction b){
        a.x = a.x * b.y;
        a.y = a.y * b.x;
        a.Rutgon();
        return a;
    }

    private static long gcd(long a, long b){
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    
    private static long lcm(long a, long b){
        return (long) a * b / gcd(a, b);
    }
    
    public static Fraction nextFraction(Scanner sc){
        return new Fraction(sc.nextLong(), sc.nextLong());
    }
    
    @Override
    public String toString(){
        return x + "/" + y;
    }
}
