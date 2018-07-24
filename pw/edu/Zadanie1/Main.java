package Obiekty.pw.edu.Zadanie1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        String fileName = "plik.txt";
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName);
            fileWriter.write("Text 1\n");
            fileWriter.write("Text 2\n");
            fileWriter.write("Text 3\n");
            fileWriter.write("Text 4\n");
            fileWriter.write("Text 5\n");
        } catch (IOException e) {
            System.out.println("Problem z dostepem do pliku");
        }

        finally {
            if(fileWriter==null) {
                System.out.println("Problem");
            } else {
                fileWriter.close();
            }
        }

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(fileName));
            String linia = null;

            do {
                linia = br.readLine();
                System.out.println(linia);

                if(linia!=null) {
                    System.out.println(linia);
                } else {
                    br.close();
                }
            } while (linia!=null);
        }
    catch (IOException ex) {
        System.out.println("Problem z dostepem");
    }
    }
}
