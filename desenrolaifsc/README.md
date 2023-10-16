# Projeto DesenrolaIFSC

Esse projeto é um API desenvolvida com Spring Boot que segue a arquitetura de camadas comum no desenvolvimento Java.

## Arquitetura

Aqui estão as camadas usadas nesse projeto:

- `Model` - Representa as entidades que serão usadas na aplicação.
- `Repository` - Interfaces que fornecem operações de CRUD para os objetos da camada Model.
- `Service` - Onde a lógica de negócios é implementada.
- `Controller` - Pontos HTTP de entrada para a nossa aplicação.

Por exemplo, no caso de um usuário para autenticação, os arquivos criados seriam:

- `AuthUser.java` (Model)
- `AuthUserRepository.java` (Repository)
- `AuthUserService.java` (Service)
- `AuthUserController.java` (Controller)

Eles estariam organizados da seguinte forma no projeto:

```
.
└── com
    └── desenrolaifsc
        └── desenrolaifsc
            ├── DesenrolaifscApplication.java
            ├── controller
            │   └── AuthUserController.java
            ├── model
            │   └── AuthUser.java
            ├── repository
            │   └── AuthUserRepository.java
            └── service
                └── AuthUserService.java
```

## Clean Code

Cada classe tem uma única responsabilidade, de acordo com o Princípios SOLID de design de código:

- `AuthUser`: Representa o objeto usuário para fins de autenticação.
- `AuthUserRepository`: Fornece operações de banco de dados para `AuthUser`.
- `AuthUserService`: Implementa a lógica de negócios relacionada a `AuthUser`.
- `AuthUserController`: Gerencia as solicitações HTTP e respostas para `AuthUser`.

Recomenda-se seguir essa estrutura de pacotes e arquivos para manter a consistência do código, fazendo com que o código seja mais fácil de ler e manter.

Para criar novos arquivos nessa estrutura, você pode simplesmente adicionar novos arquivos `.java` aos diretórios apropriados (model, repository, service, controller) e seguir a convenção de nomes descrita acima.