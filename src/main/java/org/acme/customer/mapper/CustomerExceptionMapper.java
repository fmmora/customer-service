package org.acme.customer.mapper;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import org.acme.customer.exception.CustomerNotFoundException;

import java.util.Map;

@Provider
public class CustomerExceptionMapper implements ExceptionMapper<CustomerNotFoundException> {

    @Override
    public Response toResponse(CustomerNotFoundException ex) {
        return Response.status(Response.Status.NOT_FOUND)
                .entity(Map.of("message", ex.getMessage()))
                .build();
    }
}
