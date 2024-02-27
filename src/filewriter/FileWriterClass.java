package filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {

    public static void main(String[] args) {

        try{
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red \nViolets are blue \nIt's funny...");
            writer.append("\n(A poem by me)");
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
