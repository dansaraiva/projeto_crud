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
*   **Banco de dados:**
    *   H2 Database

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

Navegue até a pasta `frontend/front/`
Execute 
```bash
npm install
```

Em seguida execute 
```bash
npm run dev
```

Acesse a aplicação em `http://localhost:5173`

## Configuração

### Backend

O arquivo de configuração do backend é `backend/crud_produtos/src/main/resources/application.properties`. Você pode configurar a porta do servidor, as configurações do banco de dados e outras propriedades do Spring Boot neste arquivo.

### Configuração do `application.properties`

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
```
### Configuração do Banco de Dados

O projeto utiliza o banco de dados H2 (em memória) para desenvolvimento e testes.

### Seed da Base de Dados

Para inicializar o banco de dados com dados de exemplo, o projeto inclui um arquivo `data.sql` localizado em `backend/src/main/resources/`. Este arquivo é executado automaticamente quando a aplicação é iniciada.

#### Como funciona:

1. O Spring Boot detecta o arquivo `data.sql` no diretório de recursos
2. Após criar as tabelas, o Spring Boot executa os comandos SQL neste arquivo
3. Os produtos de exemplo são inseridos na tabela `produtos`

#### Como personalizar:

Para adicionar ou modificar os dados iniciais, edite o arquivo `data.sql`. Exemplo:

```sql
INSERT INTO produtos (nome, marca) VALUES ('Notebook Inspiron', 'Dell');
INSERT INTO produtos (nome, marca) VALUES ('Galaxy S23', 'Samsung');
```

### Frontend

O frontend se conecta ao backend na porta 8080 por padrão. Se você precisar alterar a URL do backend, modifique o arquivo `frontend/front/src/Formulario.jsx` e `frontend/front/src/Tabela.jsx`.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests para melhorar o projeto.

## Licença

Este projeto está licenciado sob a licença MIT - veja o arquivo [LICENSE](./LICENSE) para detalhes.