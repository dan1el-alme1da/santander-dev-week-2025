package me.challenge.santander.dev.week.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_account")
public class Account {
    @Id // Confirmar que o ID é um identificador de fato
    @GeneratedValue(strategy = GenerationType.IDENTITY) // DEFINE UM ID ALEATÓRIO AUTOMÁTICO
    private Long id;
    @Column(unique = true)// @Column DEFINE CRITÉRIOS DESEJADOS, NESSE CASO É PRA DEIXAR NUMERO DA CONTA UNICO
    private String number;
    private String agency;
    private BigDecimal balance;
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

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}
