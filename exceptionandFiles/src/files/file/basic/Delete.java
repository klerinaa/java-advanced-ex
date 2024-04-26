package files.file.basic;

import java.io.File;

public class Delete {
    public static void main(String[] args) {
        File file= new File("filetodelete.txt");
        boolean value= file.delete();
        if(value){
            System.out.println("file is deleted");
        }else{
            System.out.println("file is not deleted");
        }
    }
}
