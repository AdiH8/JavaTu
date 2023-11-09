public class BasketballMatch implements Event {
    private int mostPointsScored;
    private Competitor[] lineup;

    public BasketballMatch(int mostPointsScored, Competitor[] lineup) {
        this.mostPointsScored = mostPointsScored;
        this.lineup = lineup;
    }

    public BasketballMatch() {

    }
    @Override
    public Competitor[] getLineup() {
        return new Competitor[0];
    }
}
