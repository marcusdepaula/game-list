
# GameList API – CRUD e Movimentação Dinâmica de Jogos
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/marcusdepaula/game-list/blob/main/LICENSE) 

# Sobre o projeto

GameList API é uma aplicação backend em Java construída durante o Intensivao JAVA Spring, evento organizado pela DevSuperior. A aplicacao foi criada para gerenciar um catálogo de jogos e listas organizadas de forma dinâmica.

A aplicação permite consultar jogos, visualizar listas personalizadas e até reordenar os jogos dentro de cada lista (movimentação de posição), sendo ideal para catálogos, playlists ou qualquer cenário onde exista ordenação customizada de itens.

O projeto foi desenvolvido como prática de Spring Boot, JPA/Hibernate e APIs RESTful, servindo como base para integração com frontends web ou mobile.

## 🔎 Funcionalidades principais

Listar todos os jogos cadastrados no banco.

Consultar informações detalhadas de um jogo específico.

Listar todas as coleções (listas) de jogos.

Consultar os jogos pertencentes a uma lista específica.

Reordenar dinamicamente a posição dos jogos em uma lista

# 🗃 Modelo conceitual

O sistema possui duas entidades principais:

Game → representa um jogo (título, ano, gênero, plataformas, etc.).

GameList → representa uma lista de jogos (com ordem definida).

Além disso, existe a tabela de associação Belonging, que guarda a relação jogo ↔ lista e a posição de cada jogo dentro da lista.

## ⚙️ Tecnologias utilizadas
Back end

Java 11

Spring Boot

Spring Data JPA / Hibernate

Maven

Banco H2 (ambiente de teste)

Implantação em produção

Railway (Banco de dados: PostgreSQL)


# ▶️ Como executar o projeto
Back end

Pré-requisitos: Java 11

// clonar repositório
git clone https://github.com/marcusdepaula/game-list

// entrar na pasta do projeto
cd gamelist-backend

// executar o projeto
./mvnw spring-boot:run


Após rodar, a API estará disponível em:
👉 http://localhost:8080

Exemplos de endpoints

GET /games → Lista todos os jogos

GET /games/{id} → Busca informações de um jogo

GET /lists → Retorna todas as listas de jogos

GET /lists/{id}/games → Lista os jogos de uma lista específica

POST /lists/{id}/replacement → Move um jogo dentro da lista


# Como executar o projeto

## Back end
Pré-requisitos: Java 17

```bash
# clonar repositório
git clone https://github.com/marcusdepaula/game-list

# entrar na pasta do projeto back end
cd gamelist-backend

# executar o projeto
./mvnw spring-boot:run
```

# Autor

👨‍💻 Marcus Vinicius Silva de Paula
🔗 https://www.linkedin.com/in/marcus-de-paula

