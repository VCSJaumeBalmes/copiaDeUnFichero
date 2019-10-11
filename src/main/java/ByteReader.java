import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteReader {
    public static void main(String[] args) {
        try {
            FileInputStream fi = new FileInputStream("/home/mjuan/IdeaProjects/recuperacioM06/escripturaByteFitxedr/output.bin");
            String globalResult = "";
            byte[] blockBytes = new byte[100];

            int character = fi.read();
            int i=0;
            while (character!=-1) {
                if (i < 100) {
                    blockBytes[i] = (byte) character;

                    character = fi.read();
                    i++;
                } else {
                    String result = new String(blockBytes, 0, i);
                    globalResult = globalResult + result;
                    i = 0;
                }
            }
            if (i>0) {
                String result = new String(blockBytes, 0, i);
                globalResult = globalResult + result;
            }
            System.out.println(globalResult);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
