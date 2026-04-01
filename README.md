# User Service

## Descrição
Microsserviço responsável pelo gerenciamento de usuários (clientes) do sistema. Permite cadastrar e consultar informações de usuários.

## Pré-requisitos
- JDK 21
- Maven 3.8+
- MongoDB rodando na porta 27017

## Como Executar

1. Navegue até o diretório do serviço:
```bash
cd user-service
```

2. Execute o serviço:
```bash
mvn spring-boot:run
```

## Porta Utilizada
**8082**

## Endpoints

- `POST /user` - Cadastrar novo usuário
- `GET /user/{id}` - Buscar usuário por ID

## Banco de Dados
- Database: `user_db`
- Collection: `users`
