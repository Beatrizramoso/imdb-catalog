# Catálogo de Filmes 🎬

Projeto acadêmico simples para cadastro e busca de filmes, desenvolvido como parte das atividades da formação ADA.

## 📚 Descrição

Este projeto tem como objetivo criar uma aplicação de catálogo de filmes, com funcionalidades básicas como:

- Cadastro de filmes com informações sobre:
    - Nome
    - Data de lançamento
    - Orçamento
    - Atores
    - Diretor
- Cadastro de pessoas envolvidas (atores e diretores)
- Busca de filme pelo nome

O sistema utiliza conceitos de orientação a objetos com herança e composição.

## 🧩 Diagrama de Classes

O projeto se baseia no seguinte modelo de classes:

- `Pessoa` (classe abstrata)
    - Atributos: `nome`, `instagram`
- `Ator` (herda de Pessoa)
    - Atributo adicional: `personagemMaisPopular`
- `Diretor` (herda de Pessoa)
    - Atributos adicionais: `generoAssinatura`
- `Filme`
    - Atributos: `nome`, `dataLancamento`, `orcamento`, `atores`, `diretor`

![Diagrama de Classes](docs/diagrama.png) <!-- Se quiser usar a imagem, mova-a para a pasta docs e atualize o path -->

## 🔍 Funcionalidades

- [x] Cadastrar filmes
- [x] Cadastrar atores e diretores
- [x] Associar atores e diretores aos filmes
- [x] Buscar filme por nome (case-insensitive)

## 🚀 Tecnologias Utilizadas

- Java
- IntelliJ IDEA
- Git e GitHub

## 👩‍💻 Colaboradores

- [@Beatrizramoso](https://github.com/Beatrizramoso)
- [@Breitfel](https://github.com/Breitfel)
- [@nathaliaplsoares](https://github.com/nathaliaplsoares)
- [@Schionatto1991](https://github.com/Schionatto1991)

## 📦 Como rodar o projeto

1. Clone o repositório:

   ```bash
   git clone https://github.com/Beatrizramoso/imdb-catalog.git
