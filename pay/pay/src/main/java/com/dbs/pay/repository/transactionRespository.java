package com.dbs.pay.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.pay.model.transaction;

public interface transactionRespository extends JpaRepository< transaction, Double> {

}