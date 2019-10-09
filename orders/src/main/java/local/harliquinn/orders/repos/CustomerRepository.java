package local.harliquinn.orders.repos;

import local.harliquinn.orders.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer,Long>
{
}
