package files.file.basic;

import java.io.FileWriter;

public class Write {
    public static void main(String[] args) {
        String data ="This is the data I want in my files";
        try{
            FileWriter fileWriter= new FileWriter("newFile.txt");
            fileWriter.write(data);
            System.out.println("Data writen in the file");
            fileWriter.close();

        }catch (Exception e){
            e.getStackTrace();
        }
    }
}
