
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Pair<T1, T2> implements Serializable, Comparable<Pair>{
    private int first, second;

    public Pair(){
        this.first = this.second = 0;
    }
    
    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }
    
    public boolean isPrime(){
        return Prime((int)this.first) && Prime((int)this.second);
    }
    
    public boolean Prime(int n){
        if (n < 2)
           return false;
        for(int i = 2; i <= Math.sqrt(n); ++i){
            if (n % i == 0)
                return false;
        }
        return true;
    }
    
    @Override
    public int compareTo(Pair o) {
        return this.first - o.first;
    }
    
    @Override
    public String toString() {
        return "" + first + " " + second + "";
    }
}
