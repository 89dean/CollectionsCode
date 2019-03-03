package Assignment2.Question1;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionsAll {

    public int displaySize(int a,int b){
        ArrayList<Integer> d = new ArrayList<>();
        d.add(a);
        d.add(b);
      return d.size();

    }
    public String searchFor(String a, String b){
        HashSet<String> s = new HashSet<String>();
        s.add(a);
        s.add(b);
        return a;
    }
    public String obtainVaule(String a, String b){
        HashMap<Integer,String> m = new HashMap<Integer, String>();
        m.put(100,a);
        m.put(101,b);
        return  m.get(100);
    }



    }

