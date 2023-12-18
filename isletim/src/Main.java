import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        int id=0;
        Renk clr = new Renk(); // her prosese renk atama işlemi için color sınıfından nesne olusturuyorum
        Kuyruk prosesler = new Kuyruk(); // txt dosyasından okumuş olduğum prosesleri prosesler kuyruğuna atacagım

        File data;
        Scanner readFile;
        try {//Dosyadan okuma ve hata yakalama
            data = new File("giris.txt");
            readFile = new Scanner(data);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (readFile.hasNextLine()) {
            String line = readFile.nextLine();
            String[] columns = line.split(", ");


            int varisZamani = Integer.parseInt(columns[0]);
            int oncelik = Integer.parseInt(columns[1]);
            int prosesSuresi = Integer.parseInt(columns[2]);
            int cd=0;
            int modem=0;
            int yazici=0;
            int tarayici=0;

            // txt dosyasından okumuş olduğum satırları tek tek prosesler kuyruğuna atiyorum
            prosesler.ekle(new Proses(id,varisZamani,oncelik,prosesSuresi, clr.getRandomColor(),0,0,0,0));
            id++;

        }
        //prosesler kuyrugunu görevlendirici sinifina gönderip islemleri orada icra edeceğim
        Dispatcher görevlendirici = new Dispatcher(prosesler);
        görevlendirici.baslat();

    }
}