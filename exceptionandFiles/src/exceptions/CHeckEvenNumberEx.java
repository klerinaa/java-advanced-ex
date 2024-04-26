package exceptions;

public class CHeckEvenNumberEx {
    public static void main(String[] args) throws Exception {
        cHeckEvenNumber(9); //1.
        try {
            cHeckEvenNumber(9);
        }catch(Exception e){
            System.out.println(e.getMessage());
        } //2.
    }

    static void cHeckEvenNumber(int number) throws Exception {
        if (number % 2 != 0) {
            throw new Exception(number + " is odd.");
        }
    }
}
