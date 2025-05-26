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
