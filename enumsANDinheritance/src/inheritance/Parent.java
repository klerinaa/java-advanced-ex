package inheritance;

public class Parent {
    protected String parentPROPERTYUNMODIFED="Test model"; //atribut i prindit

    public Parent() {
    }

    public Parent(String parentPROPERTYUNMODIFED,String test) {
        //this.test=test
        this.parentPROPERTYUNMODIFED = parentPROPERTYUNMODIFED;
    }

    void testParentMethod(){ //metoda e prindit
        System.out.println("Test method");
    }
}

