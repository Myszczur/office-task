package pl.urbanik.beckend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.urbanik.beckend.model.Customers;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Long> {
}
