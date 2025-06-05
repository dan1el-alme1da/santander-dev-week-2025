# 🚀 Santander Dev Week 2025

Aplicação desenvolvida durante o Santander Dev Week 2025, utilizando **Spring Boot**, **Hibernate (JPA)** e **PostgreSQL** hospedado no **Railway**.

---

## 📚 Tecnologias utilizadas

- Java 17 (Corretto)
- Spring Boot
- Spring Data JPA
- PostgreSQL (Railway)
- Hibernate
- Maven

---

Pré-requisitos:
Java 17+

Maven 3.8+

👨‍💻 Autor
Daniel 
[LinkedIn](https://www.linkedin.com/in/dan1elalme1da/)




## Diagrama de Classes

``` mermaid
classDiagram
    class Usuario {
        +String name
        +Conta accont
        +Feature[] feature
        +Cartao card
        +News[] news
    }

    class Conta {
        +String number
        +String agency
        +Float balance
        +Float limite
    }

    class Feature {
        +String icon
        +String description
    }

    class Cartao {
        +String number
        +Float limit
    }

    class News {
        +String icon
        +String description
    }

    Usuario "1" --> "1" Conta
    Usuario "1" --> "N" Feature
    Usuario "1" --> "1" Cartao
    Usuario "1" --> "N*" News
