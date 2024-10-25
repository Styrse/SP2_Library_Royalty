public class EAudioBook extends DigitalBook {

    private int durationMinutes;

    public EAudioBook(String title, String literatureType, int availability, int reach, int use, int durationMinutes) {
        super(title, literatureType, availability, reach, use);
        this.durationMinutes = durationMinutes;
    }

    @Override
    protected double calculatePoints() {
        return 0;
    }
}
