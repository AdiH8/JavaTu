import java.util.ArrayList;
import java.util.List;

public class Planet extends OrbitableSpaceObject implements Orbiter {

    Resource metal = new Resource(0,1.0);
    Resource gas = new Resource(0,0.5);
    Resource crystal = new Resource(0,0.2);
    Resource uranium= new Resource(0,0.1);

    List<BaseBuilding> buildings = new ArrayList<>();


    public void addBuilding(BaseBuilding building){
        buildings.add(building);
    }

    public Planet(String name, double coordinateX, double coordinateY, double coordinateZ, double mass) {
        super(name, coordinateX, coordinateY, coordinateZ, mass);
        this.orbiters=new ArrayList<>();

    }

    public void harvestMetal(){
        metal.harvest();
        System.out.println( metal.getHarvestrate()+ " Metal harvested!");
        System.out.println("Current amount "+ metal.getAmount());
    }
    public void harvestGas(){
        gas.harvest();
        System.out.println( gas.getHarvestrate()+ " Gas harvested!");
        System.out.println("Current amount "+ gas.getAmount());
    }

    public void harvestCrystal(){
        crystal.harvest();
        System.out.println( crystal.getHarvestrate()+ " Crystal harvested!");
        System.out.println("Current amount "+ crystal.getAmount());
    }
    public void harvestUranium(){
        uranium.harvest();
        System.out.println( uranium.getHarvestrate()+ " Uranium harvested!");
        System.out.println("Current amount "+ uranium.getAmount());
    }

    @Override
    public void orbit(SpaceObject target) throws NotValidSpaceObjectExeption {
        if (target instanceof Star){
            ((Star) target).addOrbiter(this);
        }
        else{
            throw new NotValidSpaceObjectExeption("Planets can only orbit stars");
        }
    }
}
