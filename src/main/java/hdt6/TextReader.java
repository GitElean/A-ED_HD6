package hdt6;
import java.io.*;

public class TextReader {

    private BufferedReader bf;

    public String readFile(String file){
        String text = "";

        try {

            bf = new BufferedReader(new FileReader(file));
            String temp = "";
            String bfRead;

            while((bfRead = bf.readLine()) != null){
                temp = temp + bfRead;
            }

            text = temp;

        } catch (Exception e) {
            text = "error";
        }
        return text;
    }
}
