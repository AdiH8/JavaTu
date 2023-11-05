public class Satelite extends SpaceObject implements Orbiter{
    public Satelite(String name, double coordinateX, double coordinateY, double coordinateZ, double mass) {
        super(name, coordinateX, coordinateY, coordinateZ, mass);

    }


    @Override
    public void orbit(SpaceObject target) throws NotValidSpaceObjectExeption {
        if (target instanceof Planet){
            ((Planet) target).addOrbiter(this);
        }
        else {
            throw new NotValidSpaceObjectExeption("Satellites can only orbit Planets");
        }
    }
}
