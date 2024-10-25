public abstract class DigitalBook extends Title {

    protected int availability;
    protected int reach;
    protected int use;

    public DigitalBook(String title, String literatureType, int availability, int reach, int use) {
        super(title, literatureType);
        this.availability = availability;
        this.reach = reach;
        this.use = use;
    }

    protected int usageFactor(int use){
        int points = 0;
        if (use > 25 && use <= 75){
            points = 50;
        } else if (use > 75 && use <= 150) {
            points = 100;
        } else if (use > 150 && use <= 400) {
            points = 150;
        } else if (use > 400 && use <= 1000) {
            points = 200;
        } else if (use > 1000 && use <= 2000) {
            points = 250;
        } else if (use > 2000 && use <= 5000) {
            points = 500;
        } else if (use > 5000 && use <= 10000) {
            points = 750;
        } else if (use > 10000) {
            points = 1000;
        }
        return points;
    }
}
