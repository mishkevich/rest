package com.idfinancelab.cryptocurrency.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "currencies")

public class Currency {

    @Column(name = "id")
    @Id
    private Long id;

    @Column(name = "symbol")
    private String symbol;

    @Column(name = "name_currency")
    private String name;

    @Column(name = "nameid")
    private String nameid;

    @Column(name = "rank_currency")
    private Long rank;

    @Column(name = "price_usd")
    private Double priceUsd;

    @Column(name = "percent_change_24h")
    private Double percentChange24h;

    @Column(name = "percent_change_1h")
    private Double percentChange1h;

    @Column(name = "percent_change_7d")
    private Double percentChange7d;

    @Column(name = "market_cap_usd")
    private Double marketCapUsd;

    @Column(name = "volume24")
    private Double volume24;

    @Column(name = "volume24_native")
    private Double volume24Native;

    @Column(name = "csupply")
    private Double csupply;

    @Column(name = "price_btc")
    private Double priceBTC;

    @Column(name = "tsupply")
    private Long tsupply;

    @Column(name = "msupply")
    private Long msupply;

}
