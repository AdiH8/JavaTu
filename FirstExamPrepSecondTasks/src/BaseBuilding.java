public class BaseBuilding {
    private String name;
    private int level;
    private int constructionTime;
    private int metalRequired;
    private int crystalRequired;
    private int gasRequired;
    private int uraniumRequired;

    public BaseBuilding(String name, int level, int constructionTime, int metalRequired, int crystalRequired, int gasRequired, int uraniumRequired) {
        this.name = name;
        this.level = level;
        this.constructionTime = constructionTime;
        this.metalRequired = metalRequired;
        this.crystalRequired = crystalRequired;
        this.gasRequired = gasRequired;
        this.uraniumRequired = uraniumRequired;
    }

    public void construct(Planet target){
        

    }
}
