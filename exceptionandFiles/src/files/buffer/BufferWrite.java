package files.buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWrite {
    public static void main(String[] args) {
        String data = "Test";
        try {
            FileWriter fileWriter= new FileWriter("output.txt");
            BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
