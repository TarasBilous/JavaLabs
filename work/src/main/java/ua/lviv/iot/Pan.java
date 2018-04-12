package ua.lviv.iot;

public class Pan extends Dishes {

    private Integer id;
    private double volume;
    private Color colorPan;
    private boolean cover;

    public Pan() {
    }

    public Pan(int price, Material dishesMaterial, DishesType type, String dishName,
               Integer id, double volume, Color colorPan, boolean cover) {
        super(price, dishesMaterial, type, dishName);
        this.id = id;
        this.volume = volume;
        this.colorPan = colorPan;
        this.cover = cover;
    }

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

    public final Integer getId() {
        return id;
    }

    public final void setId(Integer id) {
        this.id = id;
    }
}
