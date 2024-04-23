package interfaces;

public class ClassInterface implements  TestInterface,TestInterface2{

    //the interface must be "implemented"
    //Interface methods do not have a body
    @Override
    public void animalSound() {
        System.out.println("psssjdk");
    }

    @Override
    public void sleep() {
        System.out.println("zzz");

    }
}
