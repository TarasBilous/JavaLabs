package ua.lviv.iot;

public class Pan extends Dishes {

    public Pan(final Color colorPan, final boolean cover, final double volume, final int price,
               final Material dishesMaterial, final DishesType type, final String dishName) {
        super(price, dishesMaterial, type, dishName);
        this.colorPan = colorPan;
        this.cover = cover;
        this.volume = volume;
    }

    private Color colorPan;
    private boolean cover;
    private double volume;

    public Color getColorPan() {
        return colorPan;
    }

    public void setColorPan(final Color colorPan) {
        this.colorPan = colorPan;
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
