import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class first {
    public static void main(String[] args) {
        Integer n = 1000;
        Integer[] mass = new Integer[n];
        ArrayList<Integer> outMass = new ArrayList<>();
        
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i;
        }

        Collections.addAll(outMass, mass);
        ListIterator<Integer> iterator = outMass.listIterator();
        for (int i = 2; i * i < n; i++) {
            while (iterator.hasNext()) {
                int item = iterator.next();
                if (item % mass[i] == 0) {
                    iterator.remove();
                }
            }
        }
        
        System.out.println(outMass.toString());
    }
}