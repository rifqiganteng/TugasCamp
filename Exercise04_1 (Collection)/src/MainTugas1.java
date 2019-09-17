import com.enigma.camp.Circle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainTugas1 {
    public static void main(String[] args) {
        Set<Circle>circleSet = new HashSet<>();
        circleSet.add(new Circle(10));
        circleSet.add(new Circle(5));
        circleSet.add(new Circle(1));
        circleSet.add(new Circle(1));
        circleSet.add(new Circle(1));
        circleSet.add(new Circle(3));
        circleSet.add(new Circle(4));

// "set" kalau pakai kelas object bukan primitif contoh sirkel
        //10,5,1,1,1,3,4 ====> 10,5,1,3,4

        for (Circle circleSort:circleSet) {
            System.out.println(circleSort.getR());
        }
        System.out.println("========ngulik=========");
        for (Circle circleSort:circleSet) {
            System.out.println(circleSort.getRound());
// "bikin friend list of "


        }
    }
}
