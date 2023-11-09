public class Main {
    public static void main(String[] args) throws NotValidSpaceObjectExeption {

        Planet earth = new Planet("Earth",1,2,3,69);
        Star sun = new Star("Sun",1,2,3,69);
        Satelite sputnik= new Satelite("Sputnik",1,2,3,69);
        earth.orbit(sun);
        
        earth.harvestMetal();
        System.out.println(sun.getOrbiters());

    }
}