public class TableTennisTournament implements Event {
    private int longestMatch;
    private Competitor[] lineup;

    public TableTennisTournament(int longestMatch, Competitor[] lineup) {
        this.longestMatch = longestMatch;
        this.lineup = lineup;
    }
    public TableTennisTournament() {

    }

    @Override
    public Competitor[] getLineup() {
        return new Competitor[0];
    }
}
