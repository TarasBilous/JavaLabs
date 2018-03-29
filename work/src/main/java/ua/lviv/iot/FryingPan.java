package ua.lviv.iot;

public class FryingPan extends Dishes {

    public FryingPan(final boolean cover, final double volume, final int price, final Material dishesMaterial, final DishesType type,
                     final String dishName) {
        super(price, dishesMaterial, type, dishName);
        this.cover = cover;
        this.volume = volume;
    }

    private boolean cover;
    private double volume;

    public String getHeaders() {
        return super.getHeaders() + "," + "cover" + "," + "volume";
    }

    public String toCSV() {
        return super.toCSV() + "," + isCover() + "," + getVolume();
    }

    public boolean isCover() {
        return cover;
    }

    public void setCover(final boolean cover) {
        this.cover = cover;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(final double volume) {
        this.volume = volume;
    }
}
