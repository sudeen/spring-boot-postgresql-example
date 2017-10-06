package com.sudin.postgresql.springbootpostgresqlexample.repositories;

import com.sudin.postgresql.springbootpostgresqlexample.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer,Long> {

    List<Customer> findByLastName(String lastName);

}
