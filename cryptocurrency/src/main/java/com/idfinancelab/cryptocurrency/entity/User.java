package com.idfinancelab.cryptocurrency.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@Validated
public class User implements Serializable {
    @Column(name = "user_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", unique = true)
//    TODO
//    @NotBlank(message = "Введите имя пользователя - от 2 до 20 символов")
//    @Pattern(regexp = "^\\w{2,20}$", message = "Введите имя пользователя - от 2 до 20 символов")
    private String username;

    @Column(name = "symbol")
    private String symbol;

    @Column(name = "price_usd")
    private Double priceUsd;

    @Column(name = "message")
    private String message;

}
