import java.util.ArrayList;

public class Star extends OrbitableSpaceObject{
    public Star(String name, double coordinateX, double coordinateY, double coordinateZ, double mass) {
        super(name, coordinateX, coordinateY, coordinateZ, mass);
        this.orbiters= new ArrayList<>();
    }
}
