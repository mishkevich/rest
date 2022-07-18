package com.idfinancelab.cryptocurrency.service;

import com.idfinancelab.cryptocurrency.entity.Currency;

import java.util.List;

public interface CurrencyService {

    List<Currency> findAll();

    Currency findById(Long id);

    void save(Currency currency);

    void delete(Long id);

}
