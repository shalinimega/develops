package com.checkbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event.ID;

import com.checkbank.entity.Customer;

public interface Repository extends JpaRepository<Customer, Integer> {

}
