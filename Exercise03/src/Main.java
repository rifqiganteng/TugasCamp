import com.enigma.model.Airplane;
import com.enigma.model.FighterJet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("masukkan nilai F1");
        String getF1=br.readLine();
        System.out.println("masukkan nilai F2");
        String getF2=br.readLine();
        FighterJet  fighterJet = new FighterJet(Double.parseDouble(getF1),Double.parseDouble(getF2),0,0);
        fighterJet.angkatPesawat();
        if (Double.parseDouble(getF1) <= Double.parseDouble(getF2))
        {

            System.out.println("Masukkan Jenis mesin");
            String speedEngineChoose=br.readLine();
            fighterJet.chooseEngine(speedEngineChoose);
            System.out.println(fighterJet.chooseEngine(speedEngineChoose));
        }









    }
}
