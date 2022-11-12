
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class IntSet {
    private SortedSet<Integer> ts = new TreeSet<>();

    public IntSet(){
        this.ts.clear();
    }

    public SortedSet<Integer> getTs() {
        return ts;
    }

    public void setTs(SortedSet<Integer> ts) {
        this.ts = ts;
    }
    
    public IntSet(int a[]){
        int n = a.length;
        for(int i = 0; i < n; ++i)
            this.ts.add(a[i]);
    }
    
    public IntSet union(IntSet a){
        for (Integer i : a.ts) {
            this.ts.add(i);
        }
        return this;
    }
    
    public IntSet intersection(IntSet a){
        IntSet res = new IntSet();
        for (Integer it : this.ts) {
            if(a.ts.contains(it)){
                res.ts.add(it);
            }
        }
        return res;
    }
    
    @Override
    public String toString(){
        String ans = "";
        for (Integer i : this.ts) {
            ans += i + " ";
        }
        return ans;
    }
}
