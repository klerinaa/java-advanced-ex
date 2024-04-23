package abstraction;

public class Dog extends TestAbstract{
    public static void main(String[] args) {
        //TestAbstract test=new TestAbstract(); ==> gjeneron error sepse nuk mund ti krijohet nje objekt nje klase abs
        // qe te mundem ta perodr duhet ti bej extent ,pra te trashegoj nga klasa .
        //duhet me patjeter metodat absstrakte te jene te bera overrite ne klasat qe trashegohet
        //klasa dog mund te perdoret kudo. dhe mund ti krijohet objekt
    }

    @Override
    void animalSound() {
        System.out.println("ham ham");
    }
}
