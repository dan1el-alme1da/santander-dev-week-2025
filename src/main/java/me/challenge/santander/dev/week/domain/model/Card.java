package me.challenge.santander.dev.week.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_card")
public class Card {
    @Id // Confirmar que o ID é um identificador de fato
    @GeneratedValue(strategy = GenerationType.IDENTITY) // DEFINE UM ID ALEATÓRIO AUTOMÁTICO
    private Long id;
    @Column(unique = true)// @Column DEFINE CRITÉRIOS DESEJADOS, NESSE CASO É PRA DEIXAR NUMERO DO CARTAO UNICO
    private String number;
    @Column(name = "available_limit", precision = 13, scale = 2)
    private BigDecimal limit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}
