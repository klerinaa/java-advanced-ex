package files.buffer;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferRead {
    public static void main(String[] args) {
        char[] array = new char[100];
        try {
            FileReader fileReader= new FileReader("output.txt");
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            bufferedReader.skip(2);
            bufferedReader.read(array);
            System.out.println("Data in the file ");

            for (char e:array){
                System.out.print(e);
            }

        } catch (Exception e) {
            e.getStackTrace();

        }

    }
}
