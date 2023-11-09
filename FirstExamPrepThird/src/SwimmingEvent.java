public class SwimmingEvent implements Event {
    private double fastestLap;
    private Competitor[] lineup;

    public SwimmingEvent(double fastestLap, Competitor[] lineup) {
        this.fastestLap = fastestLap;
        this.lineup = lineup;
    }
    public SwimmingEvent() {

    }
    @Override
    public Competitor[] getLineup() {
        return new Competitor[0];
    }
}
