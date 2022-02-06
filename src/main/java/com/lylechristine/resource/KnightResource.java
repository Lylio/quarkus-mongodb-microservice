package com.lylechristine.resource;

import com.lylechristine.model.Knight;
import com.lylechristine.repository.KnightRepository;
import org.bson.types.ObjectId;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/knights")
public class KnightResource {

    private KnightRepository knightRepository;

    @Inject
    public KnightResource(KnightRepository knightRepository) {
        this.knightRepository = knightRepository;
    }

    @POST
    public Response create(Knight knight) {
        knightRepository.persist(knight);
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("/{id}")
    public void update(@PathParam("id") String id, Knight knight) {
        knight.id = new ObjectId(id);
        knightRepository.update(knight);
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") String id) {
        Knight knight = knightRepository.findById(new ObjectId(id));
        knightRepository.delete(knight);
    }

    @GET
    @Path("/{id}")
    public Knight get(@PathParam("id") String id) {
        return knightRepository.findById(new ObjectId(id));
    }

    @GET
    public List<Knight> list() {
        return knightRepository.listAll();
    }

    @GET
    @Path("/orderedByName")
    public List<Knight> listAllOrderedByName() {
        return knightRepository.findOrderedByName();
    }

    @GET
    @Path("/search/{name}")
    public Knight search(@PathParam("name") String name) {
        return knightRepository.findByName(name);
    }

    @GET
    @Path("/count")
    public Long count() {
        return knightRepository.count();
    }
}
