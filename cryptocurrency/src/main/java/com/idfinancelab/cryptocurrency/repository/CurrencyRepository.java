package com.idfinancelab.cryptocurrency.repository;

import com.idfinancelab.cryptocurrency.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository <Currency, Long> {


}
