# 🚀 Projeto CRUD: Gestão de Clientes com Spring Boot e Thymeleaf

## 🎯 Descrição do Projeto

Este projeto é uma aplicação web completa desenvolvida para gerenciar cadastros de clientes, seguindo rigorosamente o padrão de arquitetura **MVC (Model-View-Controller)**. O objetivo foi criar um sistema **CRUD (Create, Read, Update, Delete)** funcional e robusto, utilizando as principais tecnologias do ecossistema Spring Boot para o desenvolvimento de aplicações Java.

### 💻 Tecnologias e Arquitetura

* **Backend Framework:** Spring Boot (MVC)
* **Persistência:** Spring Data JPA (facilita a comunicação com o banco de dados)
* **Banco de Dados:** H2 Database (configurado no modo **File** para garantir persistência dos dados entre reinicializações)
* **Template Engine (View):** Thymeleaf (utilizado para renderizar as páginas HTML dinamicamente)
* **Frontend:** Bootstrap 5 (via CDN, garantindo um layout responsivo e organizado)
* **Ferramentas:** Lombok (para reduzir código boilerplate) e Spring Validation (para validação de formulários).

### ✨ Funcionalidades Implementadas (CRUD)

O sistema permite ao usuário realizar as seguintes operações:

1.  **Listar (Read):** Exibir todos os clientes cadastrados em uma tabela organizada.
2.  **Cadastrar (Create):** Inserir novos clientes através de um formulário.
3.  **Editar (Update):** Modificar informações de clientes existentes.
4.  **Excluir (Delete):** Remover um cliente do banco de dados.
5.  **Validação:** Implementa validação básica nos formulários (campos obrigatórios, formato de e-mail, etc.).

---

## ⚙️ Passos para Executar a Aplicação

Siga estas instruções para clonar e executar o projeto em seu ambiente local.

### 1. Pré-requisitos

Certifique-se de ter os seguintes softwares instalados:
* **Java Development Kit (JDK) 17** ou superior.
* **Maven** (gerenciador de dependências).
* Uma IDE (IntelliJ IDEA, VS Code com extensões Java, ou Eclipse).

### 2. Clonar o Repositório

Abra seu terminal ou prompt de comando e clone o projeto. O URL do repositório é: **`https://github.com/krysgh/CustomerRegistration`**.

```bash
git clone [https://github.com/krysgh/CustomerRegistration](https://github.com/krysgh/CustomerRegistration)
cd CustomerRegistration
