package inheritance;

public class Child extends Parent{
    String childProperty="Hi, I am child";

    public Child() {
        super();// aksesimi i konstruktorit te prindit pa params
    }

    public Child(String childProperty,String parentProperty,String test2) {
        super(parentProperty,test2); // aksesimi i konstruktorit te prindit me params
        this.childProperty = childProperty;
    }

    public static void main(String[] args) {
        Child mychild=new Child(); //objekti i vete klases child
        mychild.testParentMethod(); //therritja e metodes se prindit nqs nuk eshte bere overite / therritja e metodes se mbishkruar
        System.out.println(mychild.parentPROPERTYUNMODIFED); // aksesimi i variablave te prindit
    }

    @Override  //@--> annnotation , ne kete rast perdoret per te treguar qe po mbishkruan nje metode ekzistuese ne prind
    //nuk lejohet te perdoret nqs nuk ke bere extend nje klase x
    void testParentMethod(){ // emri return type dhe parametrat njesoj si prindi
        super.testParentMethod(); //perdorimi i kontenti te prindit nqs do
        System.out.println("child modifed method"); //mbishkrimi i metodes me contentin e deshiruar
    }
}
