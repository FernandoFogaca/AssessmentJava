# API REST com Javalin

## Descrição (Português)

Este projeto foi desenvolvido como parte de uma atividade acadêmica com o objetivo de criar uma API REST em Java utilizando o framework Javalin.

A aplicação implementa endpoints básicos para requisições HTTP e um pequeno cadastro de usuários armazenado em memória. O foco foi entender o funcionamento de APIs REST, organização do código e consumo de serviços.

---

## Tecnologias utilizadas

- Java 17  
- Javalin  
- Gson  
- HttpURLConnection  

---

## Execução

1. Abra o projeto na IDE (Eclipse ou similar)
2. Execute a classe `App.java`
3. O servidor será iniciado na porta 7001

Acesse no navegador:
http://localhost:7001/hello

---

## Endpoints

GET /hello  
Retorna uma mensagem simples.

GET /status  
Retorna o status da aplicação com data e hora atual.

POST /echo  
Recebe um JSON e retorna o mesmo conteúdo.

GET /saudacao/{nome}  
Retorna uma mensagem personalizada com o nome informado.

POST /usuarios  
Adiciona um novo usuário à lista em memória.

Exemplo de JSON:
{
  "nome": "Fernando",
  "email": "fernando@email.com",
  "idade": 30
}

GET /usuarios  
Retorna todos os usuários cadastrados.

GET /usuarios/{email}  
Busca um usuário pelo email.  
Retorna 404 caso não exista.

---

## Testes

Foi criado um cliente simples em Java para testar os endpoints utilizando HttpURLConnection.

Os testes incluem:
- requisições GET
- envio de dados via POST
- leitura das respostas da API

---

## Observações

- Os dados não são persistidos
- Não há integração com banco de dados
- Projeto com finalidade educacional

---

## Description (English - British)

This project was developed as part of an academic assignment with the aim of building a REST API in Java using the Javalin framework.

The application implements basic HTTP endpoints and a simple in-memory user registry. The main goal was to understand REST concepts, code organisation, and API consumption.

---

## Technologies

- Java 17  
- Javalin  
- Gson  
- HttpURLConnection  

---

## How to run

1. Open the project in your IDE (Eclipse or similar)
2. Run the `App.java` class
3. The server will start on port 7001

Access:
http://localhost:7001/hello

---

## Endpoints

GET /hello  
Returns a simple message.

GET /status  
Returns the application status with current timestamp.

POST /echo  
Receives a JSON and returns the same content.

GET /saudacao/{nome}  
Returns a personalised message using the provided name.

POST /usuarios  
Creates a new user in memory.

Example:
{
  "nome": "Fernando",
  "email": "fernando@email.com",
  "idade": 30
}

GET /usuarios  
Returns all registered users.

GET /usuarios/{email}  
Searches for a user by email.  
Returns 404 if not found.

---

## Testing

A simple Java client using HttpURLConnection was created to test the API endpoints.

It performs:
- GET requests
- POST requests
- response handling

---

## Notes

- Data is stored in memory only
- No database is used
- This project is intended for learning purposes
