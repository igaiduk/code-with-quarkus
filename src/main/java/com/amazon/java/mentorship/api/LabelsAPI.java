package com.amazon.java.mentorship.api;

import com.amazon.java.mentorship.entities.Label;
import com.amazon.java.mentorship.services.LabelService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.*;

@Path("/labels")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LabelsAPI {

    LabelService labelService = new LabelService();
    @GET
    public List<Label> getAll() {
        return labelService.getAllLabels();
    }

    @POST
    public List<Label> addLabel( Label label) {
        labelService.addLabel(label);
        return labelService.getAllLabels();
    }

    @DELETE
    public List<Label> deleteLabel(Label label) {
        labelService.getAllLabels().remove(label);
          return labelService.getAllLabels();
    }

    @PUT
    @Path("/{id}")
    public List<Label> updateLabel(@PathParam("id") int id, Label label) {
        labelService.getAllLabels().set(labelService.getAllLabels().indexOf(label), label);
        return labelService.getAllLabels();
    }

}
