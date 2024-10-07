Apirest

Descrição
O Apirest é uma API RESTful desenvolvida em Spring Boot para o gerenciamento de produtos. O projeto permite a criação, leitura, atualização e exclusão de produtos,
integrando-se ao banco de dados PostgreSQL. A API está documentada utilizando Swagger/OpenAPI, facilitando a exploração e o uso das suas funcionalidades.

Estrutura do Projeto
O projeto é composto pelas seguintes classes principais:

ApirestApplication.java: Classe principal que inicializa a aplicação Spring Boot.
Produto.java: Modelo que representa os produtos.
ProdutoRepository.java: Interface de repositório que estende JpaRepository, responsável pela interação com o banco de dados.
ProdutoResource.java: Controlador REST que gerencia as requisições relacionadas aos produtos.
SwaggerConfig.java: Configuração para habilitar a documentação Swagger da API.

Funcionalidades
Criar um novo produto.
Listar todos os produtos.
Buscar um produto por ID.
Atualizar os dados de um produto.
Remover um produto.
Tecnologias Utilizadas
Java 17
Spring Boot 3.3.4
Spring Data JPA: Para interações com o banco de dados.
PostgreSQL: Banco de dados relacional.
Swagger/OpenAPI: Para documentação interativa da API.
JUnit: Para testes automatizados.

Como Executar o Projeto
Clone o repositório:
git clone https://github.com/USERNAME/apirest.git

Navegue até o diretório do projeto:
cd apirest

Configure o banco de dados PostgreSQL no arquivo application.properties. Exemplo:
spring.datasource.url=jdbc:postgresql://localhost:5432/seubancodedados
spring.datasource.username=seuusuario
spring.datasource.password=suasenha

Execute o projeto utilizando Maven:
mvn spring-boot:run

Acesse a API no seguinte endereço:
http://localhost:8080

Para visualizar a documentação da API com Swagger:
http://localhost:8080/swagger-ui.html

Endpoints da API
GET /api/produtos: Retorna todos os produtos.
POST /api/produtos: Adiciona um novo produto.
GET /api/produtos/{id}: Busca um produto pelo ID.
PUT /api/produtos/{id}: Atualiza um produto existente.
DELETE /api/produtos/{id}: Remove um produto pelo ID.

Testes
Os testes estão localizados no diretório src/test/java. Para executar os testes, use o seguinte comando:
mvn test

Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

Licença
Este projeto é licenciado sob a licença MIT.
