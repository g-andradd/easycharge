# Easycharge

## Descrição
O Easycharge é um projeto que permite gerir as dívidas e cobranças dos clientes. Ele oferece um CRUD (Create, Read, Update, Delete) para clientes e suas dívidas, e tem como objetivo integrar o envio de e-mails e SMS para cobranças e notificações aos clientes, além de verificar o status de pagamento das dívidas.

## Tecnologias
- Java
- Spring Framework
- Docker
- AWS (Amazon Web Services)
- Actuator
- Banco de dados MySQL

## Pré-requisitos
- Java JDK 8 ou superior instalado
- Docker instalado
- Conta na AWS (caso queira usar seus serviços)

## Configuração e Instalação
1. Clone o repositório do Easycharge:
git clone https://github.com/seu-usuario/easycharge.git

2. Acesse o diretório do projeto:
cd easycharge

3. Configure as informações de conexão com o banco de dados no arquivo `application.properties`.

4. Construa a imagem Docker do projeto:
docker build -t easycharge .

5. Execute o container Docker:
docker run -p 8080:8080 easycharge

## Instruções de Uso
1. Acesse a API do Easycharge em `http://localhost:8080`.

2. Utilize as rotas disponíveis para interagir com o sistema. Exemplos:
- **GET /clientes**: Retorna todos os clientes cadastrados.
- **POST /clientes**: Cria um novo cliente.
- **GET /dividas**: Retorna todas as dívidas cadastradas.
- **POST /dividas**: Cria uma nova dívida.

## Dependências Externas
O Easycharge depende das seguintes bibliotecas ou frameworks externos:
- Spring Boot
- Spring Data JPA
- MySQL Connector
- Docker
