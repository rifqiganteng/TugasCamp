import com.enigma.camp.Circle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle(10));
        circles.add(new Circle(5));
        circles.add(new Circle(1));
        circles.add(new Circle(1));
        circles.add(new Circle(1));
        circles.add(new Circle(3));
        circles.add(new Circle(4));

        //////////////////// BELAJAR ITERATOR
        Iterator<Circle> iterator = circles.iterator();
        while (iterator.hasNext()) {
            Circle circle = iterator.next();
            System.out.println(circle.getR());
            if (circle.equals(new Circle(10))) {
                iterator.remove();
            }
        }
        System.out.println("==============");
        System.out.println(circles.size());
        System.out.println("=============");
        iterator = circles.iterator();
        while (iterator.hasNext()) {
            Circle circle = iterator.next();
            System.out.println(circle.getR());
        }
    }
}
