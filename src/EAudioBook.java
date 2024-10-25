public class EAudioBook extends DigitalBook implements IAudioBook{

    private int durationMinutes;

    public EAudioBook(String title, String literatureType, int availability, int reach, int use, int durationMinutes) {
        super(title, literatureType, availability, reach, use);
        this.durationMinutes = durationMinutes;
    }

    @Override
    public float getPages() {
        return super.getPages();
    }

    @Override
    public int getDuration() {
        return 0;
    }
}
