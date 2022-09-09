package pl.urbanik.beckend.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.urbanik.beckend.exceptions.CustomerNotFoundException;
import pl.urbanik.beckend.model.Customers;
import pl.urbanik.beckend.repository.CustomersRepository;
import pl.urbanik.beckend.service.CustomerService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomersRepository customersRepository;

    @Override
    public Customers addCustomer(Customers customer) {
        return customersRepository.save(customer);
    }

    @Override
    public Customers getCustomerById(Long id) {
        return customersRepository.findById(id)
                .orElseThrow(() -> new CustomerNotFoundException("Customer not exist with id: " + id));
    }

    @Override
    public List<Customers> getAllCustomers() {
        return customersRepository.findAll();
    }

    @Override
    public Customers updateCustomer(Customers customer) {
        return customersRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Long id) {
        customersRepository.deleteById(id);
    }
}
