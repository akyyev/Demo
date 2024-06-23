package data.coding.pascaltriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(List.of(1));

        for(int i=1; i<numRows; i++) {
            result.add(generateInner(result.get(i-1)));
        }
        
        return result;
    }
    
    public static List<Integer> generateInner(List<Integer> ls) {
        
        List<Integer> inner = new ArrayList<>();
        inner.add(1);
        
        for(int i=0; i<ls.size()-1; i++) {
            inner.add(ls.get(i) + ls.get(i+1));
        }
        
        inner.add(1);
        return inner;
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> inner = new ArrayList<>();
        inner.add(1);

        for (int i = 1; i < rowIndex - 1; i++) {
            
        }

        return null;
    }

    public static void main(String[] args) {
        PascalTriangle pt = new PascalTriangle();
        
        System.out.println("pt.generate(5) = " + pt.generate(5));;
    }
}


