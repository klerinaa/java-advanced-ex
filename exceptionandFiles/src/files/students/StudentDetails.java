package files.students;

import java.io.BufferedReader;
import java.io.FileReader;

public class StudentDetails {
    public static void main(String[] args) {
        try{

            FileReader fileReader= new FileReader("student.txt");
            BufferedReader bufferedReader= new BufferedReader(fileReader);
            String line ;
            while((line= bufferedReader.readLine()) !=null){
                String [] parts=line.split(",");
                if( parts.length<4){
                    System.out.println("Invalid data format :"+line);
                    continue;
                }
                String name =parts[0];
                int firstgrade= Integer.parseInt(parts[1]);
                int secondgrade= Integer.parseInt(parts[2]);
                int fthirdgrade= Integer.parseInt(parts[3]);
                double mesatarja =(firstgrade+secondgrade+fthirdgrade)/3;
                System.out.println("Name :"+name);
                System.out.println("Mesatarja :"+mesatarja);
                System.out.println();



            }

            bufferedReader.close();



        }catch (Exception e){
            e.getStackTrace();
        }
    }
}
