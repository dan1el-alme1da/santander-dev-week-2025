package me.challenge.santander.dev.week.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_users")
public class User {
    @Id // Confirmar que o ID é um identificador de fato
    @GeneratedValue(strategy = GenerationType.IDENTITY) // DEFINE UM ID ALEATÓRIO AUTOMÁTICO
    private Long id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)// GARANTE UM RELACIONAMENTO FORTE ENTRE AS ENTIDADES COUNT E USERS
    private Account account;

    @OneToOne(cascade = CascadeType.ALL)
    private Card card;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER) // TODA VEZ QUE EU FOR BUSCAR UM USUARIO NO BANCO, QUERO QUE TRAGA A LISTA FEATURES
    private List<Feature> features;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<News> news;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }
}
