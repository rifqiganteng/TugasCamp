import com.enigma.camp.Block;
import com.enigma.camp.Circle;
import com.enigma.camp.Ractangle;

import javax.swing.text.html.HTMLDocument;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.SynchronousQueue;


public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("========== Data Collection ===========");
        System.out.println(" 1. Belajar LIST ");
        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle(5));
        circles.add(new Circle(10));
        circles.add(new Circle(5));
        circles.add(new Circle(5));

        System.out.println(circles.size());//menampilkan jumlah array (bukan index array)
        Circle circle = circles.get(0);
        System.out.println(circles.indexOf(circle));//mencari value di dalam array yang ditentukan index nya di baris "0"(mencari index nya)
        System.out.println(circles.lastIndexOf(circle));//mencari indext terakhir

        System.out.println(circles.size());
        Circle yangKucari = new Circle(5);
        System.out.println(yangKucari + "Ini loh Yang ku cari ");

        for (Circle circ : circles) {
            System.out.println(circ);
        }
        System.out.println(circles.contains(new Circle(5)));// ngecek apakah sama sma circle

//        for (int i = 0; i < circles.size(); i++) {
//            System.out.println(circ);
//        }

        System.out.println(" catatan penting jika , kita tidak method equels maka yang akan dibandingkan adalah" +
                "alamat memory nya,,,,, tetapi jika diberi method equels akan dibandingkan falue nya" +
                " THIS IS VERY IMPORTANT" +
                "");
//     for(int i = 0 ; i < circles.size(); i++){
//            Circle circle = circles.get(i);
//            System.out.println(circle.print());
//
//        }
//
//        Circle circle1 = new Circle();
//        System.out.println(circle1.equals(circle1));
    }
}
