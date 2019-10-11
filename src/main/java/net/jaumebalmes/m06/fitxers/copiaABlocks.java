package net.jaumebalmes.m06.fitxers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copiaABlocks {
    public static void main(String[] args) {
        try {
            final int BLOCK_LENGTH = 1000;

            String srcPath = args[0];
            String outputPath = args[1];


            FileInputStream fi = new FileInputStream(srcPath);
            FileOutputStream fo = new FileOutputStream(outputPath);

            String globalResult = "";

            byte[] blockBytes = new byte[BLOCK_LENGTH];

            int character = fi.read();
            int i=0;
            while (character!=-1) {
                if (i < BLOCK_LENGTH) {
                    blockBytes[i] = (byte) character;

                    character = fi.read();
                    i++;
                } else {
                    fo.write(blockBytes);
                    i = 0;
                }
            }
            if (i>0) {
                fo.write(blockBytes,0,i);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
