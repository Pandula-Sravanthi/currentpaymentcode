package com.dbs.pay.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.pay.model.customer;


public interface customerRespository extends JpaRepository< customer, String> {

}
