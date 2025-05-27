package me.challenge.santander.dev.week.domain.repository;

import me.challenge.santander.dev.week.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // DETERMINA QUE AKI É UM REPOSITORY (OPCIONAL)
public interface UserRepository extends JpaRepository<User, Long> {
    // USA GENERICS PARA ESPECIFICAR O PRIMEIRO PARAMETRO (T) = ENTIDADE QUE USAMOS E DEPOIS O TIPO DE ID
    // AGORA QUE ESTAMOS ESTENDENDO jPArEPOSITORY, TEMOS TODAS AS OPERAÇÕES BÁSICAS

    boolean existsByAccountNumber(String accountNumber);
    //QUERO VALIDAR SE O ACCOUNT NUMBER JA EXISTE
}
