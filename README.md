<h1 align="center">Spring-Website-Scholar</h1>

![GitHub Org's stars](https://img.shields.io/github/license/Artur-Neves/Spring-IFBA-CRUD)
&nbsp;
![Badge Finalizado](http://img.shields.io/static/v1?label=STATUS&message=finalizado)

O Sistema Spring-Website-Scholar é um site de gerenciamento de alunos em uma instituição específica. Ele também inclui um sistema de login para a inicialização de sessões de usuários.

# :hammer: Funcionalidades do projeto

- **`CRUD dos Alunos`**: O sistema possui operações de criação, leitura, atualização e exclusão para a entidade aluno, sendo este devidamente mapeado e persistido no banco de dados.
- **`Geração da Matrícula do Aluno`**: O sistema incorpora a geração aleatória de uma matrícula personalizada para cada aluno.
- **`Criptografia de Senhas de Usuários`**: No processo de cadastro de um usuário no banco de dados, o sistema utiliza criptografia para proteger as senhas, garantindo a segurança dos dados pessoais.
<div align="center">
  <h2>Assista o vídeo de demonstração do projeto</h2>
<a href="https://youtu.be/M5YWqNaxFHM" target="_blank"><img src="https://i9.ytimg.com/vi_webp/M5YWqNaxFHM/mqdefault.webp?v=65b3d301&sqp=CMTw0K0G&rs=AOn4CLCuJjWcSlKGMaog3-_0P36P4aD5Qw" alt="Assista ao vídeo" width="500"></a>
  </div>
  <br>

## ✔️ Técnicas e tecnologias utilizadas

As técnicas e tecnologias utilizadas no projeto foram:

- **`Framework Spring`**: Framework open source para a plataforma Java, criado por Rod Johnson.
- **`Arquitetura MVC (Model-View-Controller)`**: Projeto arquitetural que divide a aplicação em três camadas: Model, View e Controller.
- **`POO (Programação Orientada a Objetos)`**: Paradigma que envolve o gerenciamento de classes, objetos, encapsulamento, herança e polimorfismo.
- **`Hibernate`**: Framework de mapeamento objeto-relacional (ORM) para Java.
- **`JPQL (Java Persistence Query Language)`**: É uma linguagem de consulta de objeto semelhante ao SQL, mas que opera em objetos Java, não em tabelas de banco de dados diretamente.
- **`PostgreSQL`**: Banco de dados relacional amplamente utilizado no mercado de trabalho.
- **`Thymeleaf`**: Mecanismo de template amplamente utilizado no desenvolvimento de aplicativos web com o Spring Boot.
- **`Bootstrap`**: Framework de código aberto para design responsivo de interfaces web.


# 🛠️ Abrir e rodar o projeto

**Após baixar o projeto, abra a IDE de sua preferência e siga os passos a seguir, ou assista ao vídeo anexado acima:**

- Encontre uma opção semelhante a **Open an Existing Project with Maven**.
- Localize o diretório onde o projeto está e selecione-o (se o projeto foi baixado via zip, é necessário extrair antes de procurá-lo).
- Crie um banco de dados usando o PostgreSQL.
- Atualize as informações desse banco de dados no arquivo "application.properties".
- Se estiver usando o Eclipse, vá para: Run as -> Run Configuration -> selecione o diretório do projeto e vá para "Goals" e insira: "spring-boot:run".
- Finalmente, execute o projeto e acesse pela porta 8080 no navegador da sua rede local.

