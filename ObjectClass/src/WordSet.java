
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
public class WordSet {
    private SortedSet<String> ts = new TreeSet<>();

    public WordSet(){
        this.ts.clear();
    }
    // String input
    public WordSet(String s){
        s = s.toLowerCase();
        String a[] = s.split(" ");
        for(int i = 0; i < a.length; ++i) this.ts.add(a[i]);
    }

    public SortedSet<String> getTs() {
        return ts;
    }

    public void setTs(SortedSet<String> ts) {
        this.ts = ts;
    }
    
    // File input
//    public WordSet(String string) throws FileNotFoundException{
//        File f = new File(string);
//        Scanner sc = new Scanner(f);
//        String s = "";
//        while(sc.hasNext()){
//            String x = sc.nextLine();
//            if(x.isEmpty()) break;
//            s += (x + " ");
//        }
//        sc.close();
//        s = s.toLowerCase();
//        String a[] = s.split(" ");
//        for(int i = 0; i < a.length; ++i) this.ts.add(a[i]);
//    }

    public WordSet union(WordSet s){
        WordSet res = new WordSet();
        for (String st : s.ts) {
            res.ts.add(st);
        }
        for (String st : this.ts) {
            res.ts.add(st);
        }
        return res;
    }
    
    public WordSet intersection(WordSet s){
        WordSet res = new WordSet();
        for(String x: s.ts){
            if(this.ts.contains(x)){
                res.ts.add(x);
            }
        }
        return res;
    }
    
    public WordSet difference(WordSet a){
        WordSet x = new WordSet();
        for (String st : this.ts) {
            if(!a.ts.contains(st)) x.ts.add(st);
        }
        return x;
    }

    @Override
    public String toString(){
        String ans = "";
        for (String s : this.ts) {
            ans += s + " ";
        }
        return ans;
    }
}
