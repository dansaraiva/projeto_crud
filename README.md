# Projeto CRUD de Produtos

Este é um projeto de CRUD (Create, Read, Update, Delete) simples para gerenciamento de produtos. Sinta-se à vontade para usar, modificar e distribuir este código livremente, de acordo com os termos da licença MIT (veja abaixo).

## Visão Geral

O projeto consiste em um backend em Java com Spring Boot e um frontend em React, permitindo a criação, leitura, atualização e exclusão de produtos.

### Funcionalidades

*   **Criação de Produtos:** Adicione novos produtos ao sistema com nome, descrição e preço.
*   **Listagem de Produtos:** Visualize todos os produtos cadastrados em uma tabela.
*   **Edição de Produtos:** Modifique os detalhes de um produto existente.
*   **Exclusão de Produtos:** Remova produtos do sistema.

## Tecnologias Utilizadas

*   **Backend:**
    *   Java
    *   Spring Boot
    *   Maven
*   **Frontend:**
    *   React
    *   JavaScript
    *   Vite

## Como Executar o Projeto

### Pré-requisitos

*   Java Development Kit (JDK) 17 ou superior
*   Maven
*   Node.js e npm (ou yarn)

### Backend

1.  Navegue até o diretório `backend/crud_produtos`:

    ```bash
    cd backend/crud_produtos
    ```

2.  Execute o aplicativo Spring Boot:

    ```bash
    ./mvnw spring-boot:run
    ```

    Ou, se preferir, construa o projeto e execute o arquivo JAR:

    ```bash
    ./mvnw clean install
    java -jar target/<nome_do_arquivo_jar>.jar
    ```

    O backend estará disponível em `http://localhost:8080`.

### Frontend

1.  Navegue até o diretório `frontend/front`:

    ```bash
    cd frontend/front
    ```

2.  Instale as dependências:

    ```bash
    npm install
    ```

    Ou, se usar yarn:

    ```bash
    yarn install
    ```

3.  Execute o aplicativo React:

    ```bash
    npm run dev
    ```

    Ou, se usar yarn:

    ```bash
    yarn dev
    ```

    O frontend estará disponível em `http://localhost:5173`.

## Configuração

### Backend

O arquivo de configuração do backend é `backend/crud_produtos/src/main/resources/application.properties`. Você pode configurar a porta do servidor, as configurações do banco de dados e outras propriedades do Spring Boot neste arquivo.

## Configuração do `application.properties`

O arquivo `application.properties` é responsável pelas configurações do backend Spring Boot.

Abaixo está um exemplo básico para rodar o projeto localmente com banco de dados H2 em memória:

```properties
# Porta do servidor
server.port=8080

# Configuração do banco de dados H2 (em memória)
spring.datasource.url=jdbc:h2:mem:produtosdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

# Configurações do JPA/Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

# Habilita o console web do H2
spring.h2.console.enabled=true

### Frontend

O frontend se conecta ao backend na porta 8080 por padrão. Se você precisar alterar a URL do backend, modifique o arquivo `frontend/front/src/Formulario.jsx` e `frontend/front/src/Tabela.jsx`.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests para melhorar o projeto.

## Licença

Este projeto está licenciado sob a licença MIT - veja o arquivo [LICENSE](./LICENSE) para detalhes.