//import com.enigma.tugas.Car;
import com.enigma.tugas.MobilCar;
import javafx.scene.input.DragEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utama {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan koordinat X,Y :");
        String coordinate = br.readLine();
        String [] post = coordinate.split(",");
        MobilCar mercy = new MobilCar(Integer.parseInt(post[0]),Integer.parseInt(post[1]));

        System.out.print("masukkan bensin :");
        String jumData = br.readLine();
        int fuel = Integer.parseInt(jumData);
        mercy.fillfuel(Integer.parseInt(jumData));

        System.out.println("masukkan perintah");
        String perintah = br.readLine();
        mercy.setCommend(perintah);

        mercy.run();
        System.out.println(mercy.print());
        System.out.print("masukkan bensin lagi :");
        String jumDataLagi = br.readLine();
        int refill = Integer.parseInt(jumDataLagi);
        mercy.refill(Integer.parseInt(jumData));

    }
}

