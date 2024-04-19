package enums;

public class Pizza {
    Size pizzaSize;

    public Pizza(Size pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public void order(){
        switch (pizzaSize){
            case SMALL:
                System.out.println("I ordered a small pizza");
                break;
            case MEDIUM:
                System.out.println("I ordered a medium pizza");
                break;
            default:
                System.out.println("We dont have your size");
                break;
        }
    }
}
