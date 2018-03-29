package ua.lviv.iot;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


public class DishesWriter {


    public void writeToFile(final List<Dishes> dishesList) {
        try (PrintWriter writer = new PrintWriter("file.csv")) {

            for (Dishes dish: dishesList) {
                writer.println(dish.toCSV());
                writer.println(dish.getHeaders());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
