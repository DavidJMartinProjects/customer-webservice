package com.customer.controller;

import com.app.openapi.generated.api.CustomersApi;
import com.app.openapi.generated.model.Customer;
import com.app.openapi.generated.model.CustomerPage;

import com.customer.service.CustomerService;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @author davidjmartin
 */
@RestController
@Slf4j
public class CustomerController implements CustomersApi {

    static final String CUSTOMERS_API_BASE_PATH = "/customers";

    @Autowired
    private CustomerService customerService;

    @Override
    public ResponseEntity<CustomerPage> getCustomers(Integer page, Integer size) {
        return ResponseEntity.ok(customerService.getCustomers(page, size));
    }

    @Override
    public ResponseEntity<Customer> createCustomer(Customer customer) {
        log.info("received POST request to path: {}.", CUSTOMERS_API_BASE_PATH);
        return ResponseEntity.status(HttpStatus.CREATED).body(customerService.saveCustomer(customer));
    }

    @Override
    public ResponseEntity<Customer> getCustomerById(Long id) {
        log.info("received GET request to path: {}.", CUSTOMERS_API_BASE_PATH + id);
        return ResponseEntity.ok(customerService.findCustomerById(id));
    }

    @Override
    public ResponseEntity<Customer> updateCustomerById(Integer id,Customer customer) {
        log.info("received PUT request to path: {}.", CUSTOMERS_API_BASE_PATH + id);
        customer.setId(id);
        return ResponseEntity.ok(customerService.updateCustomerById(customer));
    }

    @Override
    public ResponseEntity<Void> deleteCustomerById(Integer id) {
        log.info("received DELETE request to path: {}.", CUSTOMERS_API_BASE_PATH +"/"+ id);
        customerService.deleteCustomerById(id);
        return ResponseEntity.noContent().build();
    }

}
