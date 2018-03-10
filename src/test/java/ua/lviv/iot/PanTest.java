package ua.lviv.iot;

import org.junit.Test;

import static org.junit.Assert.*;

public class PanTest {

    private Pan testPan = new Pan(Color.BLACK, true, 2.5, 150, Material.GLASS,
            DishesType.KITCHENWARE, "panSmall");

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