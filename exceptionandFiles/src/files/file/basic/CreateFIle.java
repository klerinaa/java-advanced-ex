package files.file.basic;

import java.io.File;

public class CreateFIle {
    public static void main(String[] args) {
        File file = new File("output.txt"); //krijoj objektin e file dhe i vendos emrin qe une dua qe file te ket
        try{
            boolean value= file.createNewFile();
            if(value){
                System.out.println("File is created");
            }else{
                System.out.println("File exists");
            }
        }catch (Exception e){
            e.getStackTrace();
        }
    }
}
