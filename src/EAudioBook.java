public class EAudioBook extends DigitalBook {

    private int durationMinutes;

    public EAudioBook(String title, String literatureType, int availability, int reach, int use, int durationMinutes) {
        super(title, literatureType, availability, reach, use);
        this.durationMinutes = durationMinutes;
    }

    @Override
    protected double calculatePoints() {
        return (durationMinutes* 0.5) * calculateLiteraturePoints(this) * ((availability*0.5) + (reach * 5) + usageFactor(use));
    }
}
