package examples.customers.api.rest.v1.resources;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import examples.customers.lib.v1.Customer;

@Path("/customers")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CustomerResource {

	@GET
	@Path("/test")
	public Response hello() {
		return Response.ok("Hello").build();
	}
	
	@GET
	public Response getCustomers(@QueryParam("limit") int limit,
			@QueryParam("offset") int offset) {
		return Response.ok().build();
	}
	
	@POST
	public Response createCustomer(Customer newCustomer) {
		
		return Response.ok().build();
	}
	
	
	
}
