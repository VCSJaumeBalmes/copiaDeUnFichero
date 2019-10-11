package net.jaumebalmes.m06.fitxers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ByteWriter {
    public static void main(String[] args) {

        try {
            FileOutputStream fo = new FileOutputStream("/home/mjuan/IdeaProjects/recuperacioM06/escripturaByteFitxedr/output.bin");
            String hola = "Holakjjhkxczjkhhjxczvhjsduigfyuisxzckjvzxnnmvxczm,n m,nmn gjkhsadfhasdhjfjkasdnbbnsdanbfasbnmfbnsdbfnmasbfkjh4k2b4 nn sad as grwetn32jk4hrkqwbgfasdg b,nsa gasdgs g,asbngjasghbkjhgajghasjnfnasdgnksjnvsavnasjdnvasjdvnasdjkfhasvsadmvfnalsghkjarghtkwqrbefasmndf bnasfbnsdmaf";

            fo.write(hola.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
