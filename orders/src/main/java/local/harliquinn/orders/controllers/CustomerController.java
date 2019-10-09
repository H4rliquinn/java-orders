package local.harliquinn.orders.controllers;

import com.sun.istack.XMLStreamReaderToContentHandler;
import local.harliquinn.orders.models.Customer;
import local.harliquinn.orders.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController
{
    @Autowired
    private CustomerService customerService;

//    GET /customer/order - Returns all customers with their orders
    @GetMapping(value="/order",produces = {"application/json"})
    public ResponseEntity<?> listAllCustomers()
    {
        List<Customer> myList=customerService.findAll();
        return new ResponseEntity<>(myList, HttpStatus.OK);
    }
//    POST /customer/new - Adds a new customer including any new orders

//    PUT /customer/update/{custcode} - Updates the customer based off of custcode. Does not have to do anything with Orders!

//    DELETE /customer/delete/{custcode} - Deletes the customer based off of custcode
//this should also delete the orders of that customer


//    Stretch
//    DELETE /agent/{agentcode} - Deletes an agent if they are not assigned to a customer

//    PUT /data/customer/update/{custcode} - update this endpoint to add any orders sent to the endpoint

}
