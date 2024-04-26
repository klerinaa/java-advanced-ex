package files.file.basic;

import java.io.FileReader;

public class Reader {
    public static void main(String[] args) {
        char[] array = new char[35];
        try{
            FileReader fileReader= new FileReader("newFile.txt");
            fileReader.read(array);
            System.out.println("Data in the file ");

            for (char e:array){
                System.out.print(e);
            }

        }catch (Exception e){
            e.getStackTrace();
        }
    }
}
