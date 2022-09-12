package pl.urbanik.beckend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.urbanik.beckend.model.Customers;
import pl.urbanik.beckend.service.CustomerService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/customer")
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    public ResponseEntity<Customers> addCustomer(@RequestBody Customers customer) {
        return new ResponseEntity<>(customerService.addCustomer(customer), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customers> getCustomerById(@PathVariable Long id) {
        return new ResponseEntity<>(customerService.getCustomerById(id), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Customers>> getAllCustomers() {
        return new ResponseEntity<>(customerService.getAllCustomers(), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Customers> updateCustomer(@RequestBody Customers customer) {
        return new ResponseEntity<>(customerService.updateCustomer(customer), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCustomer(@PathVariable("id") Long id) {
        customerService.deleteCustomer(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
