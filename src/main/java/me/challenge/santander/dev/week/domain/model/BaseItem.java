package me.challenge.santander.dev.week.domain.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass // ATRAVÉS DESSA AMOTAÇÃO EU FAÇO COM AS CLASSES FEATURE E NEWS ESTENDAM ESSA CONFIGURAÇÃO
public abstract class BaseItem {
    @Id // Confirmar que o ID é um identificador de fato
    @GeneratedValue(strategy = GenerationType.IDENTITY) // DEFINE UM ID ALEATÓRIO AUTOMÁTICO
    private Long id;
    private String icon;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
