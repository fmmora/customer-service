package org.acme.customer.mapper;

import jakarta.enterprise.context.ApplicationScoped;
import org.acme.customer.dto.CustomerDTO;
import org.acme.customer.entity.Customer;

@ApplicationScoped
public class CustomerMapper {

    public CustomerDTO toDTO(Customer c) {
        if (c == null) {
            return null;
        }

        CustomerDTO dto = new CustomerDTO();
        dto.setId(c.id);
        dto.setName(c.name);
        dto.setDocumentId(c.documentId);
        dto.setEmail(c.email);
        dto.setStatus(c.status);
        return dto;
    }
}
