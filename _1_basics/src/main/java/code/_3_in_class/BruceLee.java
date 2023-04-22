package code._3_in_class;

public class BruceLee extends Boxer {

    public BruceLee(String nume) {
        super(nume, 100, 90);
    }

    @Override
    public void receiveAttack(int damage) {
        this.health -= damage * 2;
    }
}
