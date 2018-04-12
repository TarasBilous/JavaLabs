package ua.lviv.iot;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

@Path("/pans")
public class DishService {
    private static Map<Integer, Pan> dishes = new HashMap<>();

    @GET
    @Path("{id}/")
    @Produces(MediaType.APPLICATION_JSON)
    public final Pan getDishes(@PathParam("id") Integer id) {
        dishes.put(80, new Pan(80, Material.GLASS, DishesType.KITCHENWARE, "panSmall", 80, 4.5,  Color.BLACK, true));
        return dishes.get(id);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public final void createDishes(Pan pan) {
        dishes.put(pan.getId(), pan);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public final void replaceDishes(Pan pan) {
        dishes.replace(pan.getId(), pan);
    }

    @DELETE
    @Path("/{id}")
    public final void deleteDishes(@PathParam("id") Integer position) {
        dishes.remove(position);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public final Map<Integer,Pan> getAllPans(){
        return  dishes;
    }
}