public class AudioBook extends PhysicalBook implements IAudioBook{

    private int durationMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationMinutes) {
        super(title, literatureType, copies);
        this.durationMinutes = durationMinutes;
    }

    @Override
    public int getDuration() {
        return 0;
    }

    @Override
    public float getPoints() {
        return 0;
    }

    @Override
    public float getPages() {
        return 0;
    }

    @Override
    public float calculatePoints() {
        return 0;
    }
}
