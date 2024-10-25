public abstract class Title extends Author implements Lendable{
    private String title;
    private int literaturePoint;
    private String literatureType;
    private final double rate = 0.067574;

    public Title(String name, String title, int literaturePoint, String literatureType) {
        super(name);
        this.title = title;
        this.literaturePoint = literaturePoint;
        this.literatureType = literatureType;
    }

    public abstract double calculateRoyalty();

    public abstract double getPoints();

    public abstract double getPages();
}
