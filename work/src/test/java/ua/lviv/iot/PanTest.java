package ua.lviv.iot;

import org.junit.Test;

import static org.junit.Assert.*;

public class PanTest {

    private Pan testPan = new Pan( 80, Material.GLASS, DishesType.KITCHENWARE, "panSmall", 80, 4.5,  Color.BLACK, true);

    @Test
    public void getColorPan() {
        testPan.setColorPan(Color.GRAY);
        assertEquals(Color.GRAY, testPan.getColorPan());
    }

    @Test
    public void isCover() {
        testPan.setCover(false);
        assertEquals(false, testPan.isCover());
    }

    @Test
    public void getVolume() {
        testPan.setVolume(4.0);
        assertEquals(4.0, testPan.getVolume(), 0.1);
    }
}