package abstraction;

abstract class TestAbstract {
    //metode abstrakte ,pa trup ==> sepse implementimi do i behet ne klasen specifike
    abstract void animalSound();
//metode normale ,njesoj si tek klasat e tjera
    void sleep(){
        System.out.println("ZZZ");
    }
}
