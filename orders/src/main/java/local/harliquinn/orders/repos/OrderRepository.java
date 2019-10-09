package local.harliquinn.orders.repos;

import local.harliquinn.orders.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order,Long>
{
}
