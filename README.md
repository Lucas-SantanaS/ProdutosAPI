# 📦 Produtos API

API REST para gerenciamento de produtos, desenvolvida com **Java** e **Spring Boot** como parte dos meus estudos de desenvolvimento backend.

> 🚧 **Projeto em desenvolvimento:** esta API está sendo construída e aprimorada ao longo do meu curso de Java, com implementação gradual de novas funcionalidades e conceitos de desenvolvimento backend.

## 🛠️ Tecnologias

- Java 21
- Spring Boot 4.1.0
- Spring Data JPA
- Spring WebMVC
- H2 Database
- H2 Console
- Lombok
- Maven

## 📌 Sobre o projeto

O objetivo deste projeto é colocar em prática conceitos de desenvolvimento de APIs REST utilizando o ecossistema Java e Spring Boot.

Durante o desenvolvimento, estou estudando e aplicando conceitos como:

- Criação de APIs REST
- Injeção de dependências
- Padrão MVC
- Persistência de dados com JPA
- Mapeamento objeto-relacional (ORM)
- Banco de dados H2
- Operações CRUD
- Organização e separação de responsabilidades
- Boas práticas de desenvolvimento backend

## 🚧 Status do projeto

O projeto ainda está em desenvolvimento.

### Implementado

- [x] Configuração inicial do Spring Boot
- [x] Configuração do Maven
- [x] Integração com Spring Data JPA
- [x] Configuração do banco H2
- [x] Configuração do H2 Console

### Em desenvolvimento

- [ ] Entidade de Produto
- [ ] Repository
- [ ] Service
- [ ] Controller
- [ ] Operações CRUD
- [ ] DTOs
- [ ] Validação de dados
- [ ] Tratamento de exceções
- [ ] Testes automatizados
- [ ] Documentação da API

## 💾 Banco de dados

Atualmente o projeto utiliza o **H2 Database em memória** para facilitar o desenvolvimento e os testes.

Configuração atual:

```yaml
spring:
  datasource:
    url: jdbc:h2:mem:produtos
    username: sa
    password: password
```

O console do H2 está habilitado em:

```text
http://localhost:8080/h2-console
```

## ▶️ Como executar

### Pré-requisitos

* Java 21 ou superior
* Git

### Clone o projeto

```bash
git clone https://github.com/Lucas-SantanaS/ProdutosAPI.git
```

Entre na pasta:

```bash
cd ProdutosAPI
```

### Execute a aplicação

No Windows:

```bash
.\mvnw.cmd spring-boot:run
```

No Linux/macOS:

```bash
./mvnw spring-boot:run
```

A aplicação será iniciada localmente.

## 📁 Estrutura

O projeto segue a estrutura padrão de uma aplicação Spring Boot:

```text
ProdutosAPI/
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   │       └── application.yml
│   └── test/
├── .gitignore
├── pom.xml
├── mvnw
└── mvnw.cmd
```

A estrutura será expandida conforme novas camadas e funcionalidades forem implementadas.

## 🎯 Objetivo de aprendizado

Este projeto faz parte da minha jornada de aprendizado em **Java e desenvolvimento backend**.

A ideia é evoluir a aplicação gradualmente, utilizando o projeto para praticar conceitos estudados durante o curso e construir uma base sólida em desenvolvimento de APIs REST com Spring Boot.

## 📚 Próximos passos

O projeto continuará sendo desenvolvido com a implementação de:

* CRUD completo de produtos
* DTOs
* Validações
* Tratamento global de exceções
* Testes automatizados
* Persistência de dados
* Documentação da API
* Melhorias na arquitetura e organização do código

---

**Lucas Santana Silva**

[GitHub](https://github.com/Lucas-SantanaS)

````
