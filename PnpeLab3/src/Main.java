public class Main {
    public static void main(String[] args) {

        Human human = new Human("Adi",110,20);
        Elf elf = new Elf("Usho",90,30);
        Orc orc= new Orc("Grozen",60,45);

        human.attack(orc);
        orc.attack(elf);
        elf.useAbility(elf);

        human.showInfo();
        orc.showInfo();
        elf.showInfo();

        human.attack(orc);
        orc.attack(human);
        human.useAbility(human);

        human.showInfo();
        orc.showInfo();
        elf.showInfo();

        System.out.println(orc.getHealth());
        System.out.println(elf.getHealth());
        System.out.println(human.getHealth());

    }

}
