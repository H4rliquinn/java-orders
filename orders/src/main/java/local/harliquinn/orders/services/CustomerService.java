package local.harliquinn.orders.services;

import local.harliquinn.orders.models.Customer;

import java.util.List;

public interface CustomerService
{
    List<Customer> findAll();

    Customer save(Customer customer);

    Customer update(Customer customer,
                      long id);

    void delete(long id);
}
