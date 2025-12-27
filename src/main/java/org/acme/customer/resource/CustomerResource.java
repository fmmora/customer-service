package org.acme.customer.resource;

import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.acme.customer.dto.CustomerDTO;
import org.acme.customer.dto.CustomerValidationDTO;
import org.acme.customer.service.CustomerService;

@Path("/customers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CustomerResource {

    @Inject
    CustomerService customerService;

    @GET
    @Path("/{id}")
    public CustomerDTO getById(@PathParam("id") Long id) {
        return customerService.getById(id);
    }

    @GET
    @Path("/{id}/validate")
    public CustomerValidationDTO validate(@PathParam("id") Long id) {
        return customerService.validateCustomer(id);
    }
}
