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

### Fluxo de desenvolvimento

1. `Model`: Começa-se criando o objeto `AuthUser`, um POJO que irá representar o usuário durante a fase de autenticação. Conterá as informações necessárias para a autenticação, como o `username` e `password`.

2. `Repository`: A próxima etapa é a `AuthUserRepository`, que é a interface que define as operações de banco de dados para o objeto `AuthUser`, estendendo as operações básicas do `JpaRepository` sem necessidade de implementação desnecessária dos métodos básicos de CRUD.

3. `Service`: `AuthUserService` é a camada onde a lógica de negócios é implementada, e é criada após o `Repository`. É o lugar onde as senhas do usuário são criptografadas antes de serem salvas no banco de dados e onde a lógica de autenticação e registro de usuário é implementada.

4. `Controller`: Finalmente, cria-se o `AuthUserController`. O controlador é o ponto de entrada HTTP da nossa aplicação, onde as solicitações HTTP são recebidas e manipuladas.


Esses são os passos a serem seguidos para criação de endpoint, desde sua concepção com a estruturação do model, seguindo com a criação da interface, após implementado a logica de negócio, e finalmente criando o ponto de conexão http