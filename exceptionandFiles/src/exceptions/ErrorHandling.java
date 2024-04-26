package exceptions;

public class ErrorHandling {
    public static void main(String[] args) throws Exception {
        //try-catch
        //errorInArrays();
//try-catch-finally
        //tryCatchFinally();
        //throw
        checkAge(19);
    }

    //try-catch
    void test() {
        //Sintaksa
        try {
            //Code to try
        } catch (Exception e) {
            //Code qe ne kemi per te menaxhuar errorin
            e.printStackTrace(); //1.
            System.out.println(e.getMessage()); //2.
        }
    }

    //try-catch
    static void errorInArrays() {
        int[] myNumbs = {1, 2, 3};
        try {
            System.out.println(myNumbs[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    //try-catch-finally
    //The finally statement lets you execute code, after try...catch, regardless of the result:
    static void tryCatchFinally() {
        int[] myNumbs = {1, 2, 3};
        try {
            System.out.println(myNumbs[10]);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Try-Catch is finished");
            System.out.println(myNumbs[2]);
        }
    }

    //throw
//The throw statement allows you to create a custom error.
    static void checkAge(int age) throws Exception {
        if(age<18){
            throw new Exception("Ju nuk mund te futeni ");
        }else{
            System.out.println("Ju mund te futeni ");
        }
    }
}
