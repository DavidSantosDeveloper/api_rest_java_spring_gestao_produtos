## 🛒 Gestão de Produtos

### 📖 Descrição do Projeto
Este projeto consiste em uma API REST para o gerenciamento de produtos, desenvolvida utilizando Java, Spring Boot, JPA Repository e banco de dados PostgreSQL. A API permite o gerenciamento de produtos, oferecendo endpoints para operações CRUD (Create, Read, Update, Delete) sobre essa entidad.
O projeto adota os princípios da **Clean Architecture**, promovendo uma separação clara entre as camadas de domínio, aplicação e infraestrutura. Essa abordagem facilita a manutenção, escalabilidade e testabilidade do sistema, garantindo que as regras de negócio permaneçam independentes de frameworks e tecnologias externa.

---

### ⚙️ Pré-requisitos
Antes de executar a aplicação, certifique-se de ter instalado em seu ambiente de desenvolviment:

- **Java 11+**
- **Maven** para gerenciamento de dependências e build
- **PostgreSQL 16+**
- **IDE** (por exemplo, IntelliJ IDEA, Eclipse, VS Code)

---

### 🚀 Instruções para Executar a Aplicação

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/DavidSantosDeveloper/api_rest_java_spring_gestao_produtos.git
   cd api_rest_java_spring_gestao_produtos
   ```

2. **Configure o banco de dados PostgreSQL:**

   - Crie um banco de dados no PostgreSQL para a aplicação.
   - Atualize as configurações de conexão com o banco de dados no arquivo `application.properties`, localizado em `src/main/resources/`, com as informações do seu ambiente:

     ```properties
     spring.datasource.url=jdbc:postgresql://localhost:5432/seu_banco
     spring.datasource.username=seu_usuario
     spring.datasource.password=sua_senha
     ```

3. **Compile e execute a aplicação:**

   Utilize o Maven para compilar e executar a aplicação:

   ```bash
   mvn spring-boot:run
   ```

   A aplicação estará disponível em: `http://localhost:8080/api`

---

### 📘 Endpoints Disponíveis

A API oferece os seguintes endpoints para gerenciamento dos produtos:

#### **1. Produtos**

- **GET /produtos**: Lista todos os produtos.
- **GET /produtos/{id}**: Retorna os detalhes de um produto específico.
- **POST /produtos**: Cria um novo produto.
- **PUT /produtos/{id}**: Atualiza as informações de um produto existente.
- **DELETE /produtos/{id}**: Remove um produto do sistema.

--

--- 
