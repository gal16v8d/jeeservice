package co.com.gsdd.jeeservice.rest.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.com.gsdd.jeeservice.model.Person;

@Path("/person")
public interface PersonRest {

    @GET
    @Path("/{personId}")
    @Produces(MediaType.APPLICATION_JSON)
    Person getPersonById(@PathParam("personId") String personId);

}
