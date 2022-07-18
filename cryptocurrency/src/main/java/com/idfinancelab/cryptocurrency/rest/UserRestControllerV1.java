package com.idfinancelab.cryptocurrency.rest;

import com.idfinancelab.cryptocurrency.entity.Currency;
import com.idfinancelab.cryptocurrency.entity.User;
import com.idfinancelab.cryptocurrency.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("api/v1/user")
public class UserRestControllerV1 {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable("id") Long id) {
//        TODO
//        public ResponseEntity<User> getCurrency(@PathVariable("id") Long userId) {
//            if (userId == null) {
//                return  new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
//            }
        return userService.findById(id);
    }




}
