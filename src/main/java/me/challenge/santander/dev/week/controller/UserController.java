package me.challenge.santander.dev.week.controller;

import me.challenge.santander.dev.week.domain.model.User;
import me.challenge.santander.dev.week.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/users") // DEFINI UM PATH PARA OS RECURSOS (qUANDO ACESSAREM A APLICAÇÃO VAI TER UM CONTEXTO/users PARA EXPOR OS ENDPOINTS
public class UserController {
    // EXPOR AS DUAS FINALIDADES CRIADAS NA CAMADA DE SERVIÇO. O CONTROLLER VAI CHAMAR A CAMADA DE SERVIÇO PQ É ELA QUE TEM TODAS AS REGRAS DE NEGÓCIO
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/{id}")// RECEBER UM OD COMO VARIAVEL PATH
    public ResponseEntity<User> findById(@PathVariable Long id) {
        var user = userService.findById(id);
        return ResponseEntity.ok(user);
    }// ENDPOINT QUE VAI RECEBER UM ID, VAI BUSCAR USUARIO PELO ID E VAI RETORNAR USUARIO COMPLETO CASO ELE EXISTA
    @PostMapping
    public ResponseEntity<User> create(@RequestBody User userToCreate) {
        var userCreated = userService.create(userToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(userCreated);
    }

}
