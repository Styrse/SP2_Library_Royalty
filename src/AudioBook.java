public class AudioBook extends PhysicalBook{

    private int durationMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationMinutes) {
        super(title, literatureType, copies);
        this.durationMinutes = durationMinutes;
    }

    @Override
    protected double calculatePoints() {
        return (durationMinutes* 0.5) * calculateLiteraturePoints(this) * copies;
    }
}
