package me.challenge.santander.dev.week.service;

import me.challenge.santander.dev.week.domain.model.User;

public interface UserService {// DEFINIR QUAIS AS OPERAÇÕES QUE EU GOSTARIA DE CRIAR
    User findById(Long id);

    User create(User userToCreate);

}
