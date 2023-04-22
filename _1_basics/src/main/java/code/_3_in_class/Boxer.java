package code._3_in_class;

public class Boxer implements IBoxer {
    String nume;
    int health=100;
    int damagePerAttack=10;

    //compozitie
    Glove left;
    Glove right;
    public Boxer(String nume, int health, int damagePerAttack) {
        this.nume=nume;
        this.health=health;
        this.damagePerAttack=damagePerAttack;
    }

    //delegare
    void puneManusile(){
        left.tie();
        right.tie();
    }
    void daJosManusile(){
        left.untie();
        right.untie();
    }
    public Boxer(String nume)
    {
        this.nume=nume;
    }
    public void attack(IBoxer opponent) {
        opponent.receiveAttack(this.damagePerAttack);
    }

    @Override
    public int defend() {
        return 0;
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    @Override
    public void receiveAttack(int damage) {
        System.out.println(this.nume + " a primit damage de " + damage);
        this.health -= damage;
    }

    @Override
    public String getName() {
        return this.nume;
    }


}
