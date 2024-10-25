public class EAudioBook extends DigitalBook implements IAudioBook{

    private int durationMinutes;

    public EAudioBook(String name, String title, int literaturePoint, String literatureType, int availability, int reach, int use, int durationMinutes) {
        super(name, title, literaturePoint, literatureType, availability, reach, use);
        this.durationMinutes = durationMinutes;
    }

    @Override
    public double getPages() {
        return super.getPages();
    }

    @Override
    public int getDuration() {
        return 0;
    }
}
