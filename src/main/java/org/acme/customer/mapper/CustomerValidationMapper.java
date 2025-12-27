package org.acme.customer.mapper;

import jakarta.enterprise.context.ApplicationScoped;
import org.acme.customer.dto.CustomerDTO;
import org.acme.customer.dto.CustomerValidationDTO;
import org.acme.customer.entity.CustomerStatus;

@ApplicationScoped
public class CustomerValidationMapper {

    public CustomerValidationDTO toValidationDTO(CustomerDTO dto) {
        CustomerValidationDTO validation = new CustomerValidationDTO();
        validation.setCustomerId(dto.getId());
        validation.setValid(dto.getStatus() == CustomerStatus.ACTIVE);
        validation.setStatus(dto.getStatus().name());
        return validation;
    }
}
