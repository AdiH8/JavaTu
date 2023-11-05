public class Resource {
    private double amount;
    private double harvestrate;

    public Resource(double amount, double harvestrate){
        this.amount=amount;
        this.harvestrate=harvestrate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getHarvestrate() {
        return harvestrate;
    }

    public void setHarvestrate(double harvestrate) {
        this.harvestrate = harvestrate;
    }

    public void harvest(){
        amount+=harvestrate;
    }



}
