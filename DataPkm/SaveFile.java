package DataPkm;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class SaveFile {
    
    public static void saveSave(){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("Tama.txt"));

            bw.write("" + DataPkm.Data.NOM);
            bw.newLine();
            bw.write("" +DataPkm.Data.ENERGIE);
            bw.newLine();
            bw.write("" +DataPkm.Data.FORCE);
            bw.newLine();
            bw.write("" +DataPkm.Data.JOIE);
            bw.newLine();
            bw.write("" +DataPkm.Data.FAIM);
            bw.newLine();
            bw.write("" +DataPkm.Data.FATIGUE);
            bw.newLine();
            bw.write("" +DataPkm.Data.PROPRETE);
            bw.newLine();
            bw.write("" +DataPkm.Data.NBVICTOIRE);
            bw.newLine();
            bw.write("" +DataPkm.Data.MALUSFORCE);
            bw.newLine();
            bw.write("" +DataPkm.Data.CPTTOUR);

            bw.close();

    
        } catch (Exception e) {
            //
        }
    }
}
