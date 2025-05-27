package me.challenge.santander.dev.week.service.impl;

import me.challenge.santander.dev.week.domain.model.User;
import me.challenge.santander.dev.week.domain.repository.UserRepository;
import me.challenge.santander.dev.week.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service // QUERO QUE ESSA CLASSE SEJA TRATADA COMO UM SERVICE
public class UserServiceImpl implements UserService { // A CLASSE QUE IMPLEMENTA A MINHA INTERFACE

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
        // QUERO BUSCAR UM ID E SE CASO NÃO ENCONTRAR ELE LANÇA UMA EXCEÇÃO
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("This User Account Number already exists");
            // QUERO QUE AVISE SE O USUARIO JA EXISTE
        }
        return this.userRepository.save(userToCreate);// NECESSARIO SALVAR O OSSO DADO
    }
}
