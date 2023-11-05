public class Elf extends Character implements Playable{

    public Elf(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void takeDamage(int amount) {
        this.setHealth(getHealth()-amount);
    }

    @Override
    public boolean isAlive() {
        return this.getHealth() > 0;
    }

    @Override
    public void useAbility(Character target) {
        target.setHealth(getHealth()+5);
    }

    @Override
    public void attack(Character target) {
        target.setHealth(target.getHealth()-getDamage());
    }
}
