package pl.urbanik.beckend.service;

import org.springframework.stereotype.Service;
import pl.urbanik.beckend.model.Customers;

import java.util.List;

@Service
public interface CustomerService {

    Customers addCustomer(Customers customer);

    Customers getCustomerById(Long id);

    List<Customers> getAllCustomers();

    Customers updateCustomer(Customers customer);

    void deleteCustomer(Long id);
}
