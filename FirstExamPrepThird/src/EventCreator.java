public class EventCreator {
    private String eventType;

    public EventCreator(String eventType){
        this.eventType=eventType;
    }

    public Event getEvent(String competitionType) throws EventException {
        switch (competitionType.toLowerCase()) {
            case "basketball":
                return new BasketballMatch();
            case "swimming":
                return new SwimmingEvent();
            case "tabletennis":
                return new TableTennisTournament();
            default:
                throw new EventException("Invalid competition type: " + eventType);
        }
    }

    }
}
