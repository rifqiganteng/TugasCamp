import com.enigma.camp.Direction;
import com.enigma.camp.Robot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please iput your coordinate (X,Y)");
        String coordinate = br.readLine();
        String [] post = coordinate.split(",");
        Robot atom = new Robot(Integer.parseInt(post[0]),Integer.parseInt(post[1]), Direction.valueOf(post[2]));

        System.out.println("Plese input daya for the robot : ");
        String jumDaya = br.readLine();
        int daya = Integer.parseInt(jumDaya);
        atom.fullDaya(Integer.parseInt(jumDaya));

        System.out.println("plese input your instrction to your robot");
        String perintah = br.readLine();
        atom.setCommands(perintah);

        atom.run();
        atom.print();

    }
}