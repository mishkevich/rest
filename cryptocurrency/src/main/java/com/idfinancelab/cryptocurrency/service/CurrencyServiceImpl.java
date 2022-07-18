package com.idfinancelab.cryptocurrency.service;

import com.idfinancelab.cryptocurrency.entity.Currency;
import com.idfinancelab.cryptocurrency.exeptions.CurrencyNotFoundException;
import com.idfinancelab.cryptocurrency.repository.CurrencyRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class CurrencyServiceImpl implements CurrencyService {

    @Autowired
    CurrencyRepository currencyRepository;

    @Override
    public List<Currency> findAll() {
        log.info("Get all currencies");
        return currencyRepository.findAll();
    }

    @Override
    public Currency findById(Long id) {
        log.info("Get currency by id: ", id);
        Optional<Currency> currencyId = currencyRepository.findById(id);
        if (currencyId.isEmpty()) {
            throw new CurrencyNotFoundException("There is no currency with ID = " + id + " in database");
        }
        return currencyId.get();
    }

    @Override
    public void save(Currency currency) {
        log.info("Currency update", currency);
        currencyRepository.save(currency);
    }

    @Override
    public void delete(Long id) {
        log.info("Delete currency with id: ", id);
        Optional<Currency> currencyId = currencyRepository.findById(id);
        if (currencyId.isEmpty()) {
            throw new CurrencyNotFoundException("There is no currency with ID = " + id + " in database");
        }
        currencyRepository.deleteById(id);
    }
}
