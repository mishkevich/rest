package com.idfinancelab.cryptocurrency.rest;


import com.idfinancelab.cryptocurrency.entity.Currency;
import com.idfinancelab.cryptocurrency.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class CurrencyRestControllerV1 {

    @Autowired
    private CurrencyService currencyService;

    @GetMapping("")
    public List<Currency> getCurrency() {
        return currencyService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Currency findById(@PathVariable("id") Long id) {
//        TODO
//        public ResponseEntity<Currency> getCurrency(@PathVariable("id") Long currencyId) {
//            if (currencyId == null) {
//                return  new ResponseEntity<Currency>(HttpStatus.BAD_REQUEST);
//            }
        return currencyService.findById(id);
    }
}


