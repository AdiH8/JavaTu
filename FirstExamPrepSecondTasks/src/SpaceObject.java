public abstract class SpaceObject {
    private String name;
    private double coordinateX;
    private double coordinateY;
    private double coordinateZ;
    private double mass;
    public SpaceObject(String name,double coordinateX, double coordinateY, double coordinateZ,double mass){
        this.name=name;
        this.coordinateX=coordinateX;
        this.coordinateY=coordinateY;
        this.coordinateZ=coordinateZ;
        this.mass=mass;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }

    public double getCoordinateZ() {
        return coordinateZ;
    }

    public void setCoordinateZ(double coordinateZ) {
        this.coordinateZ = coordinateZ;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public String displayInfo() {
        return "SpaceObject{" +
                "name='" + name + '\'' +
                ", coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                ", coordinateZ=" + coordinateZ +
                ", mass=" + mass +
                '}';
    }
}
