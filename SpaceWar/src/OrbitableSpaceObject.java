import java.util.List;

public abstract class OrbitableSpaceObject extends SpaceObject {

    List<SpaceObject> orbiters;

    public OrbitableSpaceObject(String name, double coordinateX, double coordinateY, double coordinateZ, double mass) {
        super(name, coordinateX, coordinateY, coordinateZ, mass);

    }

    public void addOrbiter(SpaceObject orbiter) {
        orbiters.add(orbiter);
        System.out.println(orbiter.getName()+" is now orbiting " + this.getName());
    }

    public List<SpaceObject> getOrbiters(){
        return orbiters;
    }

}
