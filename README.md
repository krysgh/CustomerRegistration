# 🚀 Projeto CRUD: Gestão de Clientes com Spring Boot e Thymeleaf

## 🎯 Descrição do Projeto

Este projeto é uma aplicação web completa desenvolvida para gerenciar cadastros de clientes, seguindo rigorosamente o padrão de arquitetura **MVC (Model-View-Controller)**. O objetivo foi criar um sistema **CRUD (Create, Read, Update, Delete)** funcional e robusto, utilizando as principais tecnologias do ecossistema Spring Boot.

### 💻 Tecnologias e Arquitetura

* **Backend Framework:** Spring Boot (MVC)
* **Persistência:** Spring Data JPA
* **Banco de Dados:** H2 Database (modo File para persistência)
* **Template Engine (View):** Thymeleaf
* **Frontend:** Bootstrap 5 (Layout responsivo)
* **Ferramentas:** Lombok e Spring Validation.

### ✨ Funcionalidades Implementadas

O sistema implementa o ciclo de vida completo do cadastro (CRUD): **Listar, Cadastrar, Editar** e **Excluir** clientes, com validação básica nos formulários.

---

## ⚙️ Passos para Executar a Aplicação

Siga estas instruções para configurar e iniciar a aplicação em seu ambiente local.

### 1. Pré-requisitos

Certifique-se de ter os seguintes softwares instalados:
* **Java Development Kit (JDK) 17** ou superior.
* **Maven** (gerenciador de dependências).
* Uma IDE (IntelliJ IDEA, VS Code ou Eclipse).

### 2. Clonar o Repositório

Abra seu terminal e clone o projeto. O URL do repositório é: `https://github.com/krysgh/CustomerRegistration`.

```bash
git clone [https://github.com/krysgh/CustomerRegistration](https://github.com/krysgh/CustomerRegistration)
cd CustomerRegistration
```

### 3\. Configuração e Abertura na IDE

1.  Abra a pasta clonada na sua IDE. A IDE irá reconhecer o projeto Maven (`crud-thymeleaf-springboot`) e baixar as dependências.
2.  **Configuração de Lombok (Importante):** Nas configurações da sua IDE, certifique-se de que o **Processamento de Anotações (Annotation Processing)** esteja **habilitado** para que o Lombok funcione.

### 4\. Iniciar o Servidor Spring Boot

A aplicação pode ser iniciada de duas maneiras:

#### A. Início via IDE (Recomendado)

1.  Localize a classe principal da aplicação (aquela com a anotação `@SpringBootApplication`).
2.  Clique com o botão direito e selecione a opção **Run** (Executar).

#### B. Início via Linha de Comando (Maven)

1.  Compile e empacote o projeto:
    ```bash
    ./mvnw clean package
    ```
2.  Execute o arquivo JAR gerado:
    ```bash
    java -jar target/crud-thymeleaf-springboot-0.0.1-SNAPSHOT.jar 
    ```

### 5\. Acessar o Sistema

Após o servidor iniciar com sucesso (a porta padrão é 8080):

* Abra seu navegador e acesse a URL da listagem de clientes:

$$\text{http://localhost:8080/clientes}$$

---

## 📸 Prints das Telas Principais

Aqui estão algumas capturas de tela das funcionalidades implementadas no sistema:

### 1. Tela de Listagem de Clientes (Vazia)
Representa a tela inicial quando não há clientes cadastrados.
http://googleusercontent.com/image_generation_content/1
