import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Tugas{
    public static void main(String[] args) throws IOException {
        String nama;
        String umur;
        int nilaiAwal = 0;
        int nilaiAkhir;
        int x= 0;
        int y= 0;
        int number = 1;

        //BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        //ATAU//
        // Membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);
        // membuat objek bufferreader
        BufferedReader br = new BufferedReader(isr);


        // Mengisi varibel nama dengan Bufferreader
        System.out.print("Inputkan jumlah data: ");
        nilaiAkhir = Integer.parseInt(br.readLine());
        System.out.println(nilaiAkhir);
        int[] age = new int[nilaiAkhir];
        String[] name = new String[nilaiAkhir];

        while (nilaiAwal < nilaiAkhir) {
            // blok kode yang akan diulang
            System.out.println("Silahkan input data ke -" + number);
            System.out.print("Inputkan Nama: ");
            nama = br.readLine();
            name[nilaiAwal] = nama;
            System.out.print("Inputkan Umur: ");
            umur = br.readLine();
            age[nilaiAwal] = Integer.parseInt(umur);
            nilaiAwal++;
            number++;
        }
            System.out.println("|" + "NAMA" + "|" + "UMUR" + "|");
        while(x<name.length || y<age.length){
            System.out.print("| "+name[x] + " | ");
            System.out.println(age[y] + " |");
            x++;
            y++;
        }
    }
}
