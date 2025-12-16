# SGHSS - Sistema de Gestão Hospitalar Simplificado (Backend)

Projeto desenvolvido como trabalho acadêmico do curso de Análise e Desenvolvimento de Sistemas (ADS).

## 📌 Descrição
O SGHSS é uma API REST desenvolvida em Java com Spring Boot, com o objetivo de realizar o gerenciamento básico de pacientes e consultas médicas, servindo como um MVP de um sistema de gestão hospitalar.

## 🛠 Tecnologias Utilizadas
- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
- Postman

## 🏗 Arquitetura
O projeto segue o padrão de arquitetura em camadas:
- Controller
- Service
- Repository
- Entity

## ⚙️ Como Executar o Projeto

### Pré-requisitos
- Java 17
- Maven ou Maven Wrapper

### Execução
./mvnw spring-boot:run

A aplicação será iniciada em:
http://localhost:8080

## Endpoints Principais
Pacientes

POST /pacientes – Cadastrar paciente
GET /pacientes – Listar pacientes
PUT /pacientes/id - Atualizar paciente
DELETE /pacientes/id - Deletar paciente

Consultas
POST /consultas – Agendar consulta
GET /consultas – Listar consultas

### Testes
Os endpoints foram testados utilizando a ferramenta Postman.

## Observações
Projeto desenvolvido exclusivamente para fins acadêmicos.



```bash
./mvnw spring-boot:run
