public class AudioBook extends PhysicalBook implements IAudioBook{

    private int durationMinutes;

    public AudioBook(String name, String title, int literaturePoint, String literatureType, int copies, int durationMinutes) {
        super(name, title, literaturePoint, literatureType, copies);
        this.durationMinutes = durationMinutes;
    }

    @Override
    public int getDuration() {
        return 0;
    }

    @Override
    public double calculateRoyalty() {
        return 0;
    }

    @Override
    public double getPoints() {
        return 0;
    }

    @Override
    public double getPages() {
        return 0;
    }
}
