package enums;

public class Main {
    public static void main(String[] args) {
        System.out.println(Level.LOW);

        Pizza pizza = new Pizza(Size.MEDIUM);
        pizza.order();
//use enum method
        System.out.println("the size of pizza is :" + Size.SMALL.getSize());

        //get enums values
        for (Level mylevel : Level.values()) {
            System.out.println(mylevel);
        }
    }
}