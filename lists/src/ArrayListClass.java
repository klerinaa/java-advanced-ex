import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {
        //krijimi i arraylist
        ArrayList<String> makinat= new ArrayList<String>();
        List<Integer> viti= new ArrayList<Integer>();
        //shtimi i nje elementi ne list
        makinat.add("Ford");
        makinat.add("BMW");
        //printimi i listes
        for (String makina:makinat){
            System.out.println(makina);
        }

        //aksesimi i nje elementi
        makinat.get(0);

        //modifikuar nje element
        makinat.set(1,"Opel");
        for (String makina:makinat){
            System.out.println(makina);
        }

        //delete from list
        makinat.remove(1);

        //size i arraylistes
        makinat.size();
    }
}
