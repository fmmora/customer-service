package org.acme.customer.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.customer.dto.CustomerDTO;
import org.acme.customer.dto.CustomerValidationDTO;
import org.acme.customer.entity.Customer;
import org.acme.customer.exception.CustomerNotFoundException;
import org.acme.customer.mapper.CustomerMapper;
import org.acme.customer.mapper.CustomerValidationMapper;
import org.acme.customer.metrics.CustomerMetrics;

@ApplicationScoped
public class CustomerService {

    @Inject
    CustomerMapper customerMapper;

    @Inject
    CustomerValidationMapper customerValidationMapper;

    @Inject
    CustomerMetrics metrics;

    public CustomerDTO getById(Long id) {
        metrics.incrementLookup();
        Customer customer = Customer.findById(id);
        if (customer == null) {
            metrics.incrementNotFound();
            throw new CustomerNotFoundException(id);
        }

        return customerMapper.toDTO(customer);
    }

    public CustomerValidationDTO validateCustomer(Long id) {
        var customer = getById(id);
        return customerValidationMapper.toValidationDTO(customer);
    }
}
